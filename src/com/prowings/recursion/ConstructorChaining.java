package com.prowings.recursion;

public class ConstructorChaining {

	String s;
	int a;

	public ConstructorChaining() {

		System.out.println("hello");
	}

	public ConstructorChaining(String s) {
		super();
		System.out.println("hi");
	}

	public ConstructorChaining(int a) {
		this("s", a);
	}

	public ConstructorChaining(String s, int a) {
		this(s);
//		this();
	}

	@Override
	public String toString() {
		return "ConstructorChaining []";
	}

	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining(4);
		System.out.println(obj);

	}

}
