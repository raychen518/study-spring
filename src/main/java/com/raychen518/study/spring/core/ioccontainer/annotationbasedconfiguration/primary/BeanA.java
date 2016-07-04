package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.primary;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

	@Autowired
	private BeanB beanB;

	@Autowired
	private BeanC beanC;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanB: " + beanB);
		System.out.println("beanC: " + beanC);
		System.out.println();

		if (beanB != null) {
			beanB.doSomething();
		}
		System.out.println();

		if (beanC != null) {
			beanC.doSomething();
		}

	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
