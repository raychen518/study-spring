package com.raychen518.study.spring.core.ioccontainer.dependencies.lazyinitialized;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application3 {

	public static void main(String[] args) {
		System.out.println(Application3.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.lazyinitialized.3.xml");

		SomeBean1 someBean1 = null;
		boolean errorOccurredForSomeBean1 = false;

		try {
			someBean1 = (SomeBean1) applicationContext.getBean("someBean1");
		} catch (BeansException e) {
			errorOccurredForSomeBean1 = true;
			System.out.println("Some configuration error occurs when requesting someBean1.");
		}

		if (!errorOccurredForSomeBean1) {
			someBean1.doSomething();
		}

		SomeBean2 someBean2 = null;

		try {
			someBean2 = (SomeBean2) applicationContext.getBean("someBean2");
		} catch (BeansException e) {
			System.out.println("Some configuration error occurs when requesting someBean2.");
			System.exit(0);
		}

		someBean2.doSomething();
	}

}
