package com.prowings.languageBasics.deepCloning;

public class Car implements Cloneable {

	String company ;
	int model ;
	String name ;
	Engine engine;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String company, int model, String name, Engine engine) {
		super();
		this.company = company;
		this.model = model;
		this.name = name;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", name=" + name + ", engine=" + engine + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Car clonedCar = (Car) super.clone();
		clonedCar.engine = (Engine) engine.clone();

		return clonedCar;

	}
}
