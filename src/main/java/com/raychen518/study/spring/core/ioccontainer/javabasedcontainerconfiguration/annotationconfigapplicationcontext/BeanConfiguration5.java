package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import javax.inject.Named;

import org.springframework.context.annotation.Bean;

/**
 * <pre>
 * The @Named classes can be used as input of the AnnotationConfigApplicationContext.
 * </pre>
 */
@Named
public class BeanConfiguration5 {

	@Bean(name = "beanE1")
	public BeanE1 createBeanE1() {
		return new BeanE1();
	}

	@Bean(name = "beanE2")
	public BeanE2 createBeanE2() {
		return new BeanE2();
	}

}
