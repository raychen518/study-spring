package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

public class BeanB6 extends CommonBean {

	public BeanB6() {
		super();
	}

	public BeanB6(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB6(1));
		System.out.println(new BeanB6(2));
		System.out.println(new BeanB6(3));
	}

}
