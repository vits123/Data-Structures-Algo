package com.designpattern.demo;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String,Rectangle> rectangleMap=new HashMap<String, Rectangle>();
	
	public static Shape getCircle(String color) {
		Rectangle rec=(Rectangle)rectangleMap.get(color);
		
		if(rec==null) {
			rec=new Rectangle(color);
			rectangleMap.put(color, rec);
			System.out.println("Creating circle of color: "+color);
		}
		return rec;
	}

}
