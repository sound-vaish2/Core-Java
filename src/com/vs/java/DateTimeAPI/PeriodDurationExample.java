package com.vs.java.DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationExample {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(1987, Month.APRIL, 18);
		LocalDate end = LocalDate.now();
		System.out.println("Start date :" + start);
		System.out.println("End date : " + end);
		Period period = start.until(end);
		//ChronoUnit =  Unit that represents the concept of a nanosecond,
		//the smallest supported unit of time.
		System.out.println("Days : "+ period.get(ChronoUnit.DAYS));
		System.out.println("Months : "+ period.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+ period.get(ChronoUnit.YEARS));
		//returns only the days
		System.out.println("getdays" + period.getDays());
		//given date is positive if it is after January 1,1970  but if it is before
		//January 1,1970 then it is considered as negative
		System.out.println(period.isNegative());
		//Zero period is said to be when it has zero values for day month and years
		System.out.println(period.isZero());
		
		
	}

}
