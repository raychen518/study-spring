package com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.constructorbased.usinginstancefactorymethod;

import com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.BeanB;
import com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.BeanC;

public class BeanA2 {

	private BeanB field1;
	private BeanC field2;
	private String field3;

	public BeanA2(BeanB value1, BeanC value2, String value3) {
		this.field1 = value1;
		this.field2 = value2;
		this.field3 = value3;
	}

	public void doSomething() {
		System.out.println("field1: " + field1);
		System.out.println("field2: " + field2);
		System.out.println("field3: " + field3);
	}

	public static void main(String[] args) {
		BeanA2 beanA2 = new BeanA2(new BeanB(), new BeanC(), "Some Text 2");
		beanA2.doSomething();
	}

}
