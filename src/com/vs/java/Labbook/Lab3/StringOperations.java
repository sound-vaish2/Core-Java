package com.vs.java.Labbook.Lab3;

import java.util.Scanner;

public class StringOperations {

	public StringOperations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String InputString;
		InputString = sc.nextLine();
//		char[] Ch = new char[InputString.length()];
//		for(int i=0 ; i<InputString.length(); i++)
//		{
//			Ch[i] = InputString.charAt(i);
//			
//		}//Array
		System.out.println("Enter your Choice: ");
		System.out.println("1. Add string to itself" + "\n" + "2. Replace odd position with #" + "\n"+ "3. Remove duplicate characters" + "\n" + "4. Change odd characters to uppercase");
		int InputChoice = sc.nextInt();
		switch(InputChoice){
			case 1: {
				StringBuffer sb = new StringBuffer(InputString);	
				System.out.println(sb.append(InputString));
			}
			case 2: {
				for(int i=0;i<InputString.length();i++) {
					if(i%2 != 0)
					{
						InputString = InputString.substring(0,i-1) + "#" + InputString.substring(i, InputString.length());
					//	InputString = InputString.replace(InputString.substring(i,i), "#")+ InputString.substring(i+1,InputString.length());
					}//InputString.substring(0,i)+ 
				}
				System.out.println(InputString);
			}
			case 3:{
				for(int i=0;i<InputString.length();i=i+2) {
						InputString = InputString.substring(i,i).toUpperCase();
					
				}
				System.out.println(InputString);
			}
		}
			
		}

}
