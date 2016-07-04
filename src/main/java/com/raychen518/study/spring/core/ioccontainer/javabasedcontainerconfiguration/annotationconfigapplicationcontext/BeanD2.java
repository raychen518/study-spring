package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonBean;

public class BeanD2 extends CommonBean {

	public BeanD2() {
		super();
	}

	public BeanD2(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanD2(1));
		System.out.println(new BeanD2(2));
		System.out.println(new BeanD2(3));
	}

}
