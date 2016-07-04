package com.raychen518.study.spring.core.ioccontainer.dependencies.lazyinitialized;

public class SomeBean1 {

	private int field1;

	public void doSomething() {
		System.out.println("field1: " + field1);
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public static void main(String[] args) {
		SomeBean1 someBean = new SomeBean1();

		someBean.setField1(123);

		someBean.doSomething();
	}

}
