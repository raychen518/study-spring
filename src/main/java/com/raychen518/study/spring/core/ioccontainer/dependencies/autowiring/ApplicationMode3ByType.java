package com.raychen518.study.spring.core.ioccontainer.dependencies.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMode3ByType {

	public static void main(String[] args) {
		System.out.println(ApplicationMode3ByType.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.autowiring.mode.3.bytype.xml");

		BeanA1 beanA = (BeanA1) applicationContext.getBean("beanA");
		beanA.doSomething();
	}

}
