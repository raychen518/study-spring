package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.scopingautodetectedcomponents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.classpathscanningandcomponents.scopingautodetectedcomponents.xml");
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
		System.out.println("----------------------------------------------------");
		System.out.println();

		// =====================================================================
		// Scoping Using the "scope" Attribute of the "bean" Element
		// =====================================================================
		{
			System.out
					.println("applicationContext.isSingleton(\"beanA1\"): " + applicationContext.isSingleton("beanA1"));
			System.out
					.println("applicationContext.isPrototype(\"beanA1\"): " + applicationContext.isPrototype("beanA1"));
			for (int i = 0; i < 3; i++) {
				System.out.println("applicationContext.getBean(\"beanA1\"): " + applicationContext.getBean("beanA1"));
			}
			System.out.println();

			System.out
					.println("applicationContext.isSingleton(\"beanA2\"): " + applicationContext.isSingleton("beanA2"));
			System.out
					.println("applicationContext.isPrototype(\"beanA2\"): " + applicationContext.isPrototype("beanA2"));
			for (int i = 0; i < 3; i++) {
				System.out.println("applicationContext.getBean(\"beanA2\"): " + applicationContext.getBean("beanA2"));
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		// =====================================================================
		// Scoping Using the "value"/"scopeName" Attribute of the "Scope"
		// Annotation
		// =====================================================================
		{
			System.out
					.println("applicationContext.isSingleton(\"beanB1\"): " + applicationContext.isSingleton("beanB1"));
			System.out
					.println("applicationContext.isPrototype(\"beanB1\"): " + applicationContext.isPrototype("beanB1"));
			for (int i = 0; i < 3; i++) {
				System.out.println("applicationContext.getBean(\"beanB1\"): " + applicationContext.getBean("beanB1"));
			}
			System.out.println();

			System.out
					.println("applicationContext.isSingleton(\"beanB2\"): " + applicationContext.isSingleton("beanB2"));
			System.out
					.println("applicationContext.isPrototype(\"beanB2\"): " + applicationContext.isPrototype("beanB2"));
			for (int i = 0; i < 3; i++) {
				System.out.println("applicationContext.getBean(\"beanB2\"): " + applicationContext.getBean("beanB2"));
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		// =====================================================================
		// Scoping Using the "scopeResolver" Attribute of the "ComponentScan"
		// Annotation
		// Note: A custom Bean Scope Resolver should be created.
		// =====================================================================
		{
			System.out
					.println("applicationContext.isSingleton(\"beanC1\"): " + applicationContext.isSingleton("beanC1"));
			System.out
					.println("applicationContext.isPrototype(\"beanC1\"): " + applicationContext.isPrototype("beanC1"));
			for (int i = 0; i < 3; i++) {
				System.out.println("applicationContext.getBean(\"beanC1\"): " + applicationContext.getBean("beanC1"));
			}
			System.out.println();

			System.out
					.println("applicationContext.isSingleton(\"beanC2\"): " + applicationContext.isSingleton("beanC2"));
			System.out
					.println("applicationContext.isPrototype(\"beanC2\"): " + applicationContext.isPrototype("beanC2"));
			for (int i = 0; i < 3; i++) {
				System.out.println("applicationContext.getBean(\"beanC2\"): " + applicationContext.getBean("beanC2"));
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		// =====================================================================
		// Scoping Using the "scope-resolver" Attribute of the
		// "context:component-scan" Element
		// Note: A custom Bean Scope Resolver should be created.
		// =====================================================================
		{
			System.out
					.println("applicationContext.isSingleton(\"beanD1\"): " + applicationContext.isSingleton("beanD1"));
			System.out
					.println("applicationContext.isPrototype(\"beanD1\"): " + applicationContext.isPrototype("beanD1"));
			for (int i = 0; i < 3; i++) {
				System.out.println("applicationContext.getBean(\"beanD1\"): " + applicationContext.getBean("beanD1"));
			}
			System.out.println();

			System.out
					.println("applicationContext.isSingleton(\"beanD2\"): " + applicationContext.isSingleton("beanD2"));
			System.out
					.println("applicationContext.isPrototype(\"beanD2\"): " + applicationContext.isPrototype("beanD2"));
			for (int i = 0; i < 3; i++) {
				System.out.println("applicationContext.getBean(\"beanD2\"): " + applicationContext.getBean("beanD2"));
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		applicationContext.close();

	}

}
