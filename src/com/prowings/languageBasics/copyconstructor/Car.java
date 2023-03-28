package com.prowings.languageBasics.copyconstructor;

public class Car {

	Engine engine;
	Double price;
	String name;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engine, Double price, String name) {
		super();
		this.engine = engine;
		this.price = price;
		this.name = name;
	}

	public Car(Car car) {
		this.price = car.price;
		this.name = car.name;

//		this.engine = car.engine;
		Engine copyEngine = new Engine();
		copyEngine.make = car.engine.make;
		copyEngine.model = car.engine.model;

		this.engine = copyEngine;

	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", price=" + price + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Engine engine = new Engine(2020, "luxury");
		Car car = new Car(engine, 5000000d, "Fortuner");
		System.out.println(car);
		System.out.println();

		Car car2 = new Car(car);
		System.out.println(car2);
		System.out.println();

		System.out.println(car == car2);
		System.out.println(car.engine == car2.engine);
		System.out.println();

		car.price = 4000000d;
		System.out.println(car);
		System.out.println(car2);
	}

}
