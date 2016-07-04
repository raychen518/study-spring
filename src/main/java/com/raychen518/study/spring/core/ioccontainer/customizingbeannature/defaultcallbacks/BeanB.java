package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.defaultcallbacks;

public class BeanB {

	private int field1;

	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public static void main(String[] args) {
		BeanB bean = new BeanB();
		bean.setField1(123);
		System.out.println("bean.getField1(): " + bean.getField1());
	}

	public void startup() {
		System.out.println("Starting up Bean: " + getClass().getSimpleName());
	}

	public void shutdown() {
		System.out.println("Shutting down Bean: " + getClass().getSimpleName());
	}

}
