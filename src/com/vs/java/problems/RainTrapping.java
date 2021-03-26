package com.vs.java.problems;

import java.util.Scanner;
//Time complexity : O(n)
//space complexity : O(n)

//Problem statement : Calculate the rain trapped on the building given that the height of the building 

public class RainTrapping {
	//min and max function 
	static int max(int num1 , int num2) {
		if(num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	static int  min(int num1, int num2) {
		if(num1 > num2) {
			return num2;
		}
		else {
			return num1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int[] prefix_max = new int[n];
		int[] postfix_max = new int[n];
		
		prefix_max[0] = arr[0];
		postfix_max[n-1] = arr[n-1];
		//calculating prefix max and postfix max array
		for(int i=1;i<n;i++) {
			prefix_max[i]= max(prefix_max[i-1] , arr[i]);
		}
		for(int i=n-2;i>=0;i--) {
			postfix_max[i] = max( postfix_max[i+1] , arr[i]);
		}
//		for(int i=0;i<n;i++) {
//			System.out.println(postfix_max[i]);
//		}
		
		
		
		// counting of water trapped
		int total = 0;
		for(int i =0 ;i < n ;i++) {
			int temp = min(prefix_max[i], postfix_max[i]) - arr[i];
			total = max( temp , 0) + total ;
		}
		System.out.println("The total Rain Trapped is : " +  total);
	}
	

}
