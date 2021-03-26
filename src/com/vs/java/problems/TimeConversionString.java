package com.vs.java.problems;

public class TimeConversionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "04:59:59PM";
		String result;
        int time = 0;//int time
        String sub1 = s.substring(0,2);//first two numbers
        String sub2 = s.substring(8,10);//last two vlue
        System.out.println(sub2);
        System.out.println(sub1);
        if(sub2.equals("AM")){//check PM or not
           if(sub1.equals("12")){
               time = 12 - Integer.parseInt(sub1);
               System.out.println("here");
           }
           else{
               time = Integer.parseInt(sub1);
           }
         
        }                   
       else{
           if(sub1.equals("12")){
               time = Integer.parseInt(sub1); 
               System.out.println("here");
           }
           else{
               time = 12 + Integer.parseInt(sub1);
              // System.out.println("here");
           }
          
       }
       //System.out.print(time);
        result = Integer.toString(time) + s.substring(2,8);
        System.out.print(result);
        
	}

}
