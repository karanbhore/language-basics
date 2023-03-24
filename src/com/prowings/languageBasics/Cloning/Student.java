package com.prowings.languageBasics.Cloning;

public class Student implements Cloneable {

	int roll;
	String name;
	String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(10, "Ram", "Pune");

		Student s2 = (Student) s1.clone();

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		System.out.println(">>>>>>>>>>><<<<<<<<<<<");
		Student s3 = s1;

		System.out.println(s3);
		System.out.println("<<<<<<<<<>>>>>>>>>>>>>>");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		System.out.println(">>>>>>>>>><<<<<<<<<<<");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));

		s1.name = "Sham";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
