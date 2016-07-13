package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext.somepackage;

import org.springframework.stereotype.Component;

import com.raychen518.study.spring.core.ioccontainer.CommonBean;

@Component
public class BeanG2 extends CommonBean {

	public BeanG2() {
		super();
	}

	public BeanG2(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanG2(1));
		System.out.println(new BeanG2(2));
		System.out.println(new BeanG2(3));
	}

}
