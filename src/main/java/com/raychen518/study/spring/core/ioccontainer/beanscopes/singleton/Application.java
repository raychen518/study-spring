package com.raychen518.study.spring.core.ioccontainer.beanscopes.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.beanscopes.singleton.xml");

		SomeBean someBean1 = (SomeBean) applicationContext.getBean("someBean");
		SomeBean someBean2 = (SomeBean) applicationContext.getBean("someBean");
		SomeBean someBean3 = (SomeBean) applicationContext.getBean("someBean");

		System.out.println(
				"Invoking the applicationContext.getBean() method for a specified singleton bean for multiple times always returns the same bean instance.");
		System.out.println("someBean1: " + someBean1);
		System.out.println("someBean2: " + someBean2);
		System.out.println("someBean3: " + someBean3);
		System.out.println();

		System.out.println("A singleton bean has only one instance.");
		BeanA1 beanA1 = (BeanA1) applicationContext.getBean("beanA1");
		System.out.println("beanA1.getBeanB(): " + beanA1.getBeanB());

		BeanA2 beanA2 = (BeanA2) applicationContext.getBean("beanA2");
		System.out.println("beanA2.getBeanB(): " + beanA2.getBeanB());

		BeanA3 beanA3 = (BeanA3) applicationContext.getBean("beanA3");
		System.out.println("beanA3.getBeanB(): " + beanA3.getBeanB());
	}

}
