package com.vs.java.Labbook.Lab1;
import java.util.Scanner;
public class InsuranceScheme {

	private static final String Manager = null;
	private static final String System_Associate = null;
	private static final String Programmer = null;

	public static void main(String[] args) {
		
		long Salary ;
		String Designation ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Your Salary ?" );
		Salary = sc.nextLong();
		System.out.println(" Your Designation ?" );
		Designation = sc.next();
		System.out.println("You are aplible for :  ");
		if (Salary < 2000 && Designation == System_Associate)
		{
			
			System.out.println("Scheme C");
			System.out.println("Your Designation : System Associate");
		}
		else if(2000<=Salary || Salary <4000 && Designation == Programmer)
		{
			System.out.println("Scheme B");
			System.out.println("Your Designation : Programmer");
		}
		else if(Salary >= 4000 && Designation == Manager)
		{
			System.out.println("Scheme A");
			System.out.println("Your Designation : Manager");
		}
		else 
		{
			System.out.println("No Scheme");
			System.out.println("Your Designation : Clerk");
		}
		sc.close();
	}

}
