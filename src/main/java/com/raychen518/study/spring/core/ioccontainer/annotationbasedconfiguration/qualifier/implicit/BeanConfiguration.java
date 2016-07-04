package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.implicit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public BeanB generateBeanB1() {
		System.out.println("Generating BeanB #1...");
		BeanB beanB = new BeanB();
		return beanB;
	}

	@Bean
	public BeanB generateBeanB2() {
		System.out.println("Generating BeanB #2...");
		BeanB beanB = new BeanB();
		return beanB;
	}

	@Bean
	public BeanC generateBeanC1() {
		System.out.println("Generating BeanC #1...");
		BeanC beanC = new BeanC();
		return beanC;
	}

	@Bean
	public BeanC generateBeanC2() {
		System.out.println("Generating BeanC #2...");
		BeanC beanC = new BeanC();
		return beanC;
	}

}
