package com.javaex.ex04;

public class User {
	
	//Field
	protected String id;
	protected String password;
	protected String name;
	
	//Constructor
	
	public User() {
		
	}

	public User(String id, String password, String name) {
		
		this.id = id;
		this.password = password;
		this.name = name;
	}

	
	//Method - g/s
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Method - Ordinary
	
	public void showInfo() {

	}
	
}
