package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

public class BeanB7 extends CommonBean {

	public BeanB7() {
		super();
	}

	public BeanB7(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB7(1));
		System.out.println(new BeanB7(2));
		System.out.println(new BeanB7(3));
	}

}
