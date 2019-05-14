
/*
    A generic interface example
*/

package com.JavaFeatures.demo;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {

	T[] vals;
	
	MyClass( T[] o){
		vals=o;
	}
	
		
	@Override
	public T min() {
		T v= vals[0];
		for(int i=1;i<vals.length;i++) {
			if(vals[i].compareTo(v) < 0 )
				v=vals[i];
		}
		return v;
	}

	
	@Override
	public T max() {
		T v= vals[0];
		
		for(int i=1;i<vals.length;i++)
			if(vals[i].compareTo(v) > 0 )
				v= vals[i];
		return v;
	}
	
}

class GenIDemo{
	public static void main(String args[]) {
		Integer inums[]= {3,6,2,8,6};
		Character chs[]= {'b','r','p','w'};
		
		
		MyClass<Integer> iob= new MyClass<Integer>(inums);
		MyClass<Character> cob=new MyClass<Character>(chs);
		
		System.out.println("max value in inums "+iob.max());
		System.out.println("min value in inums "+iob.min());
		System.out.println("max value in chs "+cob.max());
		System.out.println("min value in chs "+cob.min());
	}
}

/*
  	max value in inums 8
	min value in inums 2
	max value in chs w
	min value in chs b

 */








