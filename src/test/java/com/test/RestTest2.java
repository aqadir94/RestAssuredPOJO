package com.test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.config.LogConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.internal.ResponseSpecificationImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.specification.SpecificationQuerier;

//import io.restassured.RestAssured;

public class RestTest2 {

	// RequestSpecification requestSpecification;
//	 ResponseSpecification responseSpecification;

	@BeforeClass
	public void beforeClass() {
		
		
	
//https://raw.githubusercontent.com/appium/appium/master/sample-code/apps/ApiDemos-debug.apk
	}

	@Test
	public void test() {
	
		
	 given().baseUri(
			 "https://api.postman.com").header("X-Api-Key","PMAK-60d3b13a5f97d000357f8561-f11d8a68414214541e08055087a29f1ec4")
	
	 .log().all().when().get("workspaces/4f35d628-ef0e-418a-88b2-b5c2035b879c").then().log().all().body(matchesJsonSchemaInClasspath("Echoget.json"));
	 
	 
	 //
	 
	


	}

}
