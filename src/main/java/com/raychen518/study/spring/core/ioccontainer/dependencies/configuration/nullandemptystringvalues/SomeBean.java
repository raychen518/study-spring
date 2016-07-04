package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.nullandemptystringvalues;

public class SomeBean {

	private String field1;
	private String field2;

	public void doSomething() {
		System.out.println("\"\".equals(field1): " + "".equals(field1));
		System.out.println("(field2 == null): " + (field2 == null));
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public static void main(String[] args) {
		SomeBean someBean = new SomeBean();

		someBean.setField1("");
		someBean.setField2(null);

		someBean.doSomething();
	}

}
