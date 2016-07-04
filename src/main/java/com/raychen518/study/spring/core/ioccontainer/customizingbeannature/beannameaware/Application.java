package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.beannameaware;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.customizingbeannature.beannameaware.xml");
		System.out.println();

		BeanA beanA = (BeanA) applicationContext.getBean("bean1");
		beanA.doSomething();

		applicationContext.close();
	}

}
