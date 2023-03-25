package com.prowings.languageBasics.deepCloning;

public class Engine implements Cloneable {

	String make ;
	int model ;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(String make, int model) {
		super();
		this.make = make;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [make=" + make + ", model=" + model + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
