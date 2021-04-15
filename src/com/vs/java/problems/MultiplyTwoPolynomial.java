package com.vs.java.problems;

/* Source : GFG  
 * 
 * PROBLEM STATEMENT : Given two polynomials represented by two arrays that contains the coefficients of poynomials,
 *  returns the polynomial in form of array formed after multiplication of given polynomials.
 * 
 * 
 * */
import java.util.Scanner;

public class MultiplyTwoPolynomial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Input : M = 4, N = 3
		Arr1 = {1 , 0, 3, 2}
		Arr2 = {2, 0, 4}
		Output: {2, 0, 10, 4, 12, 8}*/
		
		int M = sc.nextInt();//size of array 1
		int N = sc.nextInt();//size of array 2
		
		int[] Arr1 = new int[M];
		int[] Arr2 = new int[N];
		
		for( int i =0; i<M; i++)
		{
			Arr1[i] = sc.nextInt();
		}
		for( int i =0; i<N; i++)
		{
			Arr2[i] = sc.nextInt();
		}
		
		//The size of the result array will be the highest power of the multiplication 
		
        int size = (M+N)-1;
        
        int[] res = new int[size];
        
        //Initialising as zero 
        
        for( int i=0; i<size; i++)
        {
            res[i] = 0;
        }
        
        int temp, index_sum;
        
        //The power of the x in polynomial is the sum of indexes of both 
        
        for( int i=0; i<M; i++)
        {
            for(int j=0; j<N; j++)
            {
                temp = Arr1[i]*Arr2[j];
                index_sum = i+j;
                res[index_sum] += temp;
            }
        }
        for( int i=0; i<size; i++)
        {
            System.out.println(res[i]);
        }
     
	}

}
