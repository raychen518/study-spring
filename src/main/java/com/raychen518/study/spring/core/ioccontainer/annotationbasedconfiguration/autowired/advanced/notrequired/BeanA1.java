package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.notrequired;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA1 {

	@Autowired
	private BeanB beanB;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanB: " + beanB);

		if (beanB != null) {
			beanB.doSomething();
		}
	}

	public static void main(String[] args) {
		BeanA1 bean = new BeanA1();
		bean.doSomething();
	}

}
