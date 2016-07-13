package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer.CommonBean;

public class BeanF1 extends CommonBean {

	public BeanF1() {
		super();
	}

	public BeanF1(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanF1(1));
		System.out.println(new BeanF1(2));
		System.out.println(new BeanF1(3));
	}

}
