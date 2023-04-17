package com.prowings.languageBasics.Cloning;

public class Person implements Cloneable{

	String name;
	int pid;
	Family family;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int pid, Family family) {
		super();
		this.name = name;
		this.pid = pid;
		this.family = family;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", family=" + family + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		Family family=new Family("Pandurang", "Rukmini");
		Person person1=new Person("Navnath", 10, family);
		System.out.println(person1);
		System.out.println();
		
		Person person2=(Person)person1.clone();
		System.out.println(person2);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
