package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext.somepackage;

import com.raychen518.study.spring.core.ioccontainer.CommonBean;

public class BeanG3 extends CommonBean {

	public BeanG3() {
		super();
	}

	public BeanG3(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanG3(1));
		System.out.println(new BeanG3(2));
		System.out.println(new BeanG3(3));
	}

}
