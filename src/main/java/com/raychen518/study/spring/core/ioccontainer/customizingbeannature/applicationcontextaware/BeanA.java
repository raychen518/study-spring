package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.applicationcontextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanA implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public BeanA() {
		System.out.println(getClass().getSimpleName() + ": Constructing the Bean...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(getClass().getSimpleName() + ": Setting the Application Context...");
		this.applicationContext = applicationContext;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": Using the Application Context...");
		System.out.println(getClass().getSimpleName() + ": applicationContext: " + applicationContext);
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
