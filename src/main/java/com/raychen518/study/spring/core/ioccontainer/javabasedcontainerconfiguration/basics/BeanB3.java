package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

public class BeanB3 extends CommonBean {

	public BeanB3() {
		super();
	}

	public BeanB3(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB3(1));
		System.out.println(new BeanB3(2));
		System.out.println(new BeanB3(3));
	}

}
