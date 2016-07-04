package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.importannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <pre>
 * This class briefly demos how to use the @Import annotation.
 * 
 * - The @Import annotation is used to import bean definitions from other @Configuration classes into current @Configuration class.
 * 
 * - There are 4 approaches to inject dependencies across the @configuration classes, as follows.
 *   - By the method parameters.
 *   - By the @Autowired/@Value annotation.
 *   - By the @Autowired/@Value annotation for the @configuration classes (concrete classes).
 *   - By the @Autowired/@Value annotation for the @configuration classes (interfaces or abstract classes).
 * </pre>
 */
@Configuration
@Import({ BeanConfiguration1.class, BeanConfiguration2.class, BeanConfiguration3.class })
public class BeanConfiguration {

	/**
	 * <pre>
	 * Inject dependencies across the @configuration classes, by the method parameters.
	 * 
	 * This DI approach has the ambiguity that the location of the dependencies' declarations may be unknown.
	 * 
	 * In this case, the following dependencies are injected into the creation of the bean "beanD1".
	 * - The bean "beanA1" from the @configuration class BeanConfiguration1.
	 * - The bean "beanB1" from the @configuration class BeanConfiguration2.
	 * - The bean "beanC1" from the @configuration class BeanConfiguration3.
	 * </pre>
	 */
	@Bean
	public BeanD1 beanD1(BeanA1 beanA1, BeanB1 beanB1, BeanC1 beanC1) {
		System.out.println("Creating BeanD1:");
		System.out.println("beanA1: " + beanA1);
		System.out.println("beanB1: " + beanB1);
		System.out.println("beanC1: " + beanC1);
		System.out.println();

		return new BeanD1();
	}

	// -----------------------------------------------------------------------------------------------------------------

	/**
	 * <pre>
	 * Inject a dependency by the @Autowired annotation.
	 * </pre>
	 */
	@Autowired
	BeanA2 beanA2;

	@Autowired
	BeanB2 beanB2;

	/**
	 * <pre>
	 * Inject a dependency by the @Value annotation.
	 * </pre>
	 */
	@Value("#{beanC2}")
	BeanC2 beanC2;

	/**
	 * <pre>
	 * Inject dependencies across the @configuration classes, by the @Autowired/@Value annotation.
	 * 
	 * This DI approach has the ambiguity that the location of the dependencies' declarations may be unknown.
	 * 
	 * In this case, the following dependencies are injected into the creation of the bean "beanD2".
	 * - The bean "beanA2" from the @configuration class BeanConfiguration1.
	 * - The bean "beanB2" from the @configuration class BeanConfiguration2.
	 * - The bean "beanC2" from the @configuration class BeanConfiguration3.
	 * </pre>
	 */
	@Bean
	public BeanD2 beanD2() {
		System.out.println("Creating BeanD2:");
		System.out.println("beanA2: " + beanA2);
		System.out.println("beanB2: " + beanB2);
		System.out.println("beanC2: " + beanC2);
		System.out.println();

		return new BeanD2();
	}

	// -----------------------------------------------------------------------------------------------------------------

	/**
	 * <pre>
	 * Inject a @configuration class (a concrete class), which will be used later to inject the dependencies produced from it.
	 * </pre>
	 */
	@Autowired
	BeanConfiguration1 beanConfiguration1;

	@Autowired
	BeanConfiguration2 beanConfiguration2;

	@Autowired
	BeanConfiguration3 beanConfiguration3;

	/**
	 * <pre>
	 * Inject dependencies across the @configuration classes, by the @Autowired/@Value annotation for the @configuration classes (concrete classes).
	 * 
	 * This DI approach removes the ambiguity that the location of the dependencies' declarations may be unknown,
	 * but it causes the tight coupling from the injected @configuration classes.
	 * 
	 * In this case, the following dependencies are injected into the creation of the bean "beanD3".
	 * - The bean "beanA3" from the @configuration class BeanConfiguration1.
	 * - The bean "beanB3" from the @configuration class BeanConfiguration2.
	 * - The bean "beanC3" from the @configuration class BeanConfiguration3.
	 * </pre>
	 */
	@Bean
	public BeanD3 beanD3() {
		System.out.println("Creating BeanD3:");
		System.out.println("beanConfiguration1: " + beanConfiguration1);
		System.out.println("beanConfiguration2: " + beanConfiguration2);
		System.out.println("beanConfiguration3: " + beanConfiguration3);
		System.out.println("beanA3: " + beanConfiguration1.beanA3());
		System.out.println("beanB3: " + beanConfiguration2.beanB3());
		System.out.println("beanC3: " + beanConfiguration3.beanC3());
		System.out.println();

		return new BeanD3();
	}

	// -----------------------------------------------------------------------------------------------------------------

	/**
	 * <pre>
	 * Inject a @configuration class (an interface), which will be used later to inject the dependencies declared in it.
	 * </pre>
	 */
	@Autowired
	BeanConfigurationInterface1 beanConfigurationInterface1;

	@Autowired
	BeanConfigurationInterface2 beanConfigurationInterface2;

	@Autowired
	BeanConfigurationInterface3 beanConfigurationInterface3;

	/**
	 * <pre>
	 * Inject dependencies across the @configuration classes, by the @Autowired/@Value annotation for the @configuration classes (interfaces or abstract classes).
	 * 
	 * This DI approach removes the ambiguity that the location of the dependencies' declarations may be unknown,
	 * and it does not cause the tight coupling from the injected @configuration classes.
	 * 
	 * In this case, the following dependencies are injected into the creation of the bean "beanD4".
	 * - The bean "beanA4" from the @configuration class BeanConfiguration1.
	 * - The bean "beanB4" from the @configuration class BeanConfiguration2.
	 * - The bean "beanC4" from the @configuration class BeanConfiguration3.
	 * </pre>
	 */
	@Bean
	public BeanD4 beanD4() {
		System.out.println("Creating BeanD4:");
		System.out.println("beanConfigurationInterface1: " + beanConfigurationInterface1);
		System.out.println("beanConfigurationInterface2: " + beanConfigurationInterface2);
		System.out.println("beanConfigurationInterface3: " + beanConfigurationInterface3);
		System.out.println("beanA4: " + beanConfigurationInterface1.beanA4());
		System.out.println("beanB4: " + beanConfigurationInterface2.beanB4());
		System.out.println("beanC4: " + beanConfigurationInterface3.beanC4());
		System.out.println();

		return new BeanD4();
	}

}
