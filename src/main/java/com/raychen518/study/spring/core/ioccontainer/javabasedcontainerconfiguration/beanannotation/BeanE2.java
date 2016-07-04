package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

public class BeanE2 {

	public void shutdown() {
		System.out.println(getClass().getSimpleName() + ": destroying (by the default \"shutdown()\" method)...");
	}

}
