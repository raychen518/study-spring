package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * When the @Bean methods are not declared in the @Configuration classes
 * (such as the @Bean methods are declared in the @Component classes or POJO classes),
 * those @Bean methods are referred to as being processed in the "lite" mode.
 * 
 * The @Bean methods in the "lite" mode cannot easily declare inter-bean dependencies
 * like those @Bean methods in the "full" mode.
 * </pre>
 */
@Component
public class BeanConfiguration2 {

	/**
	 * <pre>
	 * It is possible to use the @Bean methods in the @Component (@Repository, @Service, @Controller) classes,
	 * but this approach is not a recommended approach because it may cause subtle bugs.
	 * </pre>
	 */
	@Bean(name = "beanB5")
	public BeanB5 createBeanB5() {
		return new BeanB5();
	}

}
