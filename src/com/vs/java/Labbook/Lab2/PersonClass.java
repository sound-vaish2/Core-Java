package com.vs.java.Labbook.Lab2;

public class PersonClass {
	String FirstName;
	String LastName;
	int age;
	String gender;
	float weight;
	long mob_num;
	
	public PersonClass(String firstName, String lastName , int age , String gender , float weight, long mob_num ) {
			super();
			this.FirstName = firstName;
			this.LastName = lastName;
			this.age = age;
			this.gender = gender;
			this.weight = weight;
			this.mob_num = mob_num;
	}
	
	@Override
	public String toString() {
		return "FirstName : " + FirstName + "\n" + "LastName : " + LastName + "\n" + "age : " + age + "\n" + "gender : " + gender
				+ "\n" + "weight : " + weight + "\n" + "Mobile Number : " + mob_num ;
	}
//	public String getFirstName() {
//		return FirstName;
//	}
//	public void setFirstName(String firstName) {
//		FirstName = firstName;
//	}
//	public String getLastName() {
//		return LastName;
//	}
//	public void setLastName(String lastName) {
//		LastName = lastName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public float getWeight() {
//		return weight;
//	}
//	public void setWeight(float weight) {
//		this.weight = weight;
//	}
	
	

}
