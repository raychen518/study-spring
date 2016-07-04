package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizingconfigurationmetadata.case1;

public class SomeBean {
	private int field1;
	private String field2;
	private boolean field3;

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": field1: " + field1);
		System.out.println(getClass().getSimpleName() + ": field2: " + field2);
		System.out.println(getClass().getSimpleName() + ": field3: " + field3);
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public void setField3(boolean field3) {
		this.field3 = field3;
	}

}
