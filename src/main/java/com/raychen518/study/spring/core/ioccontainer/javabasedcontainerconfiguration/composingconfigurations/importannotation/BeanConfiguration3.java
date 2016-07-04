package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("beanConfiguration3")
public class BeanConfiguration3 implements BeanConfigurationInterface3 {

	@Bean
	public BeanC1 beanC1() {
		return new BeanC1();
	}

	@Bean
	public BeanC2 beanC2() {
		return new BeanC2();
	}

	@Bean
	public BeanC3 beanC3() {
		return new BeanC3();
	}

	@Bean
	@Override
	public BeanC4 beanC4() {
		return new BeanC4();
	}

}
