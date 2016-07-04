package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.case1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.annotationbasedconfiguration.qualifier.1.xml");
		System.out.println();

		BeanA1 beanA1 = (BeanA1) applicationContext.getBean("beanA1");
		beanA1.doSomething();
		System.out.println();

		BeanA2 beanA2 = (BeanA2) applicationContext.getBean("beanA2");
		beanA2.doSomething();
		System.out.println();

		BeanA3 beanA3 = (BeanA3) applicationContext.getBean("beanA3");
		beanA3.doSomething();
		System.out.println();

		BeanA4 beanA4 = (BeanA4) applicationContext.getBean("beanA4");
		beanA4.doSomething();
		System.out.println();

		applicationContext.close();
	}

}
