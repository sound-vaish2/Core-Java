package com.vs.java.Labbook.Lab1;
import java.util.Scanner;
public class BankAccount {
	String FirstName;
	String LastName;
	int Age;
	String Gender;
	public BankAccount() {
		
	}
	void SavingAccount(String FirstName,String LastName ,int Age,String Gender) {//
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		this.Gender = Gender;
		System.out.println("Your Account Details: ");
		System.out.println("---------------------");
		System.out.println("Account Type: Saving ");
		System.out.println("Full Name: " + FirstName + " " + LastName);
		System.out.println("Age : " + Age);
		System.out.println("Gender : " + Gender);
	}
	void CurrentAccount(String FirstName,String LastName,int Age,String Gender) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		this.Gender = Gender;
		System.out.println("Your Account Details: ");
		System.out.println("---------------------");
		System.out.println("Account Type: Current ");
		System.out.println("Full Name: " + FirstName + " " + LastName);
		System.out.println("Age : " + Age);
		System.out.println("Gender : " + Gender);
	}
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Account you want to create ?" + "\n" + " 1. Saving" + "\n" + " 2. Current");
		int AccType = sc.nextInt();
		
		if(AccType== 1 )
		{	
			System.out.println("Enter your details in format: firstName, LastName , age , gender");
			obj.SavingAccount(sc.next(), sc.next(), sc.nextInt(), sc.next());//,
		}
		else
		{
			System.out.println("Enter your details in format: firstName, LastName , age , gender");
			obj.CurrentAccount(sc.next(), sc.next(), sc.nextInt(), sc.next());
		}
		
		sc.close();
	}

}
