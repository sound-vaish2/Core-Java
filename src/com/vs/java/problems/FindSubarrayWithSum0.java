package com.vs.java.problems;

import java.util.HashMap;

public class FindSubarrayWithSum0 {

	public static void main(String[] args) {
		//int[] arr = {7 ,1 ,3 ,-2 ,4 ,-1 ,0 ,-1 ,18};
		int[] arr = {3 ,2 ,1 ,-4 ,-2 ,16 ,10};
		//taking prefix sum array
		int[] prefix_sum = new int[arr.length];
		//taking a hashmap 
		HashMap<Integer, Integer> hm = new HashMap<>();
		int[] res = new int[2];
		prefix_sum[0] = arr[0];
		for( int i = 1 ; i<arr.length ; i++)
		{
			prefix_sum[i] = prefix_sum[i-1] + arr[i];
		}
		hm.put(0, 0);
		for( int i = 0 ; i<arr.length ; i++)
		{
			if(hm.containsKey(prefix_sum[i])) {
				res[0] = hm.get(prefix_sum[i]);
				res[1] = i;
			}
			else {
				hm.put(prefix_sum[i], i);
			}
		}
		for(int i=res[0] ; i< res[1]+1 ; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
