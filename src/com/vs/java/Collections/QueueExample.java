package com.vs.java.Collections;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		//Queue
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(23);
		queue.add(76);
		queue.add(43);
		queue.add(56);
		Iterator it = queue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
