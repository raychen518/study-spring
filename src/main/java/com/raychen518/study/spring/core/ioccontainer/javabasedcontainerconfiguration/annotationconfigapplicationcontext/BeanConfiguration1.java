package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * The @Configuration classes can be used as input of the AnnotationConfigApplicationContext.
 * </pre>
 */
@Configuration
public class BeanConfiguration1 {

	@Bean(name = "beanA1")
	public BeanA1 createBeanA1() {
		return new BeanA1();
	}

	@Bean(name = "beanA2")
	public BeanA2 createBeanA2() {
		return new BeanA2();
	}

}
