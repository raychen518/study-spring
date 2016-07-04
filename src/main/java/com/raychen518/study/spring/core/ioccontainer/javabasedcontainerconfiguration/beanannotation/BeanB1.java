package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

import com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation.somepackage.BeanC1;

public class BeanB1 {

	private BeanC1 beanC1;

	public BeanC1 getBeanC1() {
		return beanC1;
	}

	public void setBeanC1(BeanC1 beanC1) {
		this.beanC1 = beanC1;
	}

}