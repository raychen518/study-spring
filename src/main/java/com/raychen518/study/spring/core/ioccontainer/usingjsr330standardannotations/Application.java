package com.raychen518.study.spring.core.ioccontainer.usingjsr330standardannotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.usingjsr330standardannotations.xml");
		System.out.println();

		System.out.println("No.\tName");
		System.out.println("------------------------------------------------");
		int beanCount = 0;
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			if (!beanName.startsWith("org.springframework") && !beanName.contains("BeanConfiguration")) {
				System.out.println((++beanCount) + "\t" + beanName);
			}
		}
		System.out.println();

		BeanA beanA = (BeanA) applicationContext.getBean("beanA");
		beanA.doSomething();
		System.out.println();

		applicationContext.close();
	}

}
