package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.initializationcallbacks;

import org.springframework.beans.factory.InitializingBean;

public class BeanA1 implements InitializingBean {

	private int field1;

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public static void main(String[] args) {
		BeanA1 bean = new BeanA1();
		bean.setField1(123);
		System.out.println("bean.getField1(): " + bean.getField1());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean Using the Approach #1: Implementing the InitializingBean Interface");
		System.out.println("Note: This approach is not recommended due to code coupling to Spring.");
	}

}
