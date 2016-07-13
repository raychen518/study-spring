package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer.CommonBean;

public class BeanE2 extends CommonBean {

	public BeanE2() {
		super();
	}

	public BeanE2(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanE2(1));
		System.out.println(new BeanE2(2));
		System.out.println(new BeanE2(3));
	}

}
