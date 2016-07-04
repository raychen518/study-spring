package com.raychen518.study.spring.core.ioccontainer.dependencies.methodinjection.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.methodinjection.lookup.1.xml");

		{
			BeanA beanA = (BeanA) applicationContext1.getBean("beanA");
			beanA.doSomething();
			beanA.doSomething();
			beanA.doSomething();
			System.out.println();
		}

		@SuppressWarnings("resource")
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.methodinjection.lookup.2.xml");

		{
			BeanA beanA = (BeanA) applicationContext2.getBean("beanA");
			beanA.doSomething();
			beanA.doSomething();
			beanA.doSomething();
		}
	}

}
