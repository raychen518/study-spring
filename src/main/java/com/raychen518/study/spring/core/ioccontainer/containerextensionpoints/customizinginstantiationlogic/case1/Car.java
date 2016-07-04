package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizinginstantiationlogic.case1;

import java.awt.Color;

public class Car {

	private String model;
	private Color color;
	private double price;

	public Car(String model, Color color, double price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		String description = "";

		description += super.toString() + "[";
		description += "model: " + model + ", ";
		description += "color: " + color + ", ";
		description += "price: " + price;
		description += "]";

		return description;
	}

	public static void main(String[] args) {
		Car car = new Car("HTNF-001", Color.RED, 12345.67);
		System.out.println(car);
	}

}
