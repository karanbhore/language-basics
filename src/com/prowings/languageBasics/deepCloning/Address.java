package com.prowings.languageBasics.deepCloning;

public class Address implements Cloneable {

	int pin;
	String city;
	String country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pin, String city,String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.country=country;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "country ="+country+"]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
