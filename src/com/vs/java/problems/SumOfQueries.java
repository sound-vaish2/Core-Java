package com.vs.java.problems;

import java.util.ArrayList;
import java.util.List;
//SOURCE : GFG
//PROBLEM STATEMENT: 
/*You are given an array arr[] of n integers and q queries in an array 
 * queries[] of length 2*q containing l, r pair for all q queries.
 *  You need to compute the following sum over q queries.
Array is 1-Indexed.*/

public class SumOfQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> result = new ArrayList<Integer>();
		    int[] arr = {1,2,3,4};
		    int n = 4;
		    int[] queries = {1,4,2,3}; 
	        int[] prefix_sum = new int[n];
	        prefix_sum[0] = arr[0];
	        //create prefix sum array 
	        for(int i=1; i<n; i++){
	            prefix_sum[i] = arr[i] + prefix_sum[i-1];
	        }
	        
	        //print prefix sum array 
//	        for(int i=0; i<n; i++){
//	            System.out.println(prefix_sum[i]);
//	        }
	        int l,r;
	        for(int i=1; i<queries.length; i=i+2){
	            l = queries[i-1] -1;
	            r = queries[i] - 1;
	            //for special condition 
	            if(l == 0){
	                result.add(prefix_sum[r]);
	            }
	            //for l > 0 the sum of range l to r will be : 
	            
	            else{
	                result.add(prefix_sum[r] - prefix_sum[l-1]);
	            }
	        }
	        
	        //print the arraylistt : 
	        
	       for(int i : result) {
	    	   System.out.println(i);
	       }
	        
	}

}
