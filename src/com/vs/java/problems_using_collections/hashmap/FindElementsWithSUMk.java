package com.vs.java.problems_using_collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindElementsWithSUMk {

	public static void main(String[] args) {
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(3);
//		list.add(8);
//		list.add(2);
//		list.add(1);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int list_size = list.size();
		for( int i=0 ; i<list_size; i++)
		{
			map.put(list.get(i), i);
		}

		//Iteratoring through hashmap 
		//Display hashmap
		for( Map.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			System.out.println("Key = " + entry.getKey() + "  Value = " + entry.getValue());
		}
		int k = 4;
		for( int i=0 ; i<list_size; i++)
		{
			int value = list.get(i);
			int temp = k - value;
			if(map.containsKey(temp) && map.get(temp) != i) 
			{
				result.add(list.indexOf(value) + 1);
				result.add(map.get(temp) + 1);
				break;
				
			}
		}
		for( int i=0 ; i<result.size(); i++)
		{
			System.out.println(result.get(i) );
		}
		
		
	}

}
