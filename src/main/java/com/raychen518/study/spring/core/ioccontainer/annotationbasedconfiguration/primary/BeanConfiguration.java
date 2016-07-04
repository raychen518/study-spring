package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {

	@Bean
	public BeanC generateBeanC1() {
		System.out.println("Generating BeanC #1...");

		BeanC beanC = new BeanC();

		beanC.setField1(123);
		beanC.setField2("abc");
		beanC.setField3(true);

		return beanC;
	}

	@Bean
	public BeanC generateBeanC2() {
		System.out.println("Generating BeanC #2...");

		BeanC beanC = new BeanC();

		beanC.setField1(456);
		beanC.setField2("def");
		beanC.setField3(false);

		return beanC;
	}

	@Bean
	@Primary
	public BeanC generateBeanC3() {
		System.out.println("Generating BeanC #3...");

		BeanC beanC = new BeanC();

		beanC.setField1(789);
		beanC.setField2("ghi");
		beanC.setField3(true);

		return beanC;
	}

}
