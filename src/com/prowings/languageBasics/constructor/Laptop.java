package com.prowings.languageBasics.constructor;

public class Laptop {

	String name;
	int batteryCapacity;
	double price;
	Properties properties;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, int batteryCapacity, double price, Properties properties) {
		super();
		this.name = name;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
		this.properties = properties;

	}

	public Laptop(Laptop laptop) {
		this.name = laptop.name;
		this.batteryCapacity = laptop.batteryCapacity;
		this.price = laptop.price;

		Properties copyproperties = new Properties();
		copyproperties.memory=laptop.properties.memory;
		copyproperties.ram=laptop.properties.ram;
		copyproperties.ssd=laptop.properties.ssd;
		this.properties = copyproperties;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", batteryCapacity=" + batteryCapacity + ", price=" + price + ", properties="
				+ properties + "]";
	}

	public static void main(String[] args) {
		Properties properties=new Properties(128, 10, 500);
		Laptop laptop1 =new Laptop("DELL", 5000, 70000, properties);
		System.out.println(laptop1);
		System.out.println();
		
		Laptop laptop2=new Laptop(laptop1);
		System.out.println(laptop2);
		
		
		
		
		
		
		
		
	}

}
