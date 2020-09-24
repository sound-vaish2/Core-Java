package com.vs.java.person;
import java.util.Scanner;
import java.util.*;
public class MainClass {
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the entries you want to make: ");
		int No_Of_Emp;
		No_Of_Emp = sc.nextInt();
		int count = 0 ;
		ArrayList<EmployeeClass> details = new ArrayList<EmployeeClass>();
		EmployeeClass person = new EmployeeClass();
		BankAccount Account = new BankAccount() ;
		Account.AccountNo = 123456;
		Account.IFSCcode = 5373888;
		Account.MobNo = 98762545;
		while(count != No_Of_Emp) {
			person.EmployeeClass(sc.next(),sc.next(),sc.next(),sc.nextInt(),Account);
			details.add(person);
			//details.add(Account);
		count++;
		}
		Account.SavingAccount(Account);
		//person.EmployeeClass(Account);
		person.SavingAccount(233443,213443,12322222);
		System.out.println(person);	
		//System.out.println(details);
		
		
		sc.close();
	}

	

}
//Scanner sc = new Scanner(System.in);
//System.out.println(" Enter your FirstName : " );
//String FirstName = sc.nextLine();
//System.out.println(" Enter your LastName : " );
//String LastName = sc.nextLine();
//System.out.println(" Enter your gender in M or F format : " );
//String Gender = sc.nextLine();
//System.out.println(" Enter your age : " );
//int age = sc.nextInt();
//System.out.println(" Enter your weight : " );
//float weight = sc.nextFloat();
//sc.close();
//System.out.println("Person Details:");
//System.out.println("---------------");
//System.out.println("FirstName : " + FirstName);
//System.out.println("LastName  :" + LastName);
//System.out.println("Gender: " + Gender);
//System.out.println("Age" + age);
//System.out.println("Weight" + weight);
//