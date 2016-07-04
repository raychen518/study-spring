package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * The @Configuration annotation indicates that the annotated class may produce beans to be managed by the Spring container.
 * The @Configuration annotation plays the same role as the <beans /> element in the XML configuration.
 * Note: But, different from the <beans /> element, the @Configuration class itself is also registered as a bean definition,
 * together with all the @Bean methods in it.
 * </pre>
 */
@Configuration
public class BeanConfiguration1 {

	/**
	 * <pre>
	 * The @Bean annotation indicates that the annotated method produces a bean to be managed by the Spring container.
	 * The @Bean annotation plays the same role as the <bean /> element in the XML configuration.
	 * Although it is possible to use the @Bean methods in the @Component classes,
	 * the @Bean methods are most often used in the @Configuration classes.
	 * </pre>
	 */
	@Bean
	public BeanB1 createBeanB1() {
		return new BeanB1();
	}

	/**
	 * <pre>
	 * The name of the produced bean is the name of the annotated method,
	 * if the "name" attribute of the @Bean annotation is not specified.
	 * </pre>
	 */
	@Bean
	public BeanB2 createBeanB2() {
		return new BeanB2();
	}

	/**
	 * <pre>
	 * The name of the produced bean is the value of the "name" attribute of the @Bean annotation,
	 * if that attribute is specified.
	 * </pre>
	 */
	@Bean(name = "beanB3")
	public BeanB3 createBeanB3() {
		return new BeanB3();
	}

	/**
	 * <pre>
	 * If the "name" attribute of the @Bean annotation is specified using multiple values,
	 * those values become aliases of the produced bean,
	 * which means all of those values can be used as the name of the produced bean,
	 * although in this case the 1st value is returned as the name of the produced bean.
	 * </pre>
	 */
	@Bean(name = { "the1stBeanB4", "the2ndBeanB4", "the3rdBeanB4" })
	public BeanB4 createBeanB4() {
		return new BeanB4();
	}

	/**
	 * <pre>
	 * Here is a case of inter-bean dependencies.
	 * The bean "beanC2" is injected into the bean "beanC1".
	 * </pre>
	 */
	@Bean(name = "beanC1")
	public BeanC1 createBeanC1(BeanC2 beanC2) {
		return new BeanC1(beanC2);
	}

	@Bean(name = "beanC2")
	public BeanC2 createBeanC2() {
		return new BeanC2();
	}

	/**
	 * <pre>
	 * Here is a case of inter-bean dependencies.
	 * The bean "beanC2" is injected into the bean "beanC3".
	 * </pre>
	 */
	@Bean(name = "beanC3")
	public BeanC3 createBeanC3(BeanC2 beanC2) {
		return new BeanC3(beanC2);
	}

}
