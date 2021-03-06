package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.case2;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <pre>
 * Besides selecting a single type match,
 * the Qualifier annotation also selects a set of type matches,
 * which can be used to inject into a field of a typed collection.
 * </pre>
 */
public class BeanA {

	@Autowired
	@Qualifier("beanBGroup1")
	private List<BeanB> beanBCollection1;

	@Autowired
	@Qualifier("beanBGroup2")
	private Set<BeanB> beanBCollection2;

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
