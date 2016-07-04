package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.configurationannotation;

import java.util.Random;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * <pre>
 * This class briefly demos how to use the @Configuration annotation.
 * 
 * - The @Configuration annotation is a class-level annotation indicating that an object is a source of bean definitions.
 * - A @Configuration class declares beans via public @Bean annotated methods.
 * - Calls to @Bean methods on @Configuration classes can also be used to define inter-bean dependencies.
 *   Note: This approach ONLY works in @Configuration classes, does not work in @Component classes.
 * </pre>
 */
@Configuration
public class BeanConfiguration {

	/**
	 * <pre>
	 * Index
	 * - Inject dependencies by the method parameter.
	 * - Inject dependencies by the method invocation.
	 * - Inject a prototype dependency (1).
	 * - Inject a prototype dependency (2).
	 * - Inject a dependency using the Lookup Method Injection approach.
	 * </pre>
	 */

	@Bean
	public BeanA1 beanA1() {
		return new BeanA1();
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public BeanA2 beanA2() {
		return new BeanA2();
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public BeanA3 beanA3() {
		return new BeanA3(new Random().nextInt());
	}

	/**
	 * <pre>
	 * Inject dependencies by the method parameter.
	 * </pre>
	 */
	@Bean
	public BeanB beanB(BeanA1 beanA1) {
		String messagePrefix = "Creating the bean [beanB]: ";
		System.out.println(messagePrefix + "The bean [beanA1] is injected by the method parameter.");
		System.out.println(messagePrefix + "beanA1: " + beanA1);
		System.out.println();

		return new BeanB();
	}

	/**
	 * <pre>
	 * Inject dependencies by the method invocation.
	 * </pre>
	 */
	@Bean
	public BeanC beanC() {
		String messagePrefix = "Creating the bean [beanC]: ";
		System.out.println(messagePrefix + "The bean [beanA1] is injected by the method invocation.");
		System.out.println(messagePrefix + "beanA1(): " + beanA1());
		System.out.println();

		return new BeanC();
	}

	/**
	 * <pre>
	 * Inject a prototype dependency (1).
	 * </pre>
	 */
	@Bean
	public BeanD1 beanD1() {
		String messagePrefix = "Creating the bean [beanD1]: ";
		System.out.println(messagePrefix + "The bean [beanA2 (Prototype)] is injected by the method invocation.");
		System.out.println(messagePrefix + "beanA2(): " + beanA2());
		System.out.println();

		return new BeanD1();
	}

	/**
	 * <pre>
	 * Inject a prototype dependency (2).
	 * </pre>
	 */
	@Bean
	public BeanD2 beanD2() {
		String messagePrefix = "Creating the bean [beanD2]: ";
		System.out.println(messagePrefix + "The bean [beanA2 (Prototype)] is injected by the method invocation.");
		System.out.println(messagePrefix + "beanA2(): " + beanA2());
		System.out.println();

		return new BeanD2();
	}

	/**
	 * <pre>
	 * Inject a dependency using the Lookup Method Injection approach.
	 * </pre>
	 */
	@Bean
	public BeanE beanE() {
		return new BeanE() {

			@Override
			protected BeanA3 createBeanA3() {
				return beanA3();
			}

		};
	}

}
