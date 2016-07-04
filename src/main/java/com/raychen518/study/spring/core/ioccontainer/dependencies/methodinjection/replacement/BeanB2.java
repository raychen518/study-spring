package com.raychen518.study.spring.core.ioccontainer.dependencies.methodinjection.replacement;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class BeanB2 implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println(getClass().getSimpleName() + ": doSomethingSpecial(int, String)");
		return (args[0] + "$" + args[1]);
	}

}
