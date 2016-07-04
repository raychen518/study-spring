package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonBean;

public class BeanE1 extends CommonBean {

	public BeanE1() {
		super();
	}

	public BeanE1(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanE1(1));
		System.out.println(new BeanE1(2));
		System.out.println(new BeanE1(3));
	}

}
