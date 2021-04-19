package com.vs.java.problems;

//solved without using dequeue

import java.util.ArrayList;
import java.util.Scanner;
/*ASK AT AMAZON,MICROSOFT,DIRECTI,FLIPKART*/
//SOURCE : GFG
/*
 * Given an array arr[] of size N and an integer K. 
 * Find the maximum for each and every contiguous subarray of size K.
 * 
 * 
 * N = 9, K = 3
 * arr[] = 1 2 3 1 4 5 2 3 6
 * 
 * */
public class MAXofSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the size of the subarray");
		int k = sc.nextInt();
		int[] arr = new int[n];
		//input array
		System.out.println("Enter the elements of the array");
		for( int i=0 ;i < n ;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
        int i=0,j;
        
        int cnt = 0,max=0;
        
        while( i <= n-k )
        // i will go only till the position where all the subarrays are considered
        {
            j = i;
            
            while(cnt < k)
            {
                if( arr[j] > max)
                {
                    max = arr[j];
                }
                j++;
                cnt++;
            }
            //max added to the list for the particular subarrays
            list.add(max);
            max = 0;
            cnt = 0;
            i++;
        }
        //display the list
        for( int ele : list)
        {
        	System.out.print(ele + " ");
        }
	}

}
