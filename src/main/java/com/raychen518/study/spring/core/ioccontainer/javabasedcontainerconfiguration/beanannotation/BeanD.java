package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

public class BeanD {

	public void initialize() {
		System.out.println(getClass().getSimpleName() + ": initializing...");
	}

}
