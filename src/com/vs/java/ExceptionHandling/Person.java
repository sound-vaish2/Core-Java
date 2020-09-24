package com.vs.java.ExceptionHandling;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public int Persondetails(int age) throws AgeException{
		
		if(age<18)
		{
			throw new AgeException("Your Age must greater than 18");
		}
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Person person = new Person();
		person.name = sc.nextLine();
		person.age = sc.nextInt();
		sc.close();
		
		try {
			int res = person.Persondetails(person.age);
			System.out.println("Name : " + person.name);
			System.out.println("Age : " + res);
		}
		catch(AgeException e){
			System.err.println(e.getMessage());
			System.err.println("try in next " + (18-person.age) + " year");
		}
	}

}
