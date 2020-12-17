package com.vs.java.problems;
/*Problem Statement: 
 * 
 * Given an array arr[] of size N where every element is in the range from 0 to n-1. 
 Rearrange the given array so that arr[i] becomes arr[arr[i]].
 */
import java.util.Scanner;

public class RearrangeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the values in array");
		for(int j = 0 ;j <n;j++)
        {
       	  arr[j] = sc.nextInt();
        }
			//oldval stores the original value
		     int oldval = arr[0];
	         
	         int i = 0 ;
	         while(i != n)
	         {
	             int idx = arr[i];
	        
	             if(idx<i)
	             {
	                 int temp = arr[i];
	                 arr[i] = oldval;
	                 oldval = temp;
	             }
	             else
	             {
	                 arr[i] = arr[idx];
	             }
	             i++;
	            
	         }
	         //display the array
	         for(int j = 0 ;j <n;j++)
	         {
	        	 System.out.print(arr[j] + " ");
	         }
	}

}
