package com.JavaFeatures.demo;

public class LambdaDemo {

	public static void main(String[] args) {
		MyNumber myNum;
		myNum = ()-> 123.45;
		System.out.println("A fixed value "+myNum.getValue());
		
		myNum = ()-> Math.random() * 100;
		System.out.println("A random value "+myNum.getValue());
		System.out.println("Another random value "+myNum.getValue());
		
		//myNum = () -> "123.045";   		// Won't work: Type Mismatch
		
	}
}

/*
  	A fixed value 123.45
	A random value 66.10539729037279
	Another random value 86.96448554767998

  
 */
