package com.raychen518.study.spring.core.ioccontainer.dependencies.methodinjection.replacement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		{
			@SuppressWarnings("resource")
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.dependencies.methodinjection.replacement.1.xml");

			BeanA bean = (BeanA) applicationContext.getBean("beanA");
			bean.doSomething();
			System.out.println("bean.doSomethingSpecial(123, \"abc\"): " + bean.doSomethingSpecial(123, "abc"));
			System.out.println();
		}

		{
			@SuppressWarnings("resource")
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.dependencies.methodinjection.replacement.2.xml");

			BeanA bean = (BeanA) applicationContext.getBean("beanA");
			bean.doSomething();
			System.out.println("bean.doSomethingSpecial(123, \"abc\"): " + bean.doSomethingSpecial(123, "abc"));
			System.out.println();
		}
	}

}
