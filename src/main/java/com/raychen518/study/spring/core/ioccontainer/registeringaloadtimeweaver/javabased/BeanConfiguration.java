package com.raychen518.study.spring.core.ioccontainer.registeringaloadtimeweaver.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@Configuration
// The following annotation must be added for the classes autowiring the
// LoadTimeWeaverAware object.
@EnableLoadTimeWeaving
public class BeanConfiguration {

	@Bean(name = "someBean")
	public SomeBean createSomeBean() {
		return new SomeBean();
	}

}
