package com.vs.java.StringManipulation;
import java.util.*;
public class StringFunctions {

	public static void main(String[] args) {
		//String
		String str = "hello world";
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.charAt(4));
		String str2 = "world";
		String str3 = "world";
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
		//Compares two strings lexicographically
		System.out.println(str.compareTo(str2));
		
		

	}

}
