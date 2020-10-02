package com.vs.java.Array;

import java.util.Scanner;

public class TwoDArray {

	public TwoDArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String arr1[];
		arr1 = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns you want :");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[2][2];//{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
		//Enter the values from user
		System.out.println("Enter the values  : ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j] = sc.nextInt();

			}
		}
		sc.close();
		//print array
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
//if(arr[i][j] == 1)
//{
//	for(int k =0 ;k<10;k++)
//	{
//		arr1[k] = "i" +" j";
//		System.out.print(arr1[k]);
//	}
//}
//System.out.print(arr[i][j] + "  ");