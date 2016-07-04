package com.raychen518.study.spring.core.ioccontainer.dependencies.lazyinitialized;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application2 {

	public static void main(String[] args) {
		System.out.println(Application2.class.getName());
		System.out.println();

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.dependencies.lazyinitialized.2.xml");

		SomeBean1 someBean1 = null;

		try {
			someBean1 = (SomeBean1) applicationContext.getBean("someBean1");
		} catch (BeansException exception) {
			System.out.println(
					"When using the lazy-initialization, configuration errors of some bean (if there are) occur when requesting the bean.");
			System.exit(0);
		}

		someBean1.doSomething();
	}

}
