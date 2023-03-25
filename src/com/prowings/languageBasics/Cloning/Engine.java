package com.prowings.languageBasics.Cloning;

public class Engine {

	int model = 1995;
	String make = "Air Cool Engine";

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
