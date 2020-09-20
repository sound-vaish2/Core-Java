package com.vs.java.ExceptionHandling;
//Exception example
public class ExceptionExample {
	public ExceptionExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int d = 2;
		
		try {
			a = 27/d;
			System.out.println("print the result " + a);
		}
		catch(ArithmeticException e){
			System.out.println("Division by 0");
			
		}
		finally {
			System.err.println("this is finally block"); //.err gives red color
		}
	}

}
