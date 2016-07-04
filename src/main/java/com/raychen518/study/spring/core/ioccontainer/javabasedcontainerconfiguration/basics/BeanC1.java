package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

public class BeanC1 extends CommonBean {

	public BeanC1() {
		super();
	}

	public BeanC1(int number) {
		super(number);
	}

	public BeanC1(BeanC2 beanC2) {
		System.out.println("The bean \"beanC2\" is injected into the bean \"beanC1\".");
		System.out.println("beanC2: " + beanC2);
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println(new BeanC1(1));
		System.out.println(new BeanC1(2));
		System.out.println(new BeanC1(3));
	}

}
