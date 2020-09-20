package com.vs.java.inheritance;

import java.util.Scanner;

//Inheritance example

public class Showroom {
	
	public Showroom() {
		// TODO Auto-generated constructor stub
	}
	public void Typeof(){
		System.out.println("We have two types of Automobiles");
		System.out.println("1. Bikes");
		System.out.println("2. Cars");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showroom obj = new Showroom();
		obj.Typeof();
		System.out.println("Which you wanna buy? \nChoose one..");
		//object created to excess the values
		Bikes obj1 = new Bikes();
		Cars obj2 = new Cars();
		CustomerChoice obj3 = new CustomerChoice();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if(ch == 1){
			obj1.BikeName();
			obj1.BikeCost();
		}
		else {
			obj2.CarsName();
			obj2.CarsCost();
		}
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int ch1 = sc1.nextInt();
		System.out.println("The choices that you made are: ");
		if(ch == 1)
		{
			obj3.BikeChoice(ch1);
			System.out.println("Bike name:" + obj3.bikename);
			System.out.println("The cost of the bike:"+ obj3.bikecost);
		}
		else
		{
			obj3.CarsChoice(ch1);
			System.out.println("Car name:" + obj3.carname);
			System.out.println("The cost of the car:" + obj3.carcost);
		}
		}
}
