package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.destructioncallbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * Q: Why is there no close method in the interface ApplicationContext?
 * A: Please see following class hierarchy.
 *    org.springframework.context.support.ClassPathXmlApplicationContext
 *        extends org.springframework.context.support.AbstractXmlApplicationContext
 *        extends org.springframework.context.support.AbstractRefreshableConfigApplicationContext
 *        extends org.springframework.context.support.AbstractRefreshableApplicationContext
 *        extends org.springframework.context.support.AbstractApplicationContext
 *        implements org.springframework.context.ConfigurableApplicationContext (defining the method "close()")

 *    org.springframework.context.ConfigurableApplicationContext
 *        extends org.springframework.context.ApplicationContext
 * </pre>
 *
 */
public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.customizingbeannature.destructioncallbacks.1.xml");

			BeanA1 bean = (BeanA1) applicationContext.getBean("beanA");
			System.out.println("bean.getField1(): " + bean.getField1());
			System.out.println();

			applicationContext.close();
		}

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.customizingbeannature.destructioncallbacks.2.xml");

			BeanA2 bean = (BeanA2) applicationContext.getBean("beanA");
			System.out.println("beanA.getField1(): " + bean.getField1());
			System.out.println();

			applicationContext.close();
		}

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.customizingbeannature.destructioncallbacks.3.xml");

			BeanA3 bean = (BeanA3) applicationContext.getBean("beanA");
			System.out.println("beanA.getField1(): " + bean.getField1());
			System.out.println();

			applicationContext.close();
		}
	}

}
