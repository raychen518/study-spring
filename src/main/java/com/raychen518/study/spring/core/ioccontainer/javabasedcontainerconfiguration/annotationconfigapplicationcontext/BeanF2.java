package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonBean;

public class BeanF2 extends CommonBean {

	public BeanF2() {
		super();
	}

	public BeanF2(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanF2(1));
		System.out.println(new BeanF2(2));
		System.out.println(new BeanF2(3));
	}

}
