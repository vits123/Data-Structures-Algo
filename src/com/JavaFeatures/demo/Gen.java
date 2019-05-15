/*
 * Demonstrate a raw type
 */

package com.JavaFeatures.demo;

public class Gen<T> {

	T ob;
	
	Gen(T o){
		ob=o;
	}
	
	T getob() {
		return ob;
	}
	
}


class RawDemo{
	public static void main(String args[]) {
		Gen<Integer> iob=new Gen<Integer>(88);
		Gen<String> strob=new Gen<String>("Generics Test");
		
		Gen raw= new Gen(new Double(98.6));
		
		double d= (Double) raw.getob();  // cast is necessary
		System.out.println("val "+d);
		
//		int i= (Integer) raw.getob();
		
	//strob=raw;   //  OK, but potentially wrong
		//String str=strob.getob();   // run-time error

		//raw=iob;   // Ok, but potentially wrong
	}
}