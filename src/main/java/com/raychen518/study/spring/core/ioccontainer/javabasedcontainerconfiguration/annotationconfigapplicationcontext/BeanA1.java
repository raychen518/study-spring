package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer.CommonBean;

public class BeanA1 extends CommonBean {

	public BeanA1() {
		super();
	}

	public BeanA1(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanA1(1));
		System.out.println(new BeanA1(2));
		System.out.println(new BeanA1(3));
	}

}
