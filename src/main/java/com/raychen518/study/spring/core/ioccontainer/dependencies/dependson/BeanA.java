package com.raychen518.study.spring.core.ioccontainer.dependencies.dependson;

public class BeanA {

	private BeanB field1;
	private BeanC field2;

	public BeanA() {
		System.out.println("Initialized " + getClass().getName());
	}

	public void doSomething() {
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
	}

	public void setField1(BeanB field1) {
		this.field1 = field1;
	}

	public void setField2(BeanC field2) {
		this.field2 = field2;
	}

	public static void main(String[] args) {
		BeanA beanA = new BeanA();

		beanA.setField1(new BeanB());
		beanA.setField2(new BeanC());

		beanA.doSomething();
	}

}
