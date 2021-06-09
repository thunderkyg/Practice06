package com.javaex.ex01;

public class Customer extends Person{
	
	
	//Field
	
	private int cNo;
	private int point;
	
	//Constructor
	
	public Customer() {
		
	}
	
	public Customer(int cNo, int point) {
		super();
		this.cNo = cNo;
		this.point = point;
	}
	
	public Customer (String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	//Method - G/S
	
	public int getcNo() {
		return cNo;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//Method - Ordinary
	
	public void showInfo() {
		System.out.println("#이름: " + name + ", #헨드폰: " + hp + ", #고객번호: " + cNo + "#포인트점수: " + point);
	}
	
}
