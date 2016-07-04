package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizingconfigurationmetadata.case1;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.containerextensionpoints.customizingconfigurationmetadata.1.xml");
		System.out.println();

		DataSourceBean dataSourceBean = (DataSourceBean) applicationContext.getBean("dataSourceBean");
		dataSourceBean.doSomething();
		System.out.println();

		Object dynamicBean = applicationContext.getBean("dynamicBean");
		System.out.println("dynamicBean instanceof HashMap: " + (dynamicBean instanceof HashMap));
		System.out.println("dynamicBean instanceof ArrayList: " + (dynamicBean instanceof ArrayList));
		System.out.println();

		// TODO The following code does not work due to unknown reason.
		// SomeBean someBean = (SomeBean)
		// applicationContext.getBean("someBean");
		// someBean.doSomething();
		// System.out.println();

		applicationContext.close();
	}

}
