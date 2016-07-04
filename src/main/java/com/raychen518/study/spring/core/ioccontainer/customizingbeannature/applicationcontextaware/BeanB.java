package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.applicationcontextaware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class BeanB {

	@Autowired
	private ApplicationContext applicationContext;

	public BeanB() {
		System.out.println(getClass().getSimpleName() + ": Constructing the Bean...");
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": Using the Application Context...");
		System.out.println(getClass().getSimpleName() + ": applicationContext: " + applicationContext);
	}

	public static void main(String[] args) {
		BeanB bean = new BeanB();
		bean.doSomething();
	}

}
