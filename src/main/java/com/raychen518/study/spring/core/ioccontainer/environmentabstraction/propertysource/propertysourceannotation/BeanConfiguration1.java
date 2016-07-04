package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.propertysource.propertysourceannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * <pre>
 * - The @PropertySource annotation provides a mechanism to add a property source to the environment, in the @Configuration classes.
 * - Any ${...} placeholders in a @PropertySource annotation will be resolved against the set of property sources already registered in the environment.
 * </pre>
 */
@Configuration
@PropertySource("classpath:core.ioccontainer.environmentabstraction.propertysource.propertysourceannotation.application.1.properties")
public class BeanConfiguration1 {

	@Autowired
	private Environment environment;

	@Bean
	public SomeBean someBean1() {
		System.out.println("environment.getProperty(\"key11\"): " + environment.getProperty("key11"));
		System.out.println("environment.getProperty(\"key12\"): " + environment.getProperty("key12"));
		System.out.println("environment.getProperty(\"key13\"): " + environment.getProperty("key13"));
		System.out.println();

		return new SomeBean();
	}

}
