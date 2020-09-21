package com.vs.java.person;

import java.util.ArrayList;

public class EmployeeClass<E> {
	String first_name;
	String last_name;
	String gender;
	int age;
	int weight;
	
	
	public EmployeeClass() {
		
	}
	

	public EmployeeClass(String first_name2, String last_name2, String gender2, int age2) {
		// TODO Auto-generated constructor stub
	}


	public void EmployeeClass(String first_name, String last_name, String gender, int age) {
		// TODO Auto-generated method stub
		//super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.age = age;
		addValues(first_name,  last_name,  gender,  age);
		
	}
	public void addValues(String first_name,  String last_name,  String gender, int age) {
		ArrayList<EmployeeClass> details = new ArrayList<EmployeeClass>();
		details.add(new EmployeeClass(first_name,last_name,gender,age));
		System.out.println(details.get(0));
	}
	@Override
	public String toString() {
		return "FirstName : " + first_name + "\n" + "LastName : " + last_name + "\n" + "age : " + age + "\n" + "gender : " + gender;
	}
	
}
