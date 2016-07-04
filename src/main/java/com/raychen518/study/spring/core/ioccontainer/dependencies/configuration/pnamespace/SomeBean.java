package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.pnamespace;

public class SomeBean {

	private int field1;
	private SomeOtherBean field2;

	public void doSomething() {
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public void setField2(SomeOtherBean field2) {
		this.field2 = field2;
	}

	public static void main(String[] args) {
		SomeBean someBean = new SomeBean();

		someBean.setField1(123);
		someBean.setField2(new SomeOtherBean());

		someBean.doSomething();
	}

}
