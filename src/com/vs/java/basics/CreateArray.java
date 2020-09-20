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
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		sc.close();
//		arr = new int[N];
		
		int arr1[] = {1,2,3,4,5,6};
		int i;
		//Scanner array_input = new Scanner(System.in);
		try{
			for(i = 0; i<6 ; i++) {
			System.out.println( i + "th element is: " + arr1[i]);
		}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("array out of bounds");
			for(i = 0; i<6 ; i++) {
				System.out.println( i + "th element is: " + arr1[i]);
			}
		}
		finally {
			System.out.println("This is the output");
		}
//		for(i = 0; i<=N ; i++) {
//			
//			int num  = array_input.nextInt();
//			array_input.close();
//			arr[i] = num;
//			//System.out.println( i + "th element is: " + num);
//		}
		}

}
