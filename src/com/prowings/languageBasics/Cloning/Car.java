package com.prowings.languageBasics.Cloning;

public class Car implements Cloneable{

	String name="Fortuner";
	Double price=5000000d;
	Engine engine;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, Double price, Engine engine) {
		super();
		this.name = name;
		this.price = price;
		this.engine=engine;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "Engine : "+engine+"]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Engine engine =new Engine(2020, "XUV");
		Car car1=new Car("Fortuner", 5000000d, engine);
		System.out.println(car1);
		System.out.println();
		
		Car car2=(Car)car1.clone();
		System.out.println(car2);
      		
	}
	
	
	
	
	
	
	
}
