package com.prowings.languageBasics.copyconstructor;

public class Employee {

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

	public Employee(Employee emp) {
		this.empId = emp.empId;
		this.name = emp.name;
		this.address = emp.address;

		Address copyAdr = new Address();
		copyAdr.pin = emp.address.pin;
		copyAdr.city = emp.address.city;
		copyAdr.country = emp.address.country;

		this.address = copyAdr;

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
