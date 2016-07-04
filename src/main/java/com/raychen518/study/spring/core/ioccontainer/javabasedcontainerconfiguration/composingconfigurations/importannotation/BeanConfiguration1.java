package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("beanConfiguration1")
public class BeanConfiguration1 implements BeanConfigurationInterface1 {

	@Bean
	public BeanA1 beanA1() {
		return new BeanA1();
	}

	@Bean
	public BeanA2 beanA2() {
		return new BeanA2();
	}

	@Bean
	public BeanA3 beanA3() {
		return new BeanA3();
	}

	@Bean
	@Override
	public BeanA4 beanA4() {
		return new BeanA4();
	}

}
