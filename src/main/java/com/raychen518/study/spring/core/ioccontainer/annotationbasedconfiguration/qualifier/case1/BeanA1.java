package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <pre>
 * The Qualifier annotation is used on a field.
 * </pre>
 */
public class BeanA1 {

	@Autowired
	@Qualifier("firstBeanB")
	private BeanB beanB;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanB: " + beanB);

		if (beanB != null) {
			beanB.doSomething();
		}
	}

	public static void main(String[] args) {
		BeanA1 bean = new BeanA1();
		bean.doSomething();
	}

}
