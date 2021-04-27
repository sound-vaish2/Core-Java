package com.vs.java.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
//HashMap
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		// adding to hashmap
		map.put(1, "john");
		map.put(2, "josheph");
		map.put(3, "philip");
		map.put(4, "thomas");
		//return if key is present
		System.out.println(map.containsKey(2));
		//return if value is present
		System.out.println(map.containsValue("ria"));
		//replace 
		map.replace(2, "josheph", "steven");
		//Returns the value to which the specified key is mapped
		System.out.println("get value of key 2 :" +map.get(2));
		//return number of key value pair in map
		System.out.println("number of key-value pair :" + map.size());
		//return true if map contains 0 key-value pairs
		System.out.println("before deletion :" + map.isEmpty());
		//delete all key-value pairs
		map.clear();
		System.out.println("after deletion :" + map.isEmpty());
		map2.put(1, "ford");
		map2.put(2, "tory");
		map2.put(3, "goerge");
		//copy all elements to other map
		map.putAll(map2);
		System.out.println("value at key 2 : " + map.get(2));
		//Compares the specified object with this map for equality. 
		//Returns true if the given object is also a map and the two mapsrepresent the same mappings
		System.out.println(map.equals(map2));
		//returns the string representation of map
		System.out.println("map :" +map.toString());
		System.out.println("map2 : "  + map2.toString());
		//returns the values 
		System.out.println(map.values());
		
		
		
	}

}
