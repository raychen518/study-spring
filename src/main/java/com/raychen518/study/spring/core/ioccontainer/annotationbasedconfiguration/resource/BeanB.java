package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.resource;

public class BeanB extends CommonBean {

	public BeanB() {
		super();
	}

	public BeanB(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB(1));
		System.out.println(new BeanB(2));
		System.out.println(new BeanB(3));
	}

}
