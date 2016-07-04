package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.beannameaware;

import org.springframework.beans.factory.BeanNameAware;

public class BeanA implements BeanNameAware {

	private String beanName;

	public BeanA() {
		System.out.println(getClass().getSimpleName() + ": Constructing the Bean...");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println(getClass().getSimpleName() + ": Setting the Bean Name...");
		this.beanName = beanName;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": Using the Bean Name...");
		System.out.println(getClass().getSimpleName() + ": beanName: " + beanName);
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
