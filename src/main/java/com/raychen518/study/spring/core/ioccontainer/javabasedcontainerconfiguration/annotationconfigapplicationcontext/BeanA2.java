package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonBean;

public class BeanA2 extends CommonBean {

	public BeanA2() {
		super();
	}

	public BeanA2(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanA2(1));
		System.out.println(new BeanA2(2));
		System.out.println(new BeanA2(3));
	}

}
