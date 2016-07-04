package com.raychen518.study.spring.core.ioccontainer.dependencies.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMode4ByConstructor {

	public static void main(String[] args) {
		System.out.println(ApplicationMode4ByConstructor.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.autowiring.mode.4.byconstructor.xml");

		BeanA2 beanA = (BeanA2) applicationContext.getBean("beanA");
		beanA.doSomething();
	}

}
