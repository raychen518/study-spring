package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

/**
 * <pre>
 * - The @Profile annotation can be used on the @Configuration classes and the @Bean methods.
 * - The @Profile annotation can be specified using multiple profile names.
 * - The @Profile annotation can be used to create custom annotations.
 * - A profile name specified in the @Profile annotation can be prefixed using the NOT operator (!)
 *   to indicate the corresponding beans will be registered if the specified profile is NOT active.
 * </pre>
 */
@Configuration
@Import({ BeanConfiguration1.class, BeanConfiguration2.class, BeanConfiguration3.class, BeanConfiguration4.class,
		BeanConfiguration5.class, BeanConfiguration6.class })
public class BeanConfiguration {

	@Bean
	public BeanE1 beanE1() {
		return new BeanE1();
	}

	/**
	 * <pre>
	 * Specify one profile name in the @Profile annotation and on the @Bean method.
	 * </pre>
	 */
	@Bean
	@Profile("profile1")
	public BeanE2 beanE2() {
		return new BeanE2();
	}

	@Bean
	@Profile("profile2")
	public BeanE3 beanE3() {
		return new BeanE3();
	}

	/**
	 * <pre>
	 * Specify multiple profile names in the @Profile annotation and on the @Bean method.
	 * </pre>
	 */
	@Bean
	@Profile({ "profile1", "profile3" })
	public BeanE4 beanE4() {
		return new BeanE4();
	}

	/**
	 * <pre>
	 * Specify one profile name (as Not Used) in the @Profile annotation and on the @Bean method.
	 * </pre>
	 */
	@Bean
	@Profile("!profile1")
	public BeanE5 beanE5() {
		return new BeanE5();
	}

}
