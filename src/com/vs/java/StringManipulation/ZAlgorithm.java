package com.vs.java.StringManipulation;

public class ZAlgorithm {
	public static int[] Zarr(int n , int[] S) {
		int[] Z = new int[n];
		Z[0] = n;
		int l = 0;
		int r = 0;
		for( int i=1 ;i<n ;i++)
		{
			if(i > r)
			{
				l = r = i;
				while( r<n && S[r] == S[r-l])
				{
					r++;
				}
				Z[i] = r-l;
				r--;
			}
			else
			{
				if( i + Z[i-l] <= r)
				{
					Z[i] = Z[i-l];
				}
				else {
					l = i;
					while( r < n && S[r-l] == S[r])
					{
						r++;
					}
					Z[i] = r-l;
					r--;
				}
			}
		}
		return Z;
	}
	public static void main(String[] args) {
		int[] S = {1 , 0 , 0 , 1};
		int n = 4;
		int[] Z = Zarr(n , S); 
		for( int i=0 ;i<n ;i++)
		{

			System.out.println(Z[i]);
		}
		
	}

}
