package com.vs.java.problems;

import java.util.Stack;

public class getMinElement {
	int minEle;
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();
    int Min = 1001;
    /*returns min element from stack
*/
    int getMin()
    {
	// Your code here9
	    minEle = min.peek();
	    
	   // if( temp == -1)
	   // {
	   //     return temp;
	   // }
	    return minEle;  
    }
    
    /*returns poped element from stack*/
    int pop()
    {
		if(s.isEmpty())
		{
		    return -1;
		}
		else
		{
		    min.pop();
		    return s.pop();
		}
    }

    /*push element x into the stack*/
    void push(int x)
    {	
    	if(s.isEmpty())
        {
            s.push(x);
            minEle = x;
        }
        else
        {
            s.push(x);
            int temp = x;
            if(temp < minEle)
            {
                minEle = temp;   
            }
            min.push(minEle);
        //s.push(x);
        }
    	
        //s.push(x);
        
	// Your code here	
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMinElement g = new getMinElement();
		g.push(2);
		g.push(5);
		System.out.println(g.getMin());
		g.push(1);
		System.out.println(g.getMin());
		g.push(4);
		g.push(6);
		g.push(0);
		g.push(1);
		System.out.println(g.getMin());
		g.pop();
		g.pop();
		System.out.println(g.getMin());
		}

}
