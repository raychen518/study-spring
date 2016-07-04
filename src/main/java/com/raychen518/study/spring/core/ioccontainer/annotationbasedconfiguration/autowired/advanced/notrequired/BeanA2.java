package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.notrequired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 * Use of the "required = false" setting for the @Autowired annotation changes the default behavior to allow null dependencies.
 * Otherwise null dependencies cause container exceptions.
 * </pre>
 */
public class BeanA2 {

	@Autowired(required = false)
	private BeanB beanB;

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
