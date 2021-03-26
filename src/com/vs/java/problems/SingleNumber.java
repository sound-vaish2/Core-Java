package com.vs.java.problems;

public class SingleNumber {
//XOR =>
	 /* same bit => 0
	  * different bit => 1
	  * 
	  * Thus, adding two numbers will always result in 0 
	  * so taking XOR of each number 
	  * specially when they are repeated result in finding the one not repeated
	  * 
	  * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set
		int[] A = {2,4,2,3,1,4,7,3,1,7,9};
		int result=0,n=A.length;
        for(int i=0;i<n;i++){
            result=result^A[i];
            System.out.print(result+" ");
        }
        System.out.print("\n");
        System.out.print(result);
        
	}

}
