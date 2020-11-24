package com.vs.java.DS.BST;

import java.util.Stack;

//create and insert operation in BST
public class CreateBST {
	public Node root = null;
	class Node{
		Node right; 
		Node left;
		int data;
		
		Node(int d){
			data = d;
			right = left = null;
		}
	}
	public void insert(int val) {
		Node temp = new Node(val);
		//for if the tree is empty 
		if(root == null)
		{
			root = temp ;
		}
		else
		{   //the logic is to move temp1 according to number if it is greater or less
			//and the current node will be on the same point untill
			//when temp1 is null the while loop will break and in that position the current
			//will be behind one node or we can say we reach the leaf node
			Node temp1 = root;
			Node current = null;
			while(temp1 != null)
			{
				current = temp1;
				if(val < temp1.data)
				{
					temp1 = temp1.left;
				}
				else
				{
					temp1 = temp1.right;
				}
			}
			//the above for the traversal now my current is on the right position where i wanted it
			//now again we have to check whether val is greater or less and add it to that position
			
			if(val<current.data)
			{
				current.left = temp;
			}
			else
			{
				current.right = temp;
			}
			/*----------and the insertion ends---------*/
		}
		
	}
	public void printInorder() {
		//to implement the traversal we use stack datastructure
		Stack<Node> stack = new Stack<Node>();
		//placing a currentNode in root 
		Node currentNode = root;
		//initialy the stack is empty
		if(root == null)
		{
			return ;
		}
		while(!stack.isEmpty() || currentNode != null)
		{
			if(currentNode != null)
			{
				//Here we are pushing the whole node the reason can be seen further
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			else
			{
				//pop function will return the node and we store that in the Storetemp variable
				Node Storetemp = stack.pop();
				//printing the value of it
				System.out.print(Storetemp.data + " ");
				//by now our currentNode must have reach to the leaf of left subtree
				//Therefore we now give point our currentNode to the right of Storetemp  
				//from this we can move to right substree
				currentNode = Storetemp.right;
			}
		}
		//the logic is if the stack is empty and the current node is null stop the loop 
		//bcoz by that time traversal of tree will be finished
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateBST tree = new CreateBST();
		tree.insert(20);
		tree.insert(40);
		tree.insert(15);
		tree.insert(12);
		tree.insert(39);
		tree.insert(32);
		tree.insert(17);
		tree.insert(50);
		tree.printInorder();
	}

}
