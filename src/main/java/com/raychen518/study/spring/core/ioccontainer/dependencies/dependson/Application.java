package com.raychen518.study.spring.core.ioccontainer.dependencies.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.dependson.xml");

		BeanA beanA = (BeanA) applicationContext.getBean("beanA");
		beanA.doSomething();
	}

}
