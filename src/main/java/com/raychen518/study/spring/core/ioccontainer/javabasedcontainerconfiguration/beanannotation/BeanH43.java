package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

import org.springframework.beans.factory.BeanNameAware;

public class BeanH43 implements BeanNameAware {

	@Override
	public void setBeanName(String name) {
		System.out.println(getClass().getSimpleName() + ": name: " + name);

	}

}
