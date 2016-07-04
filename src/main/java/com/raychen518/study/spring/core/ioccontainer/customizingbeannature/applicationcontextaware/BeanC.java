package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.applicationcontextaware;

import org.springframework.context.ApplicationContext;

public class BeanC {

	private ApplicationContext applicationContext;

	public BeanC() {
		System.out.println(getClass().getSimpleName() + ": Constructing the Bean...");
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": Using the Application Context...");
		System.out.println(getClass().getSimpleName() + ": applicationContext: " + applicationContext);
	}

	public static void main(String[] args) {
		BeanC bean = new BeanC();
		bean.doSomething();
	}

}
