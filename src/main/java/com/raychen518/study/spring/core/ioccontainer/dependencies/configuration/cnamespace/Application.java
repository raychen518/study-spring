package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.cnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.configuration.cnamespace.xml");

		SomeBean someBean1 = (SomeBean) applicationContext.getBean("someBean1");
		someBean1.doSomething();
		System.out.println();

		SomeBean someBean2 = (SomeBean) applicationContext.getBean("someBean2");
		someBean2.doSomething();
		System.out.println();

		SomeBean someBean3 = (SomeBean) applicationContext.getBean("someBean3");
		someBean3.doSomething();
		System.out.println();
	}

}
