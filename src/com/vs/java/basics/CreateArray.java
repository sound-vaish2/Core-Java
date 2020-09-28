package com.vs.java.basics;
import java.util.Arrays;
import java.util.Scanner;
//create array
//Scanner class example
//used exception for out of bounds
public class CreateArray {

	public CreateArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		int arr[];
//		System.out.println("Enter the size of the array:");
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		sc.close();
//		arr = new int[N];
		
		int arr1[] = {1,2,3,4,5,6};
		//arr.length finds the length of array
		System.out.println(arr1.length);
		int i;
		//Scanner array_input = new Scanner(System.in);
		try{
			for(i = 0; i<6 ; i++) {
			System.out.println( i+1 + "th element is: " + arr1[i]);
		}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("array out of bounds");
			for(i = 0; i<6 ; i++) {
				System.out.println( i+1 + "th element is: " + arr1[i]);
			}
		}
		finally {
			System.out.println("This is the output");
		}
		//Delete an element from array code--
		System.out.println("Enter the position of element to delete : ");
		int pos = sc.nextInt();
		//store the element in another variable
		int element = arr1[pos-1];
		for(int i1 = pos-1; i1<arr1.length-1;i1++) {
			arr1[i1] = arr1[i1+1];
		}
		//print the new array
		for(int i1=0;i1<arr1.length-1;i1++) {
			System.out.println(arr1[i1]);
		}
		//print the element
		System.out.println("The element deleted was : " + element);
		sc.close();
//		for(i = 0; i<=N ; i++) {
//			
//			int num  = array_input.nextInt();
//			array_input.close();
//			arr[i] = num;
//			//System.out.println( i + "th element is: " + num);
//		}
		}

}
