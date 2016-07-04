package com.raychen518.study.spring.core.ioccontainer.dependencies.methodinjection.lookup;

public class BeanB {
	private static int instanceCount = 0;

	public BeanB() {
		instanceCount++;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "_" + instanceCount;
	}

}
