package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.basics;

public class BeanC3 extends CommonBean {

	public BeanC3() {
		super();
	}

	public BeanC3(int number) {
		super(number);
	}

	public BeanC3(BeanC2 beanC2) {
		System.out.println("The bean \"beanC2\" is injected into the bean \"beanC3\".");
		System.out.println("beanC2: " + beanC2);
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println(new BeanC3(1));
		System.out.println(new BeanC3(2));
		System.out.println(new BeanC3(3));
	}

}
