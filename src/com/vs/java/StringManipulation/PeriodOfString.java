package com.vs.java.StringManipulation;

/*
 * Given a string A of length N consisting of lowercase alphabets. Find the period of the string.
 * Period of the string is the minimum value of k (k >= 1), that satisfies A[i] = A[i % k] for all valid i.
*/ 
 

// Solved by using Z algorithm 
//Time complexity :  O(n) 
public class PeriodOfString {
	//Function to find Z array 
	public static int[] Zarr( int n , char[] S)
    {
        int[] Z = new int[n];
        int l = 0, r =0 ;
        Z[0] = n;
        for( int i=1 ;i<n ;i++){
            if(i > r)
            {
                l = r = i;
                while(  r<n && S[r] == S[r-l]){
                    r++;
                }
                Z[i] = r-l;
                r--;
            }
            else
            {
                if(i+Z[i-l] <= r)
                {
                    Z[i] = Z[i-l];
                }
                else
                {
                    l = i;
                    while( r<n && S[r] == S[r-l])
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
		// uncommet to try out different examples
		//String A = "abababab";
		//String A = "aaaa";
		//String A = "hqhq";
		String A = "abababababb";	
	
		
		int n = A.length();
        char[] Arr = A.toCharArray();
        int[] Z = Zarr(n, Arr); 
        int cnt = 0;
        int[] res = new int[2];
        int k=0;
        int flag = 0;
        for( int i = 0 ; i<n ; i++)
        {
            if((Z[i] + i) == n)
            {
                res[k] = i;
                if(k == 1)
                {
                	flag = 1;
                    break;
                }
                k++;
                
            }
        }
        if( flag == 0)
        {
        	System.out.println(n);
        	System.out.println("\n");
        }
        else
        {
        	System.out.println(res[1] - res[0]);
        	System.out.println("\n");
        }
        //display the Z array
//        for( int i=0 ;i <n ;i++)
//        {
//        	System.out.print(Z[i] + " ");
//        }
//     
        

	}

}
