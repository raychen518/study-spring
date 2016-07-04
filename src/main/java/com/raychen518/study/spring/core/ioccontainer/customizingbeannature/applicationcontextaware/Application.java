package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.applicationcontextaware;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.customizingbeannature.applicationcontextaware.xml");
		System.out.println();

		BeanA beanA = (BeanA) applicationContext.getBean("beanA");
		beanA.doSomething();

		BeanB beanB = (BeanB) applicationContext.getBean("beanB");
		beanB.doSomething();

		BeanC beanC = (BeanC) applicationContext.getBean("beanC");
		beanC.doSomething();

		BeanD beanD = (BeanD) applicationContext.getBean("beanD");
		beanD.doSomething();

		applicationContext.close();
	}

}
