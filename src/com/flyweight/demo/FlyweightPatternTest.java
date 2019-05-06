// Flyweight design pattern



package com.flyweight.demo;

public class FlyweightPatternTest {
	
	private static final String colors[]= {"Red","Green","Blue"};
	private static String getRandomColor() {
		return colors[(int) (Math.random()*colors.length)];
		
	}
	
	private static int getRandomLength() {
		return (int) (Math.random()*100);
	}
	
	private static int getRandomWeight() {
		return (int)(Math.random()*100);
	}
	
	public static void main(String args[]) {
		for(int i=0;i<10;++i) {
			Rectangle rec=(Rectangle)ShapeFactory.getCircle(getRandomColor());
			rec.setLength(getRandomLength());
			rec.setWidth(getRandomWeight());
			rec.createShape();
		}
	}

}

// Output

/*
 Creating circle of color: Green
Rectangle created with following properties
Color Green
Length 27
Width 35
Creating circle of color: Red
Rectangle created with following properties
Color Red
Length 1
Width 86
Creating circle of color: Blue
Rectangle created with following properties
Color Blue
Length 72
Width 35
Rectangle created with following properties
Color Green
Length 34
Width 27
Rectangle created with following properties
Color Blue
Length 45
Width 0
Rectangle created with following properties
Color Blue
Length 99
Width 32
Rectangle created with following properties
Color Green
Length 63
Width 86
Rectangle created with following properties
Color Blue
Length 88
Width 17
Rectangle created with following properties
Color Green
Length 93
Width 5
Rectangle created with following properties
Color Red
Length 11
Width 21

 */




