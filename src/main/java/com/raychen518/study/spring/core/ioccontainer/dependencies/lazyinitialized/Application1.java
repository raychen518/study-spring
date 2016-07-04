package com.raychen518.study.spring.core.ioccontainer.dependencies.lazyinitialized;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1 {

	public static void main(String[] args) {
		System.out.println(Application1.class.getName());
		System.out.println();

		ApplicationContext applicationContext = null;

		try {
			applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.dependencies.lazyinitialized.1.xml");
		} catch (BeansException exception) {
			System.out.println(
					"When using the default eager-initialization, configuration errors of some bean (if there are) occur when initializing the ApplicationContext.");
			System.exit(0);
		}

		SomeBean1 someBean1 = (SomeBean1) applicationContext.getBean("someBean1");
		someBean1.doSomething();
	}

}
