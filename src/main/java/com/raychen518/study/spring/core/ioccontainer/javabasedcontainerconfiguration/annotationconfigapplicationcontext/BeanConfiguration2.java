package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * The @Component (and @Repository, @Service and @Controller) classes can be used as input of the AnnotationConfigApplicationContext.
 * </pre>
 */
@Component
public class BeanConfiguration2 {

	@Bean(name = "beanB1")
	public BeanB1 createBeanB1() {
		return new BeanB1();
	}

	@Bean(name = "beanB2")
	public BeanB2 createBeanB2() {
		return new BeanB2();
	}

}
