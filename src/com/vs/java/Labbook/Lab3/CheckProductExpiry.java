package com.vs.java.Labbook.Lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/*
 * Problem Statement:
 * Create a method to accept product purchase date and warrantee period (in terms of months and years). 
 * Print the date on which warrantee of product expires.
 */
public class CheckProductExpiry {

	public CheckProductExpiry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter the Product Manufactor date : ");
		String Product_date = sc.next();
		System.out.println("Enter the warranty period in terms of months : ");
		int Warranty_period = sc.nextInt();
		sc.close();
		LocalDate date = LocalDate.parse(Product_date, formatter);
		System.out.println("The Expiry date of product is: ");
		System.out.println( date.plusMonths(Warranty_period));
	}

}
