package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.javacentric;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

/**
 * <pre>
 * Instantiate the container (application context) in a Java-centric way (using the AnnotationConfigApplicationContext class).
 * </pre>
 */
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		CommonsUtil.listBeans(applicationContext);

		// Get a bean by name.
		BeanC3 beanC3 = (BeanC3) applicationContext.getBean("beanC3");
		System.out.println("beanC3: " + beanC3);
		System.out.println();

		// Get a bean by type.
		BeanC4 beanC4 = applicationContext.getBean(BeanC4.class);
		System.out.println("beanC4: " + beanC4);
		System.out.println();

		applicationContext.close();

	}

}
