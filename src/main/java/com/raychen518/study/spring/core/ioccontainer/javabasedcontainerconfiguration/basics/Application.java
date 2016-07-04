package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.javabasedcontainerconfiguration.basics.xml");

		CommonsUtil.listBeans(applicationContext);

		BeanB4 the1stBeanB4 = (BeanB4) applicationContext.getBean("the1stBeanB4");
		BeanB4 the2ndBeanB4 = (BeanB4) applicationContext.getBean("the2ndBeanB4");
		BeanB4 the3rdBeanB4 = (BeanB4) applicationContext.getBean("the3rdBeanB4");
		System.out.println("(the1stBeanB4 == the2ndBeanB4): " + (the1stBeanB4 == the2ndBeanB4));
		System.out.println("(the1stBeanB4 == the3rdBeanB4): " + (the1stBeanB4 == the3rdBeanB4));
		System.out.println("(the2ndBeanB4 == the3rdBeanB4): " + (the2ndBeanB4 == the3rdBeanB4));
		System.out.println();

		applicationContext.close();
	}

}
