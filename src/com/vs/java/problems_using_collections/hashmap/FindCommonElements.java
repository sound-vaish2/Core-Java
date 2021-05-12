package com.vs.java.problems_using_collections.hashmap;
import java.util.*;
public class FindCommonElements {

	public static void main(String[] args) {
		int[] A = {3 ,2 ,10 ,7 ,5 ,15 ,3 ,2};
		int [] B = {7 ,1 ,18 ,2 ,16 ,10, 2 };
		HashMap<Integer , Boolean > hm = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for( int i=0 ; i < A.length ; i++)
		{
			hm.put(A[i], true);			
		}
	
		for( int i=0 ; i < B.length ; i++)
		{
			if(hm.containsKey(B[i]))
			{
				if(!list.contains(B[i]))
				{
					list.add(B[i]);
				}
			}
		}
		for( int i : list)
		{
			System.out.println(i);
		}
	}

}
