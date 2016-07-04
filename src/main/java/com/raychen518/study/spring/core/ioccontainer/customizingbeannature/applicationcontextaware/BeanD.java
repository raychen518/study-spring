package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.applicationcontextaware;

import org.springframework.context.ApplicationContext;

public class BeanD {

	private ApplicationContext applicationContext;

	public BeanD(ApplicationContext applicationContext) {
		System.out.println(getClass().getSimpleName() + ": Constructing the Bean...");
		this.applicationContext = applicationContext;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": Using the Application Context...");
		System.out.println(getClass().getSimpleName() + ": applicationContext: " + applicationContext);
	}

	public static void main(String[] args) {
		BeanD bean = new BeanD(null);
		bean.doSomething();
	}

}
