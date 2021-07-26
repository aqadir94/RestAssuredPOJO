package com.test;

import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJOs.Body;

import POJOs.CollectionRequest;

import POJOs.CollectionRootRequest;
import POJOs.CollectionRootResponse;
import POJOs.HeaderInner;
import POJOs.Info;
import POJOs.ItemmRequest;
import POJOs.ItemmResponse;
import POJOs.ItemsdfRequest;
import POJOs.ItemsdfResponse;
import POJOs.RequestRequest;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.hamcrest.number.IsNaN;
import org.skyscreamer.jsonassert.Customization;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.ValueMatcher;
import org.skyscreamer.jsonassert.comparator.CustomComparator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.config.LogConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import io.restassured.http.Headers;
import io.restassured.internal.ResponseSpecificationImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.specification.SpecificationQuerier;

//import io.restassured.RestAssured;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class RestTestComplexPOJO {

	// RequestSpecification requestSpecification;
	// ResponseSpecification responseSpecification;

	@BeforeClass
	public void beforeClass() throws Exception {

		RequestSpecBuilder req = new RequestSpecBuilder();
		ResponseSpecBuilder res = new ResponseSpecBuilder();

		req.setBaseUri("https://api.getpostman.com")
				.addHeader("x-api-key", "PMAK-60f95b1d636fbc003bb01128-7e6729b2490997e8b1a10279d36b10c0eb")
				.addHeader("Content-Type", "application/json").log(LogDetail.ALL);

		RestAssured.requestSpecification = req.build();

		res.log(LogDetail.ALL);
		res.expectContentType("application/json; charset=utf-8");

		RestAssured.responseSpecification = res.build();
	}

	@Test()
	public void test() throws Exception {

		Body body = new Body("raw", "{\"data\": \"123\"}");
		HeaderInner header = new HeaderInner("Content-Type", "application/json");
		ArrayList<HeaderInner> headerInner = new ArrayList<>();
		headerInner.add(header);

		RequestRequest request = new RequestRequest("https://postman-echo.com/post", "POST", headerInner, body,
				"This is a sample POST Request");

		ItemsdfRequest itemInner = new ItemsdfRequest("This is a folder", request);

		ArrayList<ItemsdfRequest> itemInnerObj = new ArrayList<>();
		itemInnerObj.add(itemInner);
		ItemmRequest item = new ItemmRequest("gobba", itemInnerObj);

		Info info = new Info("Sample Collection", "This is just a sample collection",
				"https://schema.getpostman.com/json/collection/v2.1.0/collection.json");

		ArrayList<ItemmRequest> itemObj = new ArrayList<>();
		itemObj.add(item);

		CollectionRequest collection = new CollectionRequest(info, itemObj);

		CollectionRootRequest collectionRoot = new CollectionRootRequest(collection);

		String uid = given().body(collectionRoot).when().post("collections").then().log().all().extract().response()
				.path("collection.uid").toString();

		CollectionRootResponse deserialized = given().pathParam("uid", uid).when().get("collections/{uid}").then().log()
				.all().extract().as(CollectionRootResponse.class);

		

		ObjectMapper obj = new ObjectMapper();
		String expectedJson = obj.writeValueAsString(collectionRoot);
		String actualJson = obj.writeValueAsString(deserialized);


		 JSONAssert.assertEquals(expectedJson, actualJson, new
		 CustomComparator(JSONCompareMode.LENIENT, new
		 Customization("collection.item[*].item[*].request.url", new
		 ValueMatcher<Object>() { public boolean equal(Object o1,Object o2) { return
		 true;
		 
		  } })));
		 
		 ArrayList<String> requestUrls= new ArrayList<>();
		 
			/*
			 * for(int i=0;i<itemInnerObj.size();i++) {
			 * 
			 * System.out.println(itemInnerObj.get(i).getRequest().getUrl()); }
			 */
			
			 for(ItemsdfRequest ii:itemInnerObj) {
			 
			  requestUrls.add(ii.getRequest().getUrl());
			  
			 
			  }
			 
		 
			 ArrayList<String> responseUrls= new ArrayList<>();
		 
		 for(ItemmResponse iit:deserialized.getCollection().getItem()) {
			 
		for(ItemsdfResponse sdf: iit.getItem()){
				
			responseUrls.add(sdf.getRequest().getUrl().getRaw());
			
			}
			 
		 }
		 
		 assertThat(requestUrls, containsInAnyOrder(responseUrls.toArray()));
	}

}
