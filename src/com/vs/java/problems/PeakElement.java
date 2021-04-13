package com.vs.java.problems;

import java.util.Scanner;
//ASKED AT GOOGLE


//NOTE : Peak element is defined as the number greater than equal to both its neighbors


// Given an random array find the peak element with time complexity O(logn)
//using binary search 


public class PeakElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		//arr = { 10, 9, 8, 7, 6, 5, 6, 4, 3, 2 }
		for( int i=0; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		//print array
//		for( int i=0; i<size ; i++) {
//			System.out.println(arr[i]);
//		}
		int f = 0, l = size-1;
		int mid;
		//using binary search algorithm
		
		while(f <= l)
		{
			mid = f + (f + l)/2;
			 
			if(mid == 0 || mid == size-1)
			{
				System.out.println(mid);
				break;
			}
			//if the mid element is greater than both its neighbors
			
			else if( arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1])
			{
				System.out.println(mid);
				break;
			}
			//if any left or right element is greater than move to that direction 
			
			else if( arr[mid -1] > arr[mid]  )
			{
				l = mid -1 ;
			}
			else
			{
				f = mid + 1 ;
			}
			
		}
	}

}
