package com.javaex.ex03;

public class Triangle extends Shape{
	
	//Field
	private int width;
	private int height;
	
	//Constructor
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//Method - G/S
	
	public void showInfo() {
		System.out.println("====삼각형====");
		System.out.println("#면색:" + fillColor);
		System.out.println("#선색:" + lineColor);
		System.out.println("#가로:" + width);
		System.out.println("#새로:" + height);
	}
	
	
	
	
}


