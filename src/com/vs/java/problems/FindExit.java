package com.vs.java.problems;

public class FindExit {

	public static void main(String[] args) {
		/*
		 * 0 0 0 1 
		 * 0 0 1 0  
		 * 0 0 1 0 
		 * 0 0 0 1 
		 * 
		 * 
		 * */
		int[][] arr = {{0,0,0,1},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
		int i = 0, j=0;
		int flag ;
		int count =1;
		while( i<=4 && j<=4 )
		{
			for( int k=0; k<4 ;k++)
			{
				if(arr[i][k] == 1)
				{
					arr[i][k] = 0;
					count++;
					
					flag = 1;//for rows
					
					break;
				}
			}
			for( int l = i; l<4; l++)
			{
				if(arr[l][j] == 1)
				{
					arr[l][j] = 0;
					count++;
					//j++;
					flag = 0;//for columns
					
					break;
				}
			}
			
		}
		for(int m=0; m<4; m++)
		{
			for(int n=0 ; n<4; n++)
			{
				System.out.println(arr[m][n]);
			}
		}
	} 

}
