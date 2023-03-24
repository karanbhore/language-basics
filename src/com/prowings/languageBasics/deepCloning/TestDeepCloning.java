package com.prowings.languageBasics.deepCloning;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address=new Address(123, "Pune", "India");
		
		Employee emp1=new Employee(10, "Ram", address);
		
		System.out.println("before changing address Emp1:"+emp1);
		
		Employee emp2=(Employee)emp1.clone();
		
		
		System.out.println("before changing address Emp2:"+emp2);
		
		System.out.println("Emp ref equality:"+(emp1==emp2));
		System.out.println("Address ref equality: "+(emp1.address==emp2.address));
		
		emp1.address.city="Mumbai";
		
		System.out.println("After changing Address emp1: "+emp1);
		System.out.println("After changing Address emp2: "+emp2);
		
		
		
	}
}
