package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanH2 implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(getClass().getSimpleName()
				+ ": Initializing the bean by implementing the InitializingBean interface...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(
				getClass().getSimpleName() + ": Destroying the bean by implementing the DisposableBean interface...");
	}

}
