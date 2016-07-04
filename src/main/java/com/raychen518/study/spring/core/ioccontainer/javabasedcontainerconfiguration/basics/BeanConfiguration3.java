package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * This class is similar to the class BeanConfiguration2,
 * except this class is a @Service class instead of a @Component class.
 * </pre>
 */
@Service
public class BeanConfiguration3 {

	@Bean(name = "beanB6")
	public BeanB6 createBeanB6() {
		return new BeanB6();
	}

}
