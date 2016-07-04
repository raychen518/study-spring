package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizingconfigurationmetadata.case2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.containerextensionpoints.customizingconfigurationmetadata.2.xml");
		System.out.println();

		SomeBean someBean1 = (SomeBean) applicationContext.getBean("someBean1");
		someBean1.doSomething();
		System.out.println();

		SomeBean someBean2 = (SomeBean) applicationContext.getBean("someBean2");
		someBean2.doSomething();
		System.out.println();

		applicationContext.close();
	}

}
