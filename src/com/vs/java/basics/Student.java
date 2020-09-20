package com.vs.java.basics;
//understanding of objects and classes
public class Student {
	int rollno;
	String name;
	String addr;
	static String Pname;
	public void StudentInfo(int rollno ,String name){
		System.out.println(rollno);
		System.out.println(name);
	}
	public void Address(String addr) {
		System.out.println(addr);
	}
	public static void StudentParentInfo(String Pname){
		System.out.println(Pname);
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		Workplace obj1 = new Workplace();
		obj.StudentInfo(1, "navin");
		obj.StudentInfo(2, "delen");
		obj.Address("Lime RD ,Houseno:54");
		StudentParentInfo("david");
		StudentParentInfo("john");
		obj1.EmployeeName("navin");
		
	}
	
}
class Workplace{
	String newname;
	public Workplace() {
		// TODO Auto-generated constructor stub
	}
	void EmployeeName(String name) {
		this.newname = name;
		System.out.println("this is a employee  : " + newname);
	}
}
