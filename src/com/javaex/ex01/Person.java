package com.javaex.ex01;

public class Person {
	
	//Field
	protected String name;
	protected String hp;
	
	//Constructor

	public Person() {
		
	}
	
	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	
	//Method- get/set
	
	public String getName() {
		return name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	//Method - Ordinary
	
	public void showInfo() {
		System.out.println("#이름: " + name + ", #헨드폰: " + hp);
	}
	
	
}
