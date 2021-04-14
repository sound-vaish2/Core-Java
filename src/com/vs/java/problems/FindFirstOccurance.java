package com.vs.java.problems;

import java.util.Scanner;

/* Given an array find the x is present or not if present return first occurance
  * if not present then return last occurance of biggest number smaller than x
  * */
// Time Complexity   : O(logn) 
public class FindFirstOccurance {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 8, 13, 15, 18, 21};
		Scanner sc = new Scanner(System.in);
		int len = arr.length;
		int x = sc.nextInt();
		int f = 0, l = len-1;
		int mid ;
		while(f <= l)
		{
			mid = f + (l - f)/2;
			if( arr[mid] == x && (mid == 0 || arr[mid - 1] != arr[mid]))
			{
				System.out.println("yes present " + mid);
				System.out.println(arr[mid]);
				break;
			}
			else if( arr[mid] < x && ( mid+1 == len || arr[mid+1] > x) )
			{
				System.out.println("yes present " + mid);
				System.out.println(arr[mid]);
				break;
			}
			else if( arr[mid] < x)
			{
				f = mid + 1;
			}
			else
			{
				l = mid - 1;
			}
		}
	}

}
