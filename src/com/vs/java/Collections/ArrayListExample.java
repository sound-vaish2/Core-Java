package com.vs.java.Collections;
//Array List and methods
import java.util.ArrayList;
//import java.util.LinkedList;

public class ArrayListExample {
	
	public ArrayListExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		//ArrayList<Integer> list3 = new ArrayList<Integer>();
		//ArrayList
		System.out.println(list);
		//appends the specified element to list //List
		list.add(43);
		list.add(54);
		list.add(67);
		list.add(98);
		list.add(24);
		System.out.println("list" + list);
		//add element to specified location
		list.add(1, 64);
		System.out.println("add 64 " +list);
		//remove specified index
		list.remove(2);
		System.out.println("remove 54 " +list);
		//return the specific element
		System.out.println("get element " +list.get(1) );
		//list2
		list2.add(34);
		list2.add(59);
		System.out.println( " list2" + list2);
		//Compares the specified object with this list for equality.
		System.out.println("equals result for list and list2: " + list.equals(list2));
		//clears all the list
		list2.clear();
		System.out.println("clear the list2 " + list2);
		//returns the hashcode for the list
		System.out.println("Hashcode of list: " + list.hashCode());
		//indexOf = returns the index of elements of first ocurrance and returns -1 if not present
		list.add(1,98);
		list.add(2,43);
		System.out.println("list" + list);
		System.out.println("index of 43 : " + list.indexOf(43));
		System.out.println("indexof 24 : " + list.indexOf(24));
		//lastIndexOf = returns the  index of the last occurrence of the specified elementin this list
		System.out.println("list" + list);
		System.out.println("index of last occurance: " + list.lastIndexOf(98));
		list.iterator();
		System.out.println(list);
		//returns the list iterator at specified location
		System.out.println(list.listIterator(3));
		//remove = removes the element in specified location
		list.remove(3);
		System.out.println("remove the element at index 3:  " + list);
		//removeRange(int indexfrom, int toindex) 
		//list.removeRange​(1,4);
		//set = replaces the element with specified element
		list.set(1, 22);
		System.out.println("set with 22 at index 1:  " + list);
		//sublist = returns the sublis from specifed index to specified index 
		System.out.println("sublist :  " + list.subList(3, 5));
		
	}

}
