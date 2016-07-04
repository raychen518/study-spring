package com.raychen518.study.spring.core.ioccontainer.beandefinitioninheritance;

public class BeanB1 {

	public void initialize() {
		System.out.println(getClass().getSimpleName() + ": initialize()");
	}

	public void destroy() {
		System.out.println(getClass().getSimpleName() + ": destroy()");
	}

}
