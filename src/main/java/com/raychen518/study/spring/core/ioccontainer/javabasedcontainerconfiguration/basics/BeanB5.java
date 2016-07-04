package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

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
