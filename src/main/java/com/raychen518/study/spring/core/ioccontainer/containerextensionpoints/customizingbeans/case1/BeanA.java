package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizingbeans.case1;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean {

	public BeanA() {
		System.out.println();
		System.out.println(getClass().getSimpleName() + ": Constructing...");
	}

	@PostConstruct
	public void initialize() {
		System.out.println(getClass().getSimpleName() + ": Initializing by @PostConstruct Annotation...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(getClass().getSimpleName() + ": Initializing by InitializingBean Interface...");

	}

	public void startUp() {
		System.out.println(getClass().getSimpleName() + ": Initializing by init-method Attribute...");
	}

}
