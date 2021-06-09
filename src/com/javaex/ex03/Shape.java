package com.javaex.ex03;

public class Shape {

	//Field
	
	protected String fillColor;
	protected String lineColor;
	
	//Constructor
	
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//Method - G/S
	
	public String getFillColor() {
		return fillColor;
	}
	
	public String getLineColor() {
		return lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	//Method - Ordinary
	
	public void showInfo() {
		
	}

}

