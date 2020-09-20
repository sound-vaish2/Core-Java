package com.vs.java.inheritance;

public class CustomerChoice {
	String bikename;
	String carname;
	String bikecost;
	String carcost;
	public CustomerChoice() {
		// TODO Auto-generated constructor stub
	}
	public void BikeChoice(int ch1) {
		if (ch1 == 1) {
		this.bikename = "Harley-Davidson" ;
		this.bikecost = "$3000";
		}
		else if (ch1 == 2) {
			this.bikename = "Bugati" ;
			this.bikecost = "$2500";
		}
		else if (ch1 == 3) {
			this.bikename = "Kawaski" ;
			this.bikecost = "$1500";
		}
		else {
			this.bikename = "Yamaha" ;
			this.bikecost = "$2000";
		}
	}
	
	public void CarsChoice(int ch1) {
		if (ch1 == 1) {
			this.carname = "Lamborghini" ;
			this.carcost = "$98000";
		}
		else if (ch1 == 2) {
			this.carname = "BMW" ;
			this.carcost = "$80000";
		}
		else if (ch1 == 3) {
			this.carname = "Bugati" ;
			this.carcost = "$89000";
		}
		else {
			this.carname = "Land Rover" ;
			this.carcost = "$78000";
		}
		}
	
}

