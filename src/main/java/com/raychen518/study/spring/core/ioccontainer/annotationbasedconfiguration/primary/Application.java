package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.primary;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.annotationbasedconfiguration.primary.xml");
		System.out.println();

		BeanA beanA = (BeanA) applicationContext.getBean("beanA");
		beanA.doSomething();
		System.out.println();

		applicationContext.close();
	}

}
