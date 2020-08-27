package com.edu.entity;

public class Triangle extends Shape {

	@Override
	public void ViewSizw() {
		System.out.println(getTitle()+"의 넓이: "+(getWidth()*getHeight())/2);
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(String title, int width, int height) {
		super(title, width, height);
		// TODO Auto-generated constructor stub
	}
	
	

}
