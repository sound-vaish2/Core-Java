package com.vs.java.basics;
//A toString() is an in-built method in Java that returns the value given to it in string format.
//Hence, any object that this method is applied on, will then be returned as a string object.
import java.util.Scanner;

public class ImpStringMethod {
	String Name;
	int id;
	public ImpStringMethod(String name, int id) {
		this.Name = name;
		this.id = id;
		
	}
	
	@Override
	public String toString() {
		return "Name :" + Name + "\n" + "id :" + id ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ImpStringMethod person = new ImpStringMethod(sc.next(),sc.nextInt());
		sc.close();
		System.out.println(person);
		//another example
		System.out.println("Another Example");  
		Integer x = 5;
		System.out.println(x.toString());  
	    System.out.println(Integer.toString(12));


	}

}
