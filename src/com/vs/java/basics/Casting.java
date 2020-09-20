package com.vs.java.basics;

public class Casting {
	
	//numeric values and char/boolean are not compatible with each other
	//String s,
	//s = (String)n ;

	
	public Casting() {
		// TODO Auto-generated constructor stub
	}
	  
	public static void main(String[] args) {
		int num1 = 5;
		float num2 = 9;
		//implicit type casting
		num2 = num1;
		System.out.println(num2);
		//explicit type casting
		byte b = (byte)num1;
		System.out.println(b);
	}

}
