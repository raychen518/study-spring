package com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.constructorbased.usinginstancefactorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.di.xmlbased.constructorbased.usinginstancefactorymethod.xml");

		BeanA1 beanA1 = (BeanA1) applicationContext.getBean("beanA1");
		beanA1.doSomething();
		System.out.println();

		BeanA2 beanA2 = (BeanA2) applicationContext.getBean("beanA2");
		beanA2.doSomething();
		System.out.println();
	}

}
