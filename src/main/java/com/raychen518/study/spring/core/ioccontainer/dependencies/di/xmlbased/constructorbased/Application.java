package com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.constructorbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.di.xmlbased.constructorbased.xml");

		BeanA beanA = (BeanA) applicationContext.getBean("beanA");
		beanA.doSomething();
	}

}
