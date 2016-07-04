package com.raychen518.study.spring.core.ioccontainer.usingjsr330standardannotations;

import javax.inject.Named;

@Named("target3")
public class BeanB5 extends CommonBean {

	public BeanB5() {
		super();
	}

	public BeanB5(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB5(1));
		System.out.println(new BeanB5(2));
		System.out.println(new BeanB5(3));
	}

}
