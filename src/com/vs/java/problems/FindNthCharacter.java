package com.vs.java.problems;

public class FindNthCharacter {

	public static void main(String[] args) {
		String s = "101";
		String temp = "";
		char[] S = s.toCharArray();
		for( int i =0; i<s.length(); i++)
		{
			char ch = S[i];
			System.out.println(ch);
			if( ch == '1')
			{
				System.out.println("here");
				temp += "10";
			}
			else
			{
				temp += "01";
			}
			System.out.println(temp);
		}
	
		
	}

}
