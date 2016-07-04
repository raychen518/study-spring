package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.case1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <pre>
 * The Qualifier annotation is used on a parameter of a constructor.
 * </pre>
 */
public class BeanA3 {

	private BeanB beanB;

	@Autowired
	public BeanA3(@Qualifier("thirdBeanB") BeanB beanB) {
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
		BeanA3 bean = new BeanA3(null);
		bean.doSomething();
	}

}
