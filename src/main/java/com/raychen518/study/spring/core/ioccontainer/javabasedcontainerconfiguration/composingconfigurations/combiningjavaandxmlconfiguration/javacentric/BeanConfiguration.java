package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.javacentric;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {
		"com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.xmlcentric.package1",
		"com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.xmlcentric.package2" })
@ImportResource("classpath:core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.javacentric.xml")
public class BeanConfiguration {

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
		BeanC3 beanC3 = new BeanC3();
		beanC3.setIntValue(123);
		beanC3.setStringValue("abc");
		beanC3.setBooleanValue(true);
		beanC3.setBeanC1Value(beanC1());
		return beanC3;
	}

	@Bean
	public BeanC4 beanC4(@Value("${jdbc.driverClassName}") String driverClassName, @Value("${jdbc.url}") String url,
			@Value("${jdbc.username}") String username, @Value("${jdbc.password}") String password) {
		BeanC4 beanC4 = new BeanC4();
		beanC4.setDriverClassName(driverClassName);
		beanC4.setUrl(url);
		beanC4.setUsername(username);
		beanC4.setPassword(password);
		return beanC4;
	}

}
