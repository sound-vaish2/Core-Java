package com.vs.java.basics;

import java.util.Scanner;

//no need to import
//String Methods
//import java.util.stream.*;
public class StringHandling {
	//String  = "john";
	
	public StringHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("joseph");
		buffer.append(" joey");
		System.out.println(buffer);
		String str = "hello";
		Scanner sc = new Scanner(System.in);
		String InputString;
		InputString = sc.nextLine();
		//return length
		System.out.println(InputString.length());
		//return character at given index
		System.out.println(InputString.charAt(2));
		//return total sum of both given string
		System.out.println(InputString.compareTo(str));
		//return boolean value after compares
		System.out.println(InputString.equals(str));
		//return the hashcode
		System.out.println(InputString.hashCode());
		//return the substring
		System.out.println(InputString.substring(1,1));
		System.out.println(InputString.replace(InputString.substring(1,1), InputString.substring(4,4)));
		//replace the substring with new string
		System.out.println(InputString.replaceAll("aish","hello"));
		//other method
		System.out.println(InputString.replaceAll(InputString.substring(2,5),"hello"));
		//split
		System.out.println(InputString.split(InputString));
		//returns string in Uppercase
		System.out.println(InputString.toUpperCase());
		//replace alternate characters with uppercase
		char Au = InputString.charAt(0);
		
		System.out.println(InputString.charAt(0)+ InputString.substring(1,InputString.length()));
		char[] ch =  InputString.toCharArray();
		for(int i=0; i<ch.length; i=i+2){
	         ch[i] = Character.toUpperCase(ch[i]);
	      }
	    System.out.println(new String(ch));
		//System.out.println();
		
	}

}
