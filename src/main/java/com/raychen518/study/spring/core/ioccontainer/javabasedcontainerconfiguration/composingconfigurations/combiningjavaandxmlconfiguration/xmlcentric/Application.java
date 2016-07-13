package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.xmlcentric;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raychen518.study.spring.util.Utils;

/**
 * <pre>
 * Instantiate the container (application context) in an XML-centric way (e.g. using the ClassPathXmlApplicationContext class).
 * </pre>
 */
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.xmlcentric.xml");

		Utils.listBeans(applicationContext);

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
