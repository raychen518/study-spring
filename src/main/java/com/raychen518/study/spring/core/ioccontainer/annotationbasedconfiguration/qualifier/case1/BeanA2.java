package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <pre>
 * The Qualifier annotation is used on a setter method.
 * </pre>
 */
public class BeanA2 {

	private BeanB beanB;

	@Autowired
	@Qualifier("secondBeanB")
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanB: " + beanB);

		if (beanB != null) {
			beanB.doSomething();
		}
	}

	public static void main(String[] args) {
		BeanA2 bean = new BeanA2();
		bean.doSomething();
	}

}
