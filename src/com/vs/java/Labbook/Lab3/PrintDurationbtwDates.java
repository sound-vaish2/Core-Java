package com.vs.java.Labbook.Lab3;

import java.time.LocalDate;
//import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
/*
Problem Statement: 
1. Create a method to accept date and print the duration in days, 
months and years with regards to current system date.
2. Revise exercise 1 to accept two LocalDates and print the duration between dates in days,
 months and years
 */

public class PrintDurationbtwDates {

	public PrintDurationbtwDates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter the date in format of :  dd/mm/yyyy");
		String text = sc.next();
		sc.close();
		LocalDate start = LocalDate.parse(text, formatter);
		LocalDate end = LocalDate.now();
		System.out.println("Start date :" + start);
		System.out.println("End date : " + end);
		Period period = start.until(end);
		System.out.println("The duration in days, months and years with regards to current system date are :");
		System.out.println("Days : "+ period.get(ChronoUnit.DAYS));
		System.out.println("Months : "+ period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+ period.get(ChronoUnit.YEARS));
		
		//Next question continued..
		//for second uncomment this below lines
		
//		String date1 = sc.next();
//		String date2 = sc.next();
//		sc.close();
//		LocalDate start1 = LocalDate.parse(date1, formatter);
//		LocalDate end1 = LocalDate.parse(date2, formatter);
//		Period period1 = start1.until(end1);
//		System.out.println("Days : "+ period1.get(ChronoUnit.DAYS));
//		System.out.println("Months : "+ period1.get(ChronoUnit.MONTHS));
//		System.out.println("Years : "+ period1.get(ChronoUnit.YEARS));
//		
				
	}

}
