package com.vs.java.polymorphism;
//polymorphism example
//method overriding
//method overriding -- same names but in different classes
//can have same function signatures
public class Company {
	String newname;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	void EmployeeName(String name) {
		this.newname = name;
		System.out.println(newname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company obj = new Company();
		Branch obj1 = new Branch();
		obj.EmployeeName("johnny");
		obj1.EmployeeName("gonsalvis");
	}

}
final class Branch extends Company
{
	@overriden
	void EmployeeName(String name){
		System.out.println(name);
	}
}