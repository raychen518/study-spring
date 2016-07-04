package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.cnamespace;

public class SomeBean {

	private int field1;
	private SomeOtherBean field2;

	public SomeBean(int field1, SomeOtherBean field2) {
		this.field1 = field1;
		this.field2 = field2;
	}

	public void doSomething() {
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
	}

	public static void main(String[] args) {
		SomeBean someBean = new SomeBean(123, new SomeOtherBean());
		someBean.doSomething();
	}

}
