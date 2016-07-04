package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizinginstantiationlogic.case1;

import java.awt.Color;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

	private String model;
	private Color color;
	private double price;

	@Override
	public Car getObject() throws Exception {
		return new Car(model, color, price);
	}

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
