package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.xmlcentric;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.xmlcentric.package2")
public class BeanConfiguration {

	@Bean
	public BeanC2 beanC2() {
		return new BeanC2();
	}

}
