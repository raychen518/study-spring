package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.required;

import org.springframework.beans.factory.annotation.Required;

public class SomeBean {

	private int field1;
	private String field2;
	private boolean field3;

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	@Required
	public void setField2(String field2) {
		this.field2 = field2;
	}

	public boolean isField3() {
		return field3;
	}

	public void setField3(boolean field3) {
		this.field3 = field3;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
		System.out.println("field3: " + field3);
	}

	public static void main(String[] args) {
		SomeBean bean = new SomeBean();
		bean.doSomething();
	}

}
