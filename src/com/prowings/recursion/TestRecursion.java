package com.prowings.recursion;

public class TestRecursion {

	public static int factorial(int n) {
		if (n != 0)
			return n * factorial(n - 1);
		else
			return 1;

	}

	public static void main(String[] args) {
		int res = factorial(5);
		System.out.println(res);

	}

}
