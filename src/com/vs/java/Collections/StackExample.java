package com.vs.java.Collections;
import java.util.*;
public class StackExample {
//Stack
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//Add elements to stack
		stack.add(32);
		stack.push(76);
		stack.push(89);
		//returns and remove the top most element
		System.out.println("remove top most element :" + stack.pop());
		//returns the top most element
		System.out.println("top most element :" + stack.peek());
		//return true if stack is empty 
		System.out.println("check if stack is empty :" + stack.empty());
		Iterator it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	} 

}
