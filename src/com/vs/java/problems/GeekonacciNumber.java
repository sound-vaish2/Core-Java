package com.vs.java.problems;

import java.util.Scanner;

public class GeekonacciNumber {
	 public static int GeekonacciNumber(int a, int b, int c, int n)
	    {
	        if( n == 1)
	        {
	            return a;
	        }
	        if( n == 2)
	        {
	            return b;
	        }
	        if( n == 3)
	        {
	            return c;
	        }
	   
	        return (GeekonacciNumber( a, b,  c,  n-1) + GeekonacciNumber( a, b,  c,  n-2) + GeekonacciNumber( a,  b,  c,  n - 3));  
	    }
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	     int T = sc.nextInt();
	     for( int i=0 ; i<T ;i++)
	     {
	         int A = sc.nextInt();
	         int B = sc.nextInt();
	         int C = sc.nextInt();
	         int N = sc.nextInt();
	         int result = GeekonacciNumber(A , B, C , N);
	         System.out.println(result);
	     }
	}

}
