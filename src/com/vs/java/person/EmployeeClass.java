package com.vs.java.person;

import java.util.Arrays;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeClass {
	String first_name ;
	String last_name;
	String gender;
	int age;
	int weight;
	//Array
	
	
	
	public void EmployeeClass(String first_name, String last_name, String gender, int age) {
		// TODO Auto-generated method stub
		//super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.age = age;
		addValues(first_name,last_name,gender,age);
	
	}
	
	
	private void addValues(String first_name, String last_name, String gender, int age) {
		// TODO Auto-generated method stub
		ArrayList<String> FirstName = new ArrayList<String>();
		ArrayList<String> LastName = new ArrayList<String>();
		ArrayList<String>  Gender = new ArrayList<String>();
		ArrayList<Integer> Age = new ArrayList<Integer>();
		
		FirstName.add(first_name);
		LastName.add(last_name);
		Gender.add(gender);
		Age.add(age);
		FirstName.get(0);
		//PrintValues(FirstName,LastName,Gender,Age);
		}

//	public void addValues(String first_name[], String last_name[], String gender[], int age[],int count, Object[] String) {
//		ArrayList<EmployeeClass> details = new ArrayList<EmployeeClass>();
//		details.add(new EmployeeClass( first_name[count],  last_name[count],  gender[count], age[count]));
//	}
//	public void addValues(String first_name[], String last_name[], String gender[], int age[],int No_Of_Emp, Object[] String) {
//		ArrayList<EmployeeClass> details = new ArrayList<EmployeeClass>();
//		for(int i=0 ;i<No_Of_Emp ; i++)
//		{
//			//System.out.println(first_name[i]);
//			details.add(new EmployeeClass( first_name[i],  last_name[i],  gender[i], age[i]));
//		}
//	}
//	public void Print() {
//		for(int i=0 ;i<first_name.length ; i++)
//		{
//			System.out.println(first_name[i]);
//		}
//	}
	//ArrayList<EmployeeClass> details = new ArrayList<EmployeeClass>();
//	
//	@Override
//	public String toString() {
//		return "EmployeeClass [first_name=" + Arrays.toString(first_name) + "]";
//	}
	
}
