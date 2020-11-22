package com.vs.java.Array;

import java.util.Scanner;

public class SortingTwoDArray {
	public void sort(int[][] arr,int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[i][j] > arr[i][j+1])
				{
					int temp = arr[i][j+1];
					arr[i][j+1] = arr[i][j];
					arr[i][j] = temp;
				}
			}
		}
	}
	public void sort1(int[][] arr,int m,int n)
	{
		for(int i=0;i<m-1;i++)
		{
			for(int j=0;j<n-2;j++)
			{
				if(arr[i][n-1] > arr[i+1][j])
				{
					int temp = arr[i][n-1];
					arr[i][n-1] = arr[i+1][j];
					arr[i+1][j] = temp;
				}
			}
		}
	}
	public void Print(int[][] arr, int m,int n)
	{
		//print array
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		SortingTwoDArray obj = new SortingTwoDArray();
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of rows and columns you want :");
//		int m = sc.nextInt();
//		int n = sc.nextInt();
		//int[][] arr = new int[m][n];//{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
		int[][] arr = { {5, 4, 7}, {1, 3 ,8}, {2, 6, 9} }; 
		int m = 3,n=3;
		//Enter the values from user
//		System.out.println("Enter the values  : ");
//		for(int i=0;i<m;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				arr[i][j] = sc.nextInt();
//
//			}
//		}
		sc.close();
		
		//print array
		obj.Print(arr, m, n);
		System.out.print("\n");
		obj.sort(arr, m, n);
		System.out.print("\n");
		obj.Print(arr, m, n);
		obj.sort1(arr, m, n);
		System.out.print("\n");
		obj.Print(arr, m, n);
		System.out.print("\n");
		obj.sort(arr, m, n);
		System.out.print("\n");
		obj.Print(arr, m, n);
		obj.Print(arr, m, n);
		obj.sort1(arr, m, n);
		System.out.print("\n");
		obj.Print(arr, m, n);
		
	}

}
