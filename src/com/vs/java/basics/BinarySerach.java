package com.vs.java.basics;

public class BinarySerach {
	public static int search(int[] arr,int f,int l,int x ) {
		int mid = f + (l-f)/2;
	
		if(arr[mid] == x) {
			return mid;
		}
		else if(arr[mid] > x) {
			return search(arr,f,mid-1,x);
		}
		else if(arr[mid] < x) {
			return search(arr,mid+1,l,x);
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		int[] arr = {1,3,4,5,6,9,10};//input
		
		int n = arr.length;//length of array
		int result = search(arr,0,n-1,3);//output 
		if(result == -1) {
			System.out.print("Element not present "+"\n");//display
		}
		else
		{//
			System.out.print("The element is present at index : " + result + "\n");//display
		}
		double end = System.currentTimeMillis();
		double time = end - start;//time
		System.out.print(time);
	}

}

