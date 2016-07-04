package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * The @Service classes can be used as input of the AnnotationConfigApplicationContext.
 * </pre>
 */
@Service
public class BeanConfiguration3 {

	@Bean(name = "beanC1")
	public BeanC1 createBeanC1() {
		return new BeanC1();
	}

	@Bean(name = "beanC2")
	public BeanC2 createBeanC2() {
		return new BeanC2();
	}

}
