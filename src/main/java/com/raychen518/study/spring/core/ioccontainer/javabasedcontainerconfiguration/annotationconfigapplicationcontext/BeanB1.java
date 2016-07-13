package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer.CommonBean;

public class BeanB1 extends CommonBean {

	public BeanB1() {
		super();
	}

	public BeanB1(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB1(1));
		System.out.println(new BeanB1(2));
		System.out.println(new BeanB1(3));
	}

}
