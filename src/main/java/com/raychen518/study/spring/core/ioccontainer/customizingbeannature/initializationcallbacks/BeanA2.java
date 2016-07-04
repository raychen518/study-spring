package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.initializationcallbacks;

import javax.annotation.PostConstruct;

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

	@PostConstruct
	public void initialize() {
		System.out.println("Initializing Bean Using the Approach #2: Adding the @PostConstruct Annotation");
		System.out.println("Note: This approach is recommended and generally considered the best practice.");
	}

}
