package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

public class BeanE1 {

	public void close() {
		System.out.println(getClass().getSimpleName() + ": destroying (by the default \"close()\" method)...");
	}

}
