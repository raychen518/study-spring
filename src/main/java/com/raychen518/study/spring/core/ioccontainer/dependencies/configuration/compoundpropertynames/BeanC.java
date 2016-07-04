package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.compoundpropertynames;

public class BeanC {

	private int fieldC1;

	public void doSomething() {
		System.out.println("fieldC1: " + fieldC1);
	}

	public void setFieldC1(int fieldC1) {
		this.fieldC1 = fieldC1;
	}

	@Override
	public String toString() {
		return getClass().getName() + "_" + fieldC1;
	}

	public static void main(String[] args) {
		BeanC beanC = new BeanC();

		beanC.setFieldC1(123);

		beanC.doSomething();
	}

}
