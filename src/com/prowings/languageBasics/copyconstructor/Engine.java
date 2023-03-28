package com.prowings.languageBasics.copyconstructor;

public class Engine {

	int model=2020;
	String make="luxury";
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int model, String make) {
		super();
		this.model = model;
		this.make = make;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + ", make=" + make + "]";
	}
	
	
}
