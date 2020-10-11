package com.vs.java.Array;

import java.util.Scanner;
//Binary SEarch is applied to sorted array where it is split into two half sub arrays
public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,6,7,8};
		for(int i=0;i< 6 ;i++)
		{
			System.out.print(arr[i] + " ");
		}
		int mid,f = 0,l = 5,result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n" + "Enter the element you want  : ");
		int x = sc.nextInt();
		sc.close();
	//	mid = (l-f)/2 + f;
		
		//	Binary Search Algorithm
		// time complexity 	Bestcase O(1) and wrostcase O(n)
//		if(x == arr[mid])
//		{
//			System.out.print(mid);
//		}
//		if(x > arr[mid])
//		{
//			f= mid+1;
//			for(int i =f ;i<6;i++)
//			{
//				if(arr[i] ==x)
//				{
//					System.out.print(i);
//				}
//			}
//		}
//		if(x < arr[mid])
//		{
//			f= mid-1;
//			for(int j =f ;j>=0;j++)
//			{
//				if(arr[j] == x)
//				{
//					System.out.print(j);
//				}
//			}
//		}
		//proper algorithm with time complexity 
		// O(logn)
	
		while(f<=l)
		{
			mid = f + (l-f)/2;	
			if(arr[mid] <= x)
			{
				f = mid+1;
				result = mid;
			}
			else
			{
				l = mid-1;
				//result = mid;
			}
		}
		System.out.println(result+1);
	}

}
