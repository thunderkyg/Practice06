package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성
	//Field
	private String department;

	
	//Constructor

	public Depart() {
		
	}
	
	public Depart(String department) {
		super();
		this.department = department;
	}


	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	//Method - G/S
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	//Method - Ordinary
	public void showInformation() {
		System.out.println("이름: " + super.getName() + " 연봉: " + super.getSalary() + " 부서: " + department);
	}
	
}
