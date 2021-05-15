package com.vs.java.StringManipulation;

public class ReverseStringByWords {

	public static void main(String[] args) {
//		
			String A = "the sky is blue";
		 	String res[]=A.split("\\s+");
		 	
	 	    String temp="";
		    for(String t:res) {
		    	//System.out.print(t);
			    temp=t+ " " + temp;
	     	}
	        temp=temp.trim();
	        System.out.println(temp);
	        
	        
//	        String result = swap(A);
//	        System.out.println(result);
	}

}
/*	public static String swap(String A) {
		//String temp = "";
		int i = 0, j = A.length()-1;
		while( i <= j)
		{
			char t = A.charAt(i);
			char t1 = A.charAt(j);
			char t2 = t;
			t = t1;
			t1 = t2;
			A.replace(t, t1);
			A.replace(t1, t2);
			i++;
			j--;
		}
		
		return A;
		
	}*/