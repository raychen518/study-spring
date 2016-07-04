package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

import com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext.BeanF1;

/**
 * <pre>
 * This class briefly demos how to use the @Bean annotation.
 * </pre>
 */
@Configuration
public class BeanConfiguration1 {

	// Index
	// - Using the "name" Attribute
	// - Using the "autowire" Attribute
	// - Using the "initMethod" Attribute
	// - Using the "destroyMethod" Attribute
	// - Dependencies
	// - Receiving Lifecycle Callbacks
	// - Specifying the Scope
	// - Specifying the Description

	// =========================================================================
	// Using the "name" Attribute
	// This attribute is used to specify a bean's name or aliases.
	// =========================================================================
	// - Default Value: <the corresponding method's name>

	/**
	 * <pre>
	 * Use the default value as the bean's name.
	 * </pre>
	 */
	@Bean
	public BeanA1 createBeanA1() {
		return new BeanA1();
	}

	/**
	 * <pre>
	 * Specify the bean's name.
	 * </pre>
	 */
	@Bean(name = "beanA2")
	public BeanA2 createBeanA2() {
		return new BeanA2();
	}

	/**
	 * <pre>
	 * Specify the bean's aliases.
	 * </pre>
	 */
	@Bean(name = { "beanA31", "beanA32", "beanA33" })
	public BeanA3 createBeanA3() {
		return new BeanA3();
	}

	// =========================================================================
	// Using the "autowire" Attribute
	// This attribute is used to specify how to autowire the bean's
	// dependencies.
	// =========================================================================
	// - Default Value: Autowire.NO

	/**
	 * <pre>
	 * Use the default value (Autowire.NO) as the bean's autowiring approach.
	 * </pre>
	 */
	@Bean
	public BeanB1 beanB1() {
		return new BeanB1();
	}

	/**
	 * <pre>
	 * Specify the bean's autowiring approach as Autowire.NO.
	 * </pre>
	 */
	@Bean(autowire = Autowire.NO)
	public BeanB2 beanB2() {
		return new BeanB2();
	}

	/**
	 * <pre>
	 * Specify the bean's autowiring approach as Autowire.BY_TYPE.
	 * </pre>
	 */
	@Bean(autowire = Autowire.BY_TYPE)
	public BeanB3 beanB3() {
		return new BeanB3();
	}

	/**
	 * <pre>
	 * Specify the bean's autowiring approach as Autowire.BY_NAME.
	 * </pre>
	 */
	@Bean(autowire = Autowire.BY_NAME)
	public BeanB4 beanB4() {
		return new BeanB4();
	}

	// =========================================================================
	// Using the "initMethod" Attribute
	// This attribute is used to specify the name of a method used to initialize
	// the bean.
	// =========================================================================
	// - Default Value: <an empty string, indicating there is no initialization
	// method for the bean>

	/**
	 * <pre>
	 * Specify the bean's initialization method as "initialize()".
	 * </pre>
	 */
	@Bean(initMethod = "initialize")
	public BeanD beanD() {
		return new BeanD();
	}

	// =========================================================================
	// Using the "destroyMethod" Attribute
	// This attribute is used to specify the name of a method used to destroy
	// the bean.
	// =========================================================================
	// - Default Value: AbstractBeanDefinition.INFER_METHOD (such as "close" and
	// "shutdown")

	/**
	 * <pre>
	 * Use the default value ("close()") as the bean's destroying method.
	 * 
	 * Note: If this default behavior is not expected,
	 *       set the "destroyMethod" attribute using the empty string.
	 * </pre>
	 */
	@Bean
	public BeanE1 beanE1() {
		return new BeanE1();
	}

	/**
	 * <pre>
	 * Use the default value ("shutdown()") as the bean's destroying method.
	 * 
	 * Note: If this default behavior is not expected,
	 *       set the "destroyMethod" attribute using the empty string.
	 * </pre>
	 */
	@Bean
	public BeanE2 beanE2() {
		return new BeanE2();
	}

	/**
	 * <pre>
	 * Specify the bean's destroying method as "destroy()".
	 * </pre>
	 */
	@Bean(destroyMethod = "destroy")
	public BeanE3 beanE3() {
		return new BeanE3();
	}

	// =========================================================================
	// Dependencies
	// A @Bean annotated method can have an arbitrary number of parameters
	// injecting the dependencies required to build that bean.
	// =========================================================================

	/**
	 * <pre>
	 * Inject the bean "beanG1" when creating the bean "beanF1".
	 * </pre>
	 */
	@Bean
	public BeanF1 beanF1(BeanG1 beanG1) {
		System.out.println("Creating BeanF1> " + "beanG1: " + beanG1);
		return new BeanF1();
	}

	/**
	 * <pre>
	 * Inject the beans "beanG1", "beanG2" and "beanG3" when creating the bean "beanF2".
	 * </pre>
	 */
	@Bean
	public BeanF2 beanF2(BeanG1 beanG1, BeanG2 beanG2, BeanG3 beanG3) {
		System.out.println("Creating BeanF2> " + "beanG1: " + beanG1 + "; beanG2: " + beanG2 + "; beanG3: " + beanG3);
		return new BeanF2();
	}

	@Bean
	public BeanG1 beanG1() {
		return new BeanG1();
	}

	@Bean
	public BeanG2 beanG2() {
		return new BeanG2();
	}

	@Bean
	public BeanG3 beanG3() {
		return new BeanG3();
	}

	// =========================================================================
	// Receiving Lifecycle Callbacks
	// A class defined with the @Bean annotation supports regular lifecycle
	// callbacks, as follows.
	// - the @PostConstruct and @PreDestroy annotations
	// - the InitializingBean and DisposableBean interfaces
	// - the "initMethod" and "destroyMethod" attributes of the @Bean annotation
	// - the Lifecycle (SmartLifecycle) interface
	// - the standard set of *Aware interfaces
	// --- ApplicationContextAware
	// --- BeanFactoryAware
	// --- BeanNameAware
	// --- etc.
	// =========================================================================

	/**
	 * <pre>
	 * Initialize and destroy the bean using the @PostConstruct and @PreDestroy annotations from JSR-250.
	 * </pre>
	 */
	@Bean
	public BeanH1 beanH1() {
		return new BeanH1();
	}

	/**
	 * <pre>
	 * Initialize and destroy the bean by implementing the InitializingBean and DisposableBean interfaces.
	 * </pre>
	 */
	@Bean
	public BeanH2 beanH2() {
		return new BeanH2();
	}

	/**
	 * <pre>
	 * Initialize and destroy the bean by setting the "initMethod" and "destroyMethod" attributes of the @Bean annotation.
	 * </pre>
	 */
	// <See above content>

	/**
	 * <pre>
	 * Start and stop the bean by implementing the SmartLifecycle interface.
	 * autoStartup = true, running = false
	 * </pre>
	 */
	@Bean
	public BeanH31 beanH31() {
		boolean autoStartup = true;
		boolean running = false;
		return new BeanH31(autoStartup, running);
	}

	/**
	 * <pre>
	 * Start and stop the bean by implementing the SmartLifecycle interface.
	 * autoStartup = false, running = true
	 * </pre>
	 */
	@Bean
	public BeanH32 beanH32() {
		boolean autoStartup = false;
		boolean running = true;
		return new BeanH32(autoStartup, running);
	}

	/**
	 * <pre>
	 * Set the application context by implementing the ApplicationContextAware interface.
	 * </pre>
	 */
	@Bean
	public BeanH41 beanH41() {
		return new BeanH41();
	}

	/**
	 * <pre>
	 * Set the bean factory by implementing the BeanFactoryAware interface.
	 * </pre>
	 */
	@Bean
	public BeanH42 beanH42() {
		return new BeanH42();
	}

	/**
	 * <pre>
	 * Set the bean name by implementing the BeanNameAware interface.
	 * </pre>
	 */
	@Bean
	public BeanH43 beanH43() {
		return new BeanH43();
	}

	// =========================================================================
	// Specifying the Scope
	// The @Scope annotation is used to specify the scope of a bean.
	// =========================================================================
	// - Default Value: <an empty string, indicating SCOPE_SINGLETON>
	// - The attributes "scopeName" and "value" are equivalent.

	/**
	 * <pre>
	 * Use the default value (SCOPE_SINGLETON) as the bean's scope.
	 * </pre>
	 */
	@Bean
	public BeanI beanI1() {
		return new BeanI();
	}

	/**
	 * <pre>
	 * Specify the bean's scope as SCOPE_SINGLETON.
	 * </pre>
	 */
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public BeanI beanI2() {
		return new BeanI();
	}

	/**
	 * <pre>
	 * Specify the bean's scope as SCOPE_PROTOTYPE.
	 * </pre>
	 */
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public BeanI beanI3() {
		return new BeanI();
	}

	// =========================================================================
	// Specifying the Description
	// The @Description annotation is used to specify the description of a bean.
	// Note: This can be particularly useful when beans are exposed (perhaps via
	// JMX) for monitoring purposes.
	// =========================================================================

	@Bean
	@Description("A bean produced from the class BeanJ")
	public BeanJ beanJ() {
		return new BeanJ();
	}

}
