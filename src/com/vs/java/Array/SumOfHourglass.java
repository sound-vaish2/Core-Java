package com.vs.java.Array;

import java.util.Scanner;

//2D array example
public class SumOfHourglass {
	public SumOfHourglass() {
	}
	
	int max_value = Integer.MIN_VALUE;
    public void findSum(int[][] arr, int r,int c ){
        int sum = (arr[r][c]+arr[r][c+1]+arr[r][c+2]+arr[r+1][c+1]+
                            arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2]);
            if(sum>max_value)
            {
                max_value = sum;
            }
    }
	public static void main(String[] args) {
	        int[][] arr = new int[6][6];
	        SumOfHourglass obj = new SumOfHourglass();
	        Scanner scanner = new Scanner(System.in);
	        /* Example : for following 2D array
	         *  111000
				010000
				111000
				002440
				000200
				001240
				answer should be : 19
	         */
	        for (int i = 0; i < 6; i++) {
	            for (int j = 0; j < 6; j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }
	        for (int i = 0; i < 6; i++) {
	            for (int j = 0; j < 6; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.print("\n");
	        }
	        for(int i=0;i<4;i++)
	        {
	            for(int j=0;j<4;j++)
	            {
	                obj.findSum(arr,i,j);
	            }
	        }

	        System.out.print(obj.max_value);
	        scanner.close();
	    }
			
}
