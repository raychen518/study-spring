package com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.constructorbased.usinginstancefactorymethod;

import com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.BeanB;
import com.raychen518.study.spring.core.ioccontainer.dependencies.di.xmlbased.BeanC;

public class BeanGenerator {

	private static BeanA1 instanceA1 = null;
	private static BeanA2 instanceA2 = null;

	public BeanA1 createInstanceA1(BeanB value1, BeanC value2, String value3) {
		if (instanceA1 == null) {
			instanceA1 = new BeanA1(value1, value2, value3);
		}

		return instanceA1;
	}

	public BeanA2 createInstanceA2(BeanB value1, BeanC value2, String value3) {
		if (instanceA2 == null) {
			instanceA2 = new BeanA2(value1, value2, value3);
		}

		return instanceA2;
	}

	public static void main(String[] args) {
		BeanGenerator beanGenerator = new BeanGenerator();

		BeanA1 beanA1 = beanGenerator.createInstanceA1(new BeanB(), new BeanC(), "Some Text 1");
		beanA1.doSomething();
		System.out.println();

		BeanA2 beanA2 = beanGenerator.createInstanceA2(new BeanB(), new BeanC(), "Some Text 2");
		beanA2.doSomething();
		System.out.println();
	}

}
