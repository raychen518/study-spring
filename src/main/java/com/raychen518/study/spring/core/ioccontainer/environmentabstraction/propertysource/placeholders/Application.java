package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.propertysource.placeholders;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.environmentabstraction.propertysource.placeholders.1.xml");

		CommonsUtil.listBeans(applicationContext);

		TestBean1 testBean1 = applicationContext.getBean(TestBean1.class);

		System.out.println("testBean1.getJavaVersion1(): " + testBean1.getJavaVersion1());
		System.out.println("testBean1.getJavaVersion2(): " + testBean1.getJavaVersion2());
		System.out.println("testBean1.getJavaHome1(): " + testBean1.getJavaHome1());
		System.out.println("testBean1.getJavaHome2(): " + testBean1.getJavaHome2());
		System.out.println();

		System.out.println("testBean1.getField1(): " + testBean1.getField1());
		System.out.println("testBean1.getField2(): " + testBean1.getField2());
		System.out.println("testBean1.getField3(): " + testBean1.getField3());
		System.out.println("testBean1.getField4(): " + testBean1.getField4());
		System.out.println("testBean1.getField5(): " + testBean1.getField5());
		System.out.println("testBean1.getField6(): " + testBean1.getField6());
		System.out.println();

		// CommonsUtil.printDelimiterLine();
		//
		// CommonsUtil.listSystemProperties();
		//
		// CommonsUtil.printDelimiterLine();
		//
		// CommonsUtil.listSystemEnvironmentVariables();

		applicationContext.close();
	}

}
