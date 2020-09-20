package com.vs.java.polymorphism;

public class MethodOverloadingExample {
	int num1;
	int num2;
	String name;
	public MethodOverloadingExample() {
		// TODO Auto-generated constructor stub
	}
	//method overloading -- same names but different function signatures
	//function signatures can differ in :
	//order of parameters,number of parameters,types of parameters
	public void MethodA(int num1,int num2) {
		System.out.println("addition of numbers:");
		System.out.println(num1+num2);
		
	}
	public void MethodA(int num1 , String name) {
		System.out.println("Concatination of string and number:");
		System.out.println(name + num1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.MethodA(45, 65);
		obj.MethodA(23 , "hello wOrld ");
	}

}
