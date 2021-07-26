package com.test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value="name",allowGetters  =true)
public class Root {
	
	private String name;
	private String userName;
	private String email;
	private Address adress;

	private int id;
	
	
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public Root() {

	}
	
	
	
	
	
	public Root(String name, String userName, String email, Address adress) {
		super();
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.adress = adress;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	
	
	

}
