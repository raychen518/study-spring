package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.destructioncallbacks;

import javax.annotation.PreDestroy;

public class BeanA2 {

	private int field1;

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public static void main(String[] args) {
		BeanA2 bean = new BeanA2();
		bean.setField1(123);
		System.out.println("bean.getField1(): " + bean.getField1());
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroying Bean Using the Approach #2: Adding the @PreDestroy Annotation");
		System.out.println("Note: This approach is recommended and generally considered the best practice.");
	}

}
