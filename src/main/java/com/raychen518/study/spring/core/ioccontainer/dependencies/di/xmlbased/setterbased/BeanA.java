package com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.setterbased;

import com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.BeanB;
import com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.BeanC;

public class BeanA {

	private BeanB field1;
	private BeanC field2;
	private String field3;

	public void doSomething() {
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
		System.out.println("field3: " + field3);
	}

	public void setField1(BeanB field1) {
		this.field1 = field1;
	}

	public void setField2(BeanC field2) {
		this.field2 = field2;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public static void main(String[] args) {
		BeanA beanA = new BeanA();

		beanA.setField1(new BeanB());
		beanA.setField2(new BeanC());
		beanA.setField3("Some Text");

		beanA.doSomething();
	}

}
