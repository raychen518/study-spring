package com.raychen518.study.spring.core.ioccontainer.dependencies.autowiring.patterns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
TODO This example needs more investigation and update
because the settings of the attributes "default-autowire-candidates" and "autowire-candidate"
in the configuration file do not work.
*/
public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.autowiring.patterns.xml");

		BeanA beanA1 = (BeanA) applicationContext.getBean("beanA1");
		beanA1.doSomething();
		System.out.println();

		BeanA beanA2 = (BeanA) applicationContext.getBean("beanA2");
		beanA2.doSomething();
		System.out.println();

		BeanA beanA3 = (BeanA) applicationContext.getBean("beanA3");
		beanA3.doSomething();
		System.out.println();

		BeanB beanB1 = (BeanB) applicationContext.getBean("beanB1");
		beanB1.doSomething();
		System.out.println();

		BeanB beanB2 = (BeanB) applicationContext.getBean("beanB2");
		beanB2.doSomething();
		System.out.println();

		BeanB beanB3 = (BeanB) applicationContext.getBean("beanB3");
		beanB3.doSomething();
		System.out.println();
	}

}
