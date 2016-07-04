package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.required;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.annotationbasedconfiguration.required.1.xml");
			System.out.println();

			SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
			someBean.doSomething();
			System.out.println();

			applicationContext.close();
		}

		{
			ConfigurableApplicationContext applicationContext = null;
			try {
				applicationContext = new ClassPathXmlApplicationContext(
						"core.ioccontainer.annotationbasedconfiguration.required.2.xml");
				System.out.println();

				SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
				someBean.doSomething();
				System.out.println();
			} catch (BeansException exception) {
				exception.printStackTrace();
			} finally {
				if (applicationContext != null) {
					applicationContext.close();
				}
			}
		}
	}

}
