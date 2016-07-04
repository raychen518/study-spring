package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.combininglifecyclemechanisms;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean {

	@PostConstruct
	public void doInitialization() {
		System.out.println("Initializing Bean by Adding the @PostConstruct Annotation");
	}

	@PreDestroy
	public void doDestroying() {
		System.out.println("Destroying Bean by Adding the @PreDestroy Annotation");
	}

	public void startup() {
		System.out.println("Initializing Bean by Setting the init-method Attribute");
	}

	public void shutdown() {
		System.out.println("Destroying Bean by Setting the destroy-method Attribute");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean by Implementing the InitializingBean Interface");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Bean by Implementing the DisposableBean Interface");
	}

}
