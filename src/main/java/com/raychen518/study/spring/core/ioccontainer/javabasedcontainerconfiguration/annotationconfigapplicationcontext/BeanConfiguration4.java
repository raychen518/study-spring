package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import org.springframework.context.annotation.Bean;

/**
 * <pre>
 * The POJO classes, which do not have corresponding annotations and do include the @Bean methods, can be used as input of the AnnotationConfigApplicationContext.
 * </pre>
 */
public class BeanConfiguration4 {

	@Bean(name = "beanD1")
	public BeanD1 createBeanD1() {
		return new BeanD1();
	}

	@Bean(name = "beanD2")
	public BeanD2 createBeanD2() {
		return new BeanD2();
	}

}
