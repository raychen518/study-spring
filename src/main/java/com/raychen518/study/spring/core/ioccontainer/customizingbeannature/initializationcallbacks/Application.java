package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.initializationcallbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.customizingbeannature.initializationcallbacks.1.xml");

			BeanA1 bean = (BeanA1) applicationContext.getBean("beanA");
			System.out.println("bean.getField1(): " + bean.getField1());
			System.out.println();

			applicationContext.close();
		}

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.customizingbeannature.initializationcallbacks.2.xml");

			BeanA2 bean = (BeanA2) applicationContext.getBean("beanA");
			System.out.println("beanA.getField1(): " + bean.getField1());
			System.out.println();

			applicationContext.close();
		}

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.customizingbeannature.initializationcallbacks.3.xml");

			BeanA3 bean = (BeanA3) applicationContext.getBean("beanA");
			System.out.println("beanA.getField1(): " + bean.getField1());
			System.out.println();

			applicationContext.close();
		}
	}

}
