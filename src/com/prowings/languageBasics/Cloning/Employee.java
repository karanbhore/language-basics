package com.prowings.languageBasics.Cloning;

public class Employee implements Cloneable{
	int empId;
	String name;
	Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address=new Address(123, "Pune", "India");
		
		Employee emp1=new Employee(10, "Ram", address);
		
		System.out.println("Before changing address Emp1:"+emp1);
		
		Employee emp2=(Employee)emp1.clone();
		
		System.out.println("Before changing address Emp2: "+emp1);
		
		System.out.println("Emp ref equality: "+(emp1==emp2));
		System.out.println("Adress  reference equality: "+(emp1.address==emp2.address));
		emp1.name="Sham";
		emp1.address.city="Mumbai";
		
		System.out.println("After changing address Emp1: "+emp1);
		System.out.println("After changing address Emp2: "+emp2);
		
	}

	
}
