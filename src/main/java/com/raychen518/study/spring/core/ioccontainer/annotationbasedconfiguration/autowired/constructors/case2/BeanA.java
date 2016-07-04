package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.constructors.case2;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 * Use of the @Autowired annotation on constructors does not need the <constructor-arg> elements in the configuration.
 * </pre>
 */
public class BeanA {

	private BeanB beanB;

	@Autowired
	public BeanA(BeanB beanB) {
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
		BeanA bean = new BeanA(new BeanB());
		bean.doSomething();
	}

}
