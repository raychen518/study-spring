package com.raychen518.study.spring.core.ioccontainer.dependencies.lazyinitialized;

public class SomeBean2 {

	private int field1;

	public void doSomething() {
		System.out.println("field1: " + field1);
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public static void main(String[] args) {
		SomeBean2 someBean = new SomeBean2();

		someBean.setField1(123);

		someBean.doSomething();
	}

}
