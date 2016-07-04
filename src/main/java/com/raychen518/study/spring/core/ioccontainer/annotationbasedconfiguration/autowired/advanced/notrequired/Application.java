package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.notrequired;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		{
			ConfigurableApplicationContext applicationContext = null;
			try {
				applicationContext = new ClassPathXmlApplicationContext(
						"core.ioccontainer.annotationbasedconfiguration.autowired.advanced.notrequired.1.xml");
				System.out.println();

				BeanA1 beanA1 = (BeanA1) applicationContext.getBean("beanA1");
				beanA1.doSomething();
				System.out.println();
			} catch (BeansException exception) {
				exception.printStackTrace();
			} finally {
				if (applicationContext != null) {
					applicationContext.close();
				}
			}
		}

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.annotationbasedconfiguration.autowired.advanced.notrequired.2.xml");
			System.out.println();

			BeanA2 beanA2 = (BeanA2) applicationContext.getBean("beanA2");
			beanA2.doSomething();
			System.out.println();

			applicationContext.close();
		}
	}

}
