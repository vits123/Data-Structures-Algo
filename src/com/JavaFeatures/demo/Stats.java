/*
 * Use of wildcard argument of Java Generics to compare avg of 2 Stats<T> objects 
 * 
 * 
 */


package com.JavaFeatures.demo;

public class Stats<T extends Number> {

	  T[] nums;      // nums[] declaration 
	
	public Stats(T[] o) {
		nums=o;
	}
	
	public double average() {
		double sum=0.0;
		
		for(int i=0;i<nums.length;i++) {
			sum+= nums[i].doubleValue();
		}
		return sum/nums.length;
		
	}
	
	// Method to compare avg of 2 diff objects
	public boolean sameAvg(Stats<?> ob) {
		if(average()==ob.average())
			return true;
		return false;
	}
	
}

class wildcardDemo{
	public static void main(String args[]) {
		
		//Integer object
		
		Integer inums[]= {1,2,3,4,5};
		Stats<Integer> iob=new Stats<Integer>(inums);
		double v=iob.average();
		System.out.println("iob average is "+v);
		
		
		//Double object
		
		Double dnums[]= {1.1,2.2,3.3,4.4,5.5};
		Stats<Double> dob=new Stats<Double>(dnums);
		double w=dob.average();
		
		System.out.println("dob average is "+w);
		
		
		//Float object
		
		Float fnums[]= {1.0F,2.0F,3.0F,4.0F,5.0F};
		Stats<Float> fob=new Stats<Float>(fnums);
		double x=fob.average();
		
		System.out.println("fob average is "+x);
		
		
		System.out.println("Average of iob and dob");
		 if(iob.sameAvg(dob)) {
			 System.out.println("iob and dob avg are same");
		 }else {
			 System.out.println("avg differ");
		 }
		
		System.out.println("Average of iob and fob");
		if(iob.sameAvg(fob))
			System.out.println("iob and fob avg are same");
		else
			System.out.println("iob and fob differ");
		
	}
}
/*
  	iob average is 3.0
	dob average is 3.3
	fob average is 3.0
	Average of iob and dob
	avg differ
	Average of iob and fob
	iob and fob avg are same

 * 
 */










