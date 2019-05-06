package com.flyweight.demo;

public class Rectangle implements Shape {
	private String color;
	private int length;
	private int width;
	
	public Rectangle(String color) {
		this.color=color;
	}
	
	public void createShape() {
		System.out.println("Rectangle created with following properties");
		System.out.println("Color " +color);
		System.out.println("Length " +length);
		System.out.println("Width " +width);
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length=length;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
}
