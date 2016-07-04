package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonBean;

public class BeanD1 extends CommonBean {

	public BeanD1() {
		super();
	}

	public BeanD1(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanD1(1));
		System.out.println(new BeanD1(2));
		System.out.println(new BeanD1(3));
	}

}
