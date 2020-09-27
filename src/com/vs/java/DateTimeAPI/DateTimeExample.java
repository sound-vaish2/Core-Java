package com.vs.java.DateTimeAPI;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//import java.time.Month;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
//import java.util.Date;
//Date Time methods
public class DateTimeExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		//returns todays date
		System.out.println("date :" + date);
		LocalDate date1 = LocalDate.of(1987,Month.AUGUST, 13);
		System.out.println("date from  :" + date1);
		System.out.println("date :" + date.plusDays(1));
		System.out.println("date :" + date.plusMonths(1));
		System.out.println("two days before :" + date.minusDays(2));
		System.out.println("Is it a leap year? :" + date.isLeapYear());
		System.out.println("is the dates equal :" + date.isEqual(date1));
		System.out.println("is the date is before date1: " + date.isBefore(date1));
		System.out.println("is the date1 is before date: " + date1.isBefore(date));
		System.out.println("is the date is before date1: " + date.isBefore(date));
		System.out.println("date :" + date.withDayOfMonth(30));
		System.out.println("date :" + date.withDayOfYear(12));
		System.out.println("date :" + date.withYear(2000));
		System.out.println("date :" + date.withMonth(06));
		System.out.println("date :" + date.with(date1));
		//returns various parts of date
		System.out.println("date :" + date.getDayOfMonth());
		ZonedDateTime currentTime = ZonedDateTime.now();
		System.out.println("current time :" + currentTime);
		ZonedDateTime currentZoneTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("current time :" +  currentZoneTime);
		System.out.println("time :" + time);
		//Date Time Formatter methods
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(date.format(formatter));
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String text = "12/04/2017";
		LocalDate dateNew = LocalDate.parse(text, formatter1) ;
		System.out.println("Date format :"+ dateNew);
		}

}
