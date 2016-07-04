package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.destructioncallbacks;

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

	public void destroy() {
		System.out.println("Destroying Bean Using the Approach #3: Setting the destroy-method Attribute");
	}

}
