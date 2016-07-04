package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("beanConfiguration2")
public class BeanConfiguration2 implements BeanConfigurationInterface2 {

	@Bean
	public BeanB1 beanB1() {
		return new BeanB1();
	}

	@Bean
	public BeanB2 beanB2() {
		return new BeanB2();
	}

	@Bean
	public BeanB3 beanB3() {
		return new BeanB3();
	}

	@Bean
	@Override
	public BeanB4 beanB4() {
		return new BeanB4();
	}

}
