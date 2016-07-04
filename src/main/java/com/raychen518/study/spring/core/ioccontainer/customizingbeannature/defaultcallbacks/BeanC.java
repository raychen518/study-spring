package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.defaultcallbacks;

public class BeanC {

	private int field1;

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public static void main(String[] args) {
		BeanC bean = new BeanC();
		bean.setField1(123);
		System.out.println("bean.getField1(): " + bean.getField1());
	}

	public void initialize() {
		System.out.println("Initializing Bean: " + getClass().getSimpleName());
	}

	public void destroy() {
		System.out.println("Destroying Bean: " + getClass().getSimpleName());
	}

}
