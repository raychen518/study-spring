package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.custom.case1;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 * Custom qualifier annotations can also be created and used.
 * </pre>
 */
public class BeanA {

	@Autowired
	@Group("beanBGroup1")
	private List<BeanB> beanBCollection1;

	private Set<BeanB> beanBCollection2;

	@Autowired
	public void prepareBeanBCollection2(@Group("beanBGroup2") Set<BeanB> beanBCollection2) {
		this.beanBCollection2 = beanBCollection2;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanBCollection1: " + beanBCollection1);
		System.out.println("beanBCollection2: " + beanBCollection2);
		System.out.println();

		if (beanBCollection1 != null) {
			for (BeanB beanB : beanBCollection1) {
				beanB.doSomething();
			}
		}
		System.out.println();

		if (beanBCollection2 != null) {
			for (BeanB beanB : beanBCollection2) {
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
