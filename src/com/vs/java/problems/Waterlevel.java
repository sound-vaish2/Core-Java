package com.vs.java.problems;

import java.util.Scanner;

public class Waterlevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		while(t != 0)
		{
			k = k-x;
			if(k >= l && k <= r)
			{
				t--;
			}
			else
			{
				break;
			}
			k = k+y;
		}
		if(t == 0)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
	}

}
