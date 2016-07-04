package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.innerbeans;

public class BeanAConstructorBased {

	private BeanB field1;
	private BeanC field2;

	public BeanAConstructorBased(BeanB field1, BeanC field2) {
		this.field1 = field1;
		this.field2 = field2;
	}

	public void doSomething() {
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
	}

	public static void main(String[] args) {
		BeanAConstructorBased beanA = new BeanAConstructorBased(new BeanB(123, "abc"), new BeanC(456, "def"));

		beanA.doSomething();
	}

}
