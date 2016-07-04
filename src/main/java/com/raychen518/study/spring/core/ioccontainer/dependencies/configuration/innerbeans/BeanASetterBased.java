package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.innerbeans;

public class BeanASetterBased {

	private BeanB field1;
	private BeanC field2;

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
		BeanASetterBased beanA = new BeanASetterBased();

		beanA.setField1(new BeanB(123, "abc"));
		beanA.setField2(new BeanC(456, "def"));

		beanA.doSomething();
	}

}
