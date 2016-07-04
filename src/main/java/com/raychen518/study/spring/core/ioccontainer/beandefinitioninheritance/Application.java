package com.raychen518.study.spring.core.ioccontainer.beandefinitioninheritance;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.beandefinitioninheritance.xml");
		System.out.println();

		{
			BeanA beanA = (BeanA) applicationContext.getBean("beanA");
			System.out.println("beanA.getField1(): " + beanA.getField1());
			System.out.println("beanA.getField2(): " + beanA.getField2());
			System.out.println();

			BeanA1 beanA1 = (BeanA1) applicationContext.getBean("beanA1");
			System.out.println("beanA1.getField1(): " + beanA1.getField1());
			System.out.println("beanA1.getField2(): " + beanA1.getField2());
			System.out.println("beanA1.getField3(): " + beanA1.getField3());
			System.out.println();

			BeanA2 beanA2 = (BeanA2) applicationContext.getBean("beanA2");
			System.out.println("beanA2.getField1(): " + beanA2.getField1());
			System.out.println("beanA2.getField2(): " + beanA2.getField2());
			System.out.println("beanA2.getField3(): " + beanA2.getField3());
			System.out.println();

			BeanA3 beanA3 = (BeanA3) applicationContext.getBean("beanA3");
			System.out.println("beanA3.getField1(): " + beanA3.getField1());
			System.out.println("beanA3.getField2(): " + beanA3.getField2());
			System.out.println("beanA3.getField3(): " + beanA3.getField3());
			System.out.println();
		}

		{
			BeanC beanC;

			beanC = (BeanC) applicationContext.getBean("beanC");
			System.out.println("beanC.toString(): " + beanC.toString());

			beanC = (BeanC) applicationContext.getBean("beanC");
			System.out.println("beanC.toString(): " + beanC.toString());

			beanC = (BeanC) applicationContext.getBean("beanC");
			System.out.println("beanC.toString(): " + beanC.toString());
			System.out.println();

			BeanC1 beanC1;

			beanC1 = (BeanC1) applicationContext.getBean("beanC1");
			System.out.println("beanC1.toString(): " + beanC1.toString());

			beanC1 = (BeanC1) applicationContext.getBean("beanC1");
			System.out.println("beanC1.toString(): " + beanC1.toString());

			beanC1 = (BeanC1) applicationContext.getBean("beanC1");
			System.out.println("beanC1.toString(): " + beanC1.toString());
			System.out.println();

			BeanC2 beanC2;

			beanC2 = (BeanC2) applicationContext.getBean("beanC2");
			System.out.println("beanC2.toString(): " + beanC2.toString());

			beanC2 = (BeanC2) applicationContext.getBean("beanC2");
			System.out.println("beanC2.toString(): " + beanC2.toString());

			beanC2 = (BeanC2) applicationContext.getBean("beanC2");
			System.out.println("beanC2.toString(): " + beanC2.toString());
			System.out.println();
		}

		{
			BeanD1 beanD1 = (BeanD1) applicationContext.getBean("beanD1");
			System.out.println("beanD1.getField1(): " + beanD1.getField1());
			System.out.println("beanD1.getField2(): " + beanD1.getField2());
			System.out.println("beanD1.getField3(): " + beanD1.getField3());
			System.out.println();

			BeanD2 beanD2 = (BeanD2) applicationContext.getBean("beanD2");
			System.out.println("beanD2.getField1(): " + beanD2.getField1());
			System.out.println("beanD2.getField2(): " + beanD2.getField2());
			System.out.println("beanD2.getField3(): " + beanD2.getField3());
			System.out.println();
		}

		applicationContext.close();
	}

}
