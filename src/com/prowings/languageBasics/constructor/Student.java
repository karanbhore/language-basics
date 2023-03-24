package com.prowings.languageBasics.constructor;

public class Student {

	int roll;
	String name;
	String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rno,String nm)
	{
		this(nm,rno,"Mumbai");
		System.out.println("Student(int rno,String nm)--invoked");
	}
	
	public Student(String nm,int rno,String add)
	{
		super();
		this.roll=rno;
		name=nm;
		address=add;
		
		System.out.println("student(String nm,int rno,String add)--invoked");
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Student s1=new Student(30,"ABC");
		System.out.println(s1);
		
	}
	
}





















