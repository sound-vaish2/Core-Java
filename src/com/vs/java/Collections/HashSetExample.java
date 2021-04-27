package com.vs.java.Collections;
import java.util.*;
/*
Java HashSet class is used to create a collection that uses a hash table for storage.
It inherits the AbstractSet class and implements Set interface.
*/

/*HashSet stores the elements by using a mechanism called hashing.
 * 
HashSet contains unique elements only.

HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
*/
public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); 
		
		//Adding the elements in hashmap
		set.add(76);
		set.add(89);
		set.add(73);
		set.add(98);
		set.add(24);
		System.out.println("size " + set.size());
		//adding a duplicate element
		set.add(89);
		//size
		System.out.println("after adding duplicate , size :  " + set.size());
		System.out.println("checking the set is empty or not :" + set.isEmpty());
		System.out.println("checking the 45 is present or not  :" + set.contains(45));
		System.out.println("checking the 73 is present or not  :" + set.contains(73));
		//removing 98
		set.remove(98);
		//iteratoring through set
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//empty the set
		set.clear();
		
	}

}
