package com.vs.java.Array;

import java.util.Scanner;

public class ArrayRotation {

	public ArrayRotation() {
	}
	public void reverseArray(int arr[] , int start , int end) {
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;		
		}
	}
	public void leftRotate(int[] arr,int d,int N)
	{
		if(d==0)
		{
			return;
		}
		reverseArray( arr,0,d-1);
		reverseArray(arr,d,N-1);
		reverseArray(arr,0,N-1);
	}
	public void Print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	public static void main(String[] args) {
		ArrayRotation rotation = new ArrayRotation();
		int[] arr = {1,2,5,6,7,8,9};
		int N = arr.length;
		int d = 2;
		d = d%N;
		rotation.leftRotate(arr, d, N);
		System.out.println("Given Array : ");
		System.out.println("1  2  5  6  7  8  9");
		System.out.println("Array after rotation : ");
		rotation.Print(arr);
		
	}
//		int arr1[] = {1,2,3,4,5,6};
//		Scanner sc = new Scanner(System.in);
//		//arr.length finds the length of array
//		//System.out.println(arr1.length);
//		int size = arr1.length;
//		int i ,count=0,times;
//		
//		// Right rotation of array
//		
//		System.out.println("Enter the number of times you want to rotate the array : ");
//		times = sc.nextInt();
//		System.out.println("Enter the rotation you want do :"+"\n"+" 1.Right rotation" + "\n" + " 2.Left rotation");
//		int choice  = sc.nextInt();
//		if(choice == 1)
//		{
//			
//		while(count != times)
//		{
//			int res = arr1[size-1];
//			for( i = size-1 ;i > 0;i--)
//			{
//				 arr1[i] = arr1[i-1];
//			}
//			arr1[0] = res;
//			count++;
//		}
//		//print the array
//		for(int i1=0;i1<size;i1++) {
//			System.out.println(arr1[i1]);
//		}
//		//end of if statement
//		}
//		else {
//		//Left rotation of array
//		while(count != times)
//		{
//			int temp1 = arr1[0];
//			for(int i1=0;i1<size-1;i1++)
//			{
//				arr1[i1] = arr1[i1+1];
//			}
//			arr1[size-1]=temp1;
//			count ++ ;
//			
//		}
//		//print the array
//		for(int i1=0;i1<size;i1++) {
//			System.out.println(arr1[i1]);
//		}
//		//end of else statement
//		}
//		sc.close();
//		}

}
