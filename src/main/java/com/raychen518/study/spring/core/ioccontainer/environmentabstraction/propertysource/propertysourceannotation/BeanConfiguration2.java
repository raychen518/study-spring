package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.propertysource.propertysourceannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:core.ioccontainer.environmentabstraction.propertysource.propertysourceannotation.application.2.${next.file.type.key:normal}.properties")
// Change the text "next.file.type.key" in the above statement to see different
// result.
public class BeanConfiguration2 {

	@Autowired
	private Environment environment;

	@Bean
	public SomeBean someBean2() {
		System.out.println("environment.getProperty(\"key21\"): " + environment.getProperty("key21"));
		System.out.println("environment.getProperty(\"key22\"): " + environment.getProperty("key22"));
		System.out.println("environment.getProperty(\"key23\"): " + environment.getProperty("key23"));
		System.out.println();

		return new SomeBean();
	}

}
