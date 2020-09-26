package com.vs.java.Labbook.Lab2;

import java.util.Scanner;

public class PosOrNeg {


	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		if(num < 0)
		{
			System.out.println("Number is negative..");
		}
		else
		{
			System.out.println("Number is positive..");
		}
	}

}
