package com.vs.java.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public LinkedListExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(45);
		list.add(54);
		list.add(83);
		System.out.println("list : "+ list);
		//size
		System.out.println("list size : " + list.size());
		//returns first and last element in list
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println("getfirst and getlast method respectively : "+ list);
		//returns first and last removed elements
		System.out.println(list.removeFirst());
		System.out.println("after remove first method : "+ list);
		System.out.println(list.removeLast());
		System.out.println("after removelast method : "+ list);
		//returns the last element
		int res = list.pop();
		System.out.println(res);
		System.out.println(" pop method : "+ list);
		list.add(12);
		list.add(45);
		list.add(54);
		list.add(83);
		System.out.println("list : "+ list);
		//Retrieves, but does not remove, the last element of this list,
		int res1 = list.peekLast();
		int res2 = list.peekFirst();
		System.out.println("peeklast method : " + res1);
		//Retrieves, but does not remove, the first element of this list,
		System.out.println("peekfirst method : " + res2);
		System.out.println(" list : " + list);
		//Removes the last occurrence of the specified element in this
		System.out.println("removeFirstOccurrence(Object) method : " + list.removeFirstOccurrence(54));
		System.out.println(" list : " + list);
		//pollLast method
		// Retrieves and removes the last element of this list,
		int res3 = list.pollLast();
		System.out.println("pollLast method : " + res3);
		System.out.println("final list : " + list);
		// Retrieves and removes the last element of this list,
		int res4 = list.pollFirst();
		System.out.println("pollFirst method : " + res4);
		System.out.println(" final list : " + list);
		//returns an iterator of list proper sequence
		//Iterator<Integer> res5 = list.iterator();
		System.out.println("Iterator :" + list.iterator());
		
	}
}
