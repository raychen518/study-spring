package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanH1 {

	@PostConstruct
	public void doInitialization() {
		System.out.println(
				getClass().getSimpleName() + ": Initializing the bean by using the @PostConstruct annotation...");
	}

	@PreDestroy
	public void doDestroying() {
		System.out.println(getClass().getSimpleName() + ": Destroying the bean by using the @PreDestroy annotation...");
	}

}
