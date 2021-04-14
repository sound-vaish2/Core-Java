package com.vs.java.problems;

import java.util.Scanner;



/*Akku likes binary numbers and she likes playing with these numbers. 
 * Her teacher once gave her a question.For given value of  L and R,
 *  Akku have to find the count of number X, which have only three-set 
 *  bits in it's binary representation such that "L ≤ X ≤ R".
 *  */


public class AkkuAndBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long temp;
        while(L < R)
        {   
        	
        	//System.out.println("here");
                //long temp = (L>>1)&1;
              //  long one = 1;
        	temp = L;
            for( int i=0; i<32 ;i++)
            {  
              	
                if( (temp & 1) == 1)
                {
                    count++;   
                    
                    if(count == 3)
                    {
                        result++;
                    }
                }
               // System.out.println(count);
            	temp = L>>1;
            }
            count = 0;
            L++; 
        }
        //System.out.println(L + " "  + R);
        System.out.println(result);

	}

}
