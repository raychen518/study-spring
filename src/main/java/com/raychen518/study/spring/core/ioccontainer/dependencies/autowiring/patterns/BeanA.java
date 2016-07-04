package com.raychen518.study.spring.core.ioccontainer.dependencies.autowiring.patterns;

public class BeanA {

	private BeanC field1;
	private String field2;

	public void doSomething() {
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
	}

	public void setField1(BeanC field1) {
		this.field1 = field1;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();

		bean.setField1(new BeanC());
		bean.setField2("Some Text");

		bean.doSomething();
	}

}
