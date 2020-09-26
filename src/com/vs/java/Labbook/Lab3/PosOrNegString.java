package com.vs.java.Labbook.Lab3;
//check wheather the string is negative or not
import java.util.Scanner;

public class PosOrNegString {

	public PosOrNegString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Inp_String = sc.nextLine();
		sc.close();
		Inp_String = Inp_String.toLowerCase();
		char[] ch = Inp_String.toCharArray();
		int flag =0;
		for (int i=0;i<Inp_String.length()-1;i++)
		{
			int ascii = (int) ch[i];
			if(ascii > ch[i+1])
			{
				flag = 1;
			}
			if(flag == 1)
			{
				System.out.println("The given string is a negative string");
				break;
			}
			
		}
		if(flag == 0 )
		{
			System.out.println("The given string is a positive string");
		}

	}

}
