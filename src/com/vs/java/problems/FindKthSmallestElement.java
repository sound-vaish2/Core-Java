package com.vs.java.problems;

import java.util.Scanner;
/*
 * 	Given an array and the value k . Find the Kth smallest element from the array without sorting 
 *  TIME COMPLEXITY : O(nlogn)
 *  SPACE COMPLEXITY : O(1)
 *  
 * */

public class FindKthSmallestElement {
	//function to count the number of elements equal to smaller than specified number of array
	static int countofnumberEqualorSmaller(int X, int[] arr, int n){
		int cnt = 0;
		for(int i = 0 ; i < n ;i++)
		{
			if( arr[i] <= X)
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		
		int max=0 ,min = 99999;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array ");
		int n = sc.nextInt();
	
		
		System.out.println("Enter the value of K");
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for( int i=0 ;i<n ;i++)
		{
			arr[i] = sc.nextInt();
		}
		//finding the min from the array
		for(int i =0 ; i<n ; i++)
		{
			if( arr[i] < min)
			{
				min = arr[i];			
			}
		}
		//finding the max from the array
		for(int i =0 ; i<n ; i++)
		{
			if( arr[i] > max)
			{
				max = arr[i];		
			}
		}
		
		int start = min, end = max, mid;
		
		while(start <= end)
		{
			mid = start + (end-start)/2;
			int x1 = countofnumberEqualorSmaller(mid, arr, n);
			int x2 = countofnumberEqualorSmaller(mid-1, arr, n);
			if(x1 == k && x2 < k)
			{
				System.out.println("Answer :	"  + mid);
				break;
			}
			else if( x1 < k)
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
		
		
	}

}
