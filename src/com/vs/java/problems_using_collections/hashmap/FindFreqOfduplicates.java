package com.vs.java.problems_using_collections.hashmap;
import java.util.*;
public class FindFreqOfduplicates {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>(); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//int freq = 1;
		
		int[] arr = new int[n];
		// Enter the values in array
		for( int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
//	Print the array
		
//		for( int i = 0; i < n; i++)
//		{
//			System.out.println(arr[i]);
//		}

		for( int i = 0; i < n; i++)
		{

		    if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i]) + 1);	
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		for( Map.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			System.out.println("Key = " + entry.getKey() + "  Value = " + entry.getValue());
		}

	}
	

}
