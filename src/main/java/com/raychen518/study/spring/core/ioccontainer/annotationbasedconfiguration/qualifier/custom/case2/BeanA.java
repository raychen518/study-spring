package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.custom.case2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 * Custom qualifier annotations without required values can be created and used.
 * </pre>
 */
public class BeanA {

	@Autowired
	@Offline
	private List<BeanB> beanBCollection;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanBCollection: " + beanBCollection);
		System.out.println();

		if (beanBCollection != null) {
			for (BeanB beanB : beanBCollection) {
				beanB.doSomething();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
