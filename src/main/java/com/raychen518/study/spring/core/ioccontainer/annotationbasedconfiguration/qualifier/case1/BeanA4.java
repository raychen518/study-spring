package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <pre>
 * The Qualifier annotation is used on parameters of a normal method.
 * </pre>
 */
public class BeanA4 {

	private BeanB beanB1;
	private BeanB beanB2;
	private BeanB beanB3;

	@Autowired
	public void prepareBeans(@Qualifier("firstBeanB") BeanB beanB1, @Qualifier("secondBeanB") BeanB beanB2,
			@Qualifier("thirdBeanB") BeanB beanB3) {
		System.out.println(getClass().getSimpleName() + ": Preparing Beans...");
		this.beanB1 = beanB1;
		this.beanB2 = beanB2;
		this.beanB3 = beanB3;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanB1: " + beanB1);
		System.out.println("beanB2: " + beanB2);
		System.out.println("beanB3: " + beanB3);

		if (beanB1 != null) {
			beanB1.doSomething();
		}

		if (beanB2 != null) {
			beanB2.doSomething();
		}

		if (beanB3 != null) {
			beanB3.doSomething();
		}
	}

	public static void main(String[] args) {
		BeanA4 bean = new BeanA4();
		bean.doSomething();
	}

}
