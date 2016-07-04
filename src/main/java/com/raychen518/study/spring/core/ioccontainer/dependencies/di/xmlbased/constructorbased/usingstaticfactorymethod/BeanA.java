package com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.constructorbased.usingstaticfactorymethod;

import com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.BeanB;
import com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.BeanC;

public class BeanA {

	private static BeanA instance = null;

	private BeanB field1;
	private BeanC field2;
	private String field3;

	private BeanA(BeanB value1, BeanC value2, String value3) {
		this.field1 = value1;
		this.field2 = value2;
		this.field3 = value3;
	}

	public static BeanA createInstance(BeanB value1, BeanC value2, String value3) {
		if (instance == null) {
			instance = new BeanA(value1, value2, value3);
		}

		return instance;
	}

	public void doSomething() {
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
		System.out.println("field3: " + field3);
	}

	public static void main(String[] args) {
		BeanA beanA = BeanA.createInstance(new BeanB(), new BeanC(), "Some Text");
		beanA.doSomething();
	}

}
