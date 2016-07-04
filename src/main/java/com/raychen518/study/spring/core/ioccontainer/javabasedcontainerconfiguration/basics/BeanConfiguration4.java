package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

import org.springframework.context.annotation.Bean;

/**
 * <pre>
 * This class is similar to the class BeanConfiguration2,
 * except this class is a POJO class instead of a @Component class.
 * </pre>
 */
public class BeanConfiguration4 {

	@Bean(name = "beanB7")
	public BeanB7 createBeanB7() {
		return new BeanB7();
	}

}
