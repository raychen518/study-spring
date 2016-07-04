package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.defaultcallbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.customizingbeannature.defaultcallbacks.xml");
		System.out.println();

		BeanA beanA = (BeanA) applicationContext.getBean("beanA");
		System.out.println("beanA.getField1(): " + beanA.getField1());
		System.out.println();

		BeanB beanB = (BeanB) applicationContext.getBean("beanB");
		System.out.println("beanB.getField1(): " + beanB.getField1());
		System.out.println();

		BeanC beanC = (BeanC) applicationContext.getBean("beanC");
		System.out.println("beanC.getField1(): " + beanC.getField1());
		System.out.println();

		applicationContext.close();
	}

}
