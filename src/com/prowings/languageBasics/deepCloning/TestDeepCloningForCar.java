package com.prowings.languageBasics.deepCloning;

public class TestDeepCloningForCar {
	public static void main(String[] args) throws CloneNotSupportedException {
		Engine engine = new Engine("air cool engine", 1996);
		Car car1 = new Car("Maruti Suzuki", 1997, "Alto k10", engine);
		System.out.println("first car is produced!!!");
		System.out.println(car1);
		System.out.println("<<<<<<<<<<<>>>>>>>>>>>>>");

		Car car2 = (Car) car1.clone();
		System.out.println(car2);
		System.out.println("second car is produced!!!");
		System.out.println("<<<<<<<>>>>>>>>>>>>>");

		System.out.println("car ref equality : " + (car1 == car2));
		System.out.println("engine ref equality : " + (car1.engine == car2.engine));
		System.out.println("content equality : " + car1.equals(car2));
		System.out.println("<<<<<<<>>>>>>>>>>>");

		car2.engine.make = "Water cool engine";
		car2.engine.model = 2000;
		System.out.println("after changing engine : " + car2);
		System.out.println("content equality : " + car1.equals(car2));
		System.out.println("<<<<<<<<<<>>>>>>>>>>");

		Car car3 = new Car("Maruti Suzuki", 1997, "Alto k10", engine);
		System.out.println(car3);
		System.out.println("car ref equality : " + (car1 == car3));
		System.out.println("engine ref equality : " + (car1.engine == car3.engine));
		System.out.println("content equality : " + car1.equals(car3));
		System.out.println("<<<<<<<>>>>>>>>>>>");

		Car car4 = car1;
		System.out.println(car3);
		System.out.println("car ref equality : " + (car1 == car4));
		System.out.println("engine ref equality : " + (car1.engine == car4.engine));
		System.out.println("content equality : " + car1.equals(car4));
		System.out.println("<<<<<<<>>>>>>>>>>>");

	}
}
