package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import javax.inject.Named;

import org.springframework.context.annotation.Bean;

/**
 * <pre>
 * The @Named classes (with specified names) can be used as input of the AnnotationConfigApplicationContext.
 * </pre>
 */
@Named("beanConfiguration6WithNewName")
public class BeanConfiguration6 {

	@Bean(name = "beanF1")
	public BeanF1 createBeanF1() {
		return new BeanF1();
	}

	@Bean(name = "beanF2")
	public BeanF2 createBeanF2() {
		return new BeanF2();
	}

}
