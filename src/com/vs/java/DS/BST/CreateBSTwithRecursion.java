package com.vs.java.DS.BST;
/*even if recursion is less tedious but it is not always that they are useful
they take extra space as in backand stack is maintained
also if we miss the base function it will eat up your space in RAM .
Thus, giving a stackoverflow error*/

//it is said that to use recursion mostly in tree or backtracking question
//as they are useful 
public class CreateBSTwithRecursion {
	static Node root = null;
	class Node{
		Node right;
		Node left;
		int data;
		Node(int d){
			this.data = d;
			right = left = null;
		}
	}
	public Node createBST(int val)
	{
		Node temp = new Node(val);
		root = temp;
		return root;
	}
	public Node insertBST(Node root, int val)
	{
		if(root == null)
		{
			return new Node(val);
		}
		if(val > root.data)
		{
			root.right = insertBST(root.right,val);
		}
		else
		{
			root.left = insertBST(root.left,val);
		}
		return root;
	}
	public void inorderBST(Node root)
	{
		if(root == null)
		{
			return ;
		}
		inorderBST(root.left);
		System.out.print(root.data + " ");
		inorderBST(root.right);
	}
	public void preorderBST(Node root)
	{
		if(root == null)
		{
			return ;
		}
		System.out.print(root.data + " ");
		preorderBST(root.left);
		preorderBST(root.right);
	}
	public void postorderBST(Node root)
	{
		if(root == null)
		{
			return ;
		}
		postorderBST(root.left);
		postorderBST(root.right);
		System.out.print(root.data + " ");	
	}
	public static void main(String[] args) {
		CreateBSTwithRecursion tree = new CreateBSTwithRecursion();
		tree.createBST(20);
		//tree.insertBST(root,20);
		tree.insertBST(root, 13);
		tree.insertBST(root, 3);
		tree.insertBST(root, 30);
		tree.insertBST(root, 50);
		tree.insertBST(root, 60);
		tree.insertBST(root, 12);
		tree.insertBST(root, 10);
		System.out.print("Inorder traversal : ");
		tree.inorderBST(root);
		System.out.print("\n");	
		System.out.print("preorder traversal : ");
		tree.preorderBST(root);
		System.out.print("\n");	
		System.out.print("postorder traversal : ");
		tree.postorderBST(root);
	}

}
