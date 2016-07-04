package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration1.class, BeanConfiguration2.class);
		System.out.println();

		CommonsUtil.listBeans(applicationContext);

		// ---------------------------------------------------------------------

		BeanB1 beanB1 = (BeanB1) applicationContext.getBean("beanB1");
		System.out.println("beanB1.getBeanC1(): " + beanB1.getBeanC1());

		BeanB2 beanB2 = (BeanB2) applicationContext.getBean("beanB2");
		System.out.println("beanB2.getBeanC2(): " + beanB2.getBeanC2());

		BeanB3 beanB3 = (BeanB3) applicationContext.getBean("beanB3");
		System.out.println("beanB3.getBeanC3(): " + beanB3.getBeanC3());

		BeanB4 beanB4 = (BeanB4) applicationContext.getBean("beanB4");
		System.out.println("beanB4.getBeanC4WithSpecialName(): " + beanB4.getBeanC4WithSpecialName());

		System.out.println();

		// ---------------------------------------------------------------------

		BeanI beanI11 = (BeanI) applicationContext.getBean("beanI1");
		BeanI beanI12 = (BeanI) applicationContext.getBean("beanI1");
		System.out.println("beanI11 == beanI12: " + (beanI11 == beanI12));

		BeanI beanI21 = (BeanI) applicationContext.getBean("beanI2");
		BeanI beanI22 = (BeanI) applicationContext.getBean("beanI2");
		System.out.println("beanI21 == beanI22: " + (beanI21 == beanI22));

		BeanI beanI31 = (BeanI) applicationContext.getBean("beanI3");
		BeanI beanI32 = (BeanI) applicationContext.getBean("beanI3");
		System.out.println("beanI31 == beanI32: " + (beanI31 == beanI32));

		applicationContext.close();
	}

}
