package com.vs.java.problems;

//import vs.java.lab3.LinkedList;
//import vs.java.lab3.LinkedList.Node;

//Implementation of turte/hare theorem
public class MidElementOfLLIn1Loop {
	static Node head;
    public class Node{
    	int data;
    	Node next;
    	Node(int d){
    		d = this.data;
    		next = null;
    	}
    }
    static MidElementOfLLIn1Loop insertNode(int val, MidElementOfLLIn1Loop list) {
		//creating temp node to put value in 
		//Node temp = new Node(val);
		//this is for traversing purpose
		Node temp1 = head;
		//temp.next = null;
		if(head == null)
		{
			//put value in head
		//	list.head = temp;
			temp1 = head;
		}
		else
		{
			while(temp1!= null)
			{
				if(temp1.next != null)
				{
					temp1 = temp1.next;
				}
				else
				{
				//	temp1.next = temp;
					break;
				}
			}
			
		}
		return list;
	}
	static void printList() {
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
