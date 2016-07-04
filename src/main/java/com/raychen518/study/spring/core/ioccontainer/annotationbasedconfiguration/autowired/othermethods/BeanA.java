package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.othermethods;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 * Use of the @Autowired annotation on methods with arbitrary names and/or multiple arguments is also allowed.
 * </pre>
 */
public class BeanA {

	private BeanB1 beanB1;
	private BeanB2 beanB2;
	private BeanB3 beanB3;

	@Autowired
	public void prepareBeanDs(BeanB1 beanB1, BeanB2 beanB2, BeanB3 beanB3) {
		System.out.println("Preparing Beans...");
		this.beanB1 = beanB1;
		this.beanB2 = beanB2;
		this.beanB3 = beanB3;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanB1: " + beanB1);
		System.out.println("beanB2: " + beanB2);
		System.out.println("beanB3: " + beanB3);

		if (beanB1 != null) {
			beanB1.doSomething();
		}

		if (beanB2 != null) {
			beanB2.doSomething();
		}

		if (beanB3 != null) {
			beanB3.doSomething();
		}
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
