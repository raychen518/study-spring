package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.compoundpropertynames;

public class BeanB {

	private BeanC fieldB1 = new BeanC();

	public void doSomething() {
		System.out.println("fieldB1: " + fieldB1);
	}

	public BeanC getFieldB1() {
		return fieldB1;
	}

	public void setFieldB1(BeanC fieldB1) {
		this.fieldB1 = fieldB1;
	}

	@Override
	public String toString() {
		return getClass().getName() + "_" + fieldB1;
	}

	public static void main(String[] args) {
		BeanB beanB = new BeanB();
		beanB.doSomething();
	}

}
