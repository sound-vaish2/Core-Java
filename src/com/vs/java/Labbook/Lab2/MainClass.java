package com.vs.java.Labbook.Lab2;

import java.util.Scanner;

public class MainClass {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonClass person = new PersonClass(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextFloat(),sc.nextLong());
		
		
		
		sc.close();
//		System.out.println(person.getFirstName());
//		System.out.println(person.getLastName());
//		System.out.println(person.getAge());
//		System.out.println(person.getGender());
//		System.out.println(person.getWeight());
		System.out.println(person);
		
		
	

	}

	

}
