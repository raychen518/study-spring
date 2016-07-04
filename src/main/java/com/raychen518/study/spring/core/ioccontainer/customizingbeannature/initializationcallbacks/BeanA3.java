package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.initializationcallbacks;

public class BeanA3 {

	private int field1;

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public static void main(String[] args) {
		BeanA3 bean = new BeanA3();
		bean.setField1(123);
		System.out.println("bean.getField1(): " + bean.getField1());
	}

	public void initialize() {
		System.out.println("Initializing Bean Using the Approach #3: Setting the init-method Attribute");
	}

}
