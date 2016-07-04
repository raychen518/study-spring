package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.compoundpropertynames;

public class BeanA {

	private BeanB fieldA1 = new BeanB();

	public void doSomething() {
		System.out.println("fieldA1: " + fieldA1);
	}

	public BeanB getFieldA1() {
		return fieldA1;
	}

	public void setFieldA1(BeanB fieldA1) {
		this.fieldA1 = fieldA1;
	}

	public static void main(String[] args) {
		BeanA beanA = new BeanA();
		beanA.doSomething();
	}

}
