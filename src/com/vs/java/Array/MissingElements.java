package com.vs.java.Array;

public class MissingElements {

	public MissingElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] arr = {1,3,4,6,7,9};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1] != arr[i]+1)
			{
				System.out.println("Missing element is : " + (arr[i]+1));
			}
		}
	}

}
