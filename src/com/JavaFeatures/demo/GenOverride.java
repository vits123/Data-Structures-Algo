
/*  Overriding methods in generic class   */

package com.JavaFeatures.demo;

public class GenOverride<T> {

	T ob;
	
	GenOverride(T o){
		ob=o;
	}
	
	T getob() {
		return ob;
	}
}

class GenOver<T> extends GenOverride<T>{
	
	GenOver(T o){
		super(o);
	}
	
	T getob() {
		System.out.println("Genover's getob() ");
		return ob;
	}
	
}




class OverrideDemo{
	public static void main(String args[]) {
		GenOverride<Integer> iob=new GenOverride<Integer>(88);
		
		GenOver<Integer> iob2=new GenOver<Integer>(99);
		
		GenOver<String> genoverobj=new GenOver<String>("Generics Test ");
		
		System.out.println(iob.getob());
		System.out.println(iob2.getob());
		System.out.println(genoverobj.getob());
	}
}

/*
  		88
		Genover's getob() 
		99
		Genover's getob() 
		Generics Test 
 */








