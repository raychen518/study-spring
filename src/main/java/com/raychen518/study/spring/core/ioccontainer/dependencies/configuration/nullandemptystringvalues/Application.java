package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.nullandemptystringvalues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.configuration.nullandemptystringvalues.xml");

		SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
		someBean.doSomething();
	}

}
