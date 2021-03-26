package com.vs.java.problems;

import java.util.Scanner;

public class FindDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.print("digit at once place:");
		int od = num%10;
		System.out.print(od);
		System.out.print("\n");
		num = num/10;
		int td = num %10;
		System.out.print("digit at tenth place:");
		System.out.print(td);
		System.out.print("\n");
		num = num/10;
		int hd = num%10;
		System.out.print("digit at hundredth place");
		System.out.print(hd);
		System.out.print("\n");
//		System.out.print("");
//		System.out.print("");
//		System.out.print("");
		
	}

}
