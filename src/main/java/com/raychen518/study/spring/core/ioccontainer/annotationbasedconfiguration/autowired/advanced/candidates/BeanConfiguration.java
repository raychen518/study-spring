package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.candidates;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public BeanB generateBeanB6() {
		return new BeanB(6);
	}

	public BeanB generateBeanB7() {
		return new BeanB(7);
	}

	@Bean
	public BeanC generateBeanC5() {
		return new BeanC(5);
	}

	@Bean
	@Qualifier
	public BeanC generateBeanC6() {
		return new BeanC(6);
	}

	@Bean
	public BeanD generateBeanD5() {
		return new BeanD(5);
	}

	@Bean
	@Online
	public BeanD generateBeanD6() {
		return new BeanD(6);
	}

	@Bean
	@Online(true)
	public BeanD generateBeanD7() {
		return new BeanD(7);
	}

	@Bean
	@Online(false)
	public BeanD generateBeanD8() {
		return new BeanD(8);
	}

	@Bean
	public BeanE generateBeanE3() {
		return new BeanE(3);
	}

	@Bean
	@UniqueName
	public BeanE generateBeanE4() {
		return new BeanE(4);
	}

	@Bean
	@UniqueName("a1b2c3")
	public BeanE generateBeanE5() {
		return new BeanE(5);
	}

}
