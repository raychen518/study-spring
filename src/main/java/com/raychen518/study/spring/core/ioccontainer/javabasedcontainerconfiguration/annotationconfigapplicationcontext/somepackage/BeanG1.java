package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext.somepackage;

import org.springframework.stereotype.Component;

import com.raychen518.study.spring.core.ioccontainer.CommonBean;

@Component
public class BeanG1 extends CommonBean {

	public BeanG1() {
		super();
	}

	public BeanG1(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanG1(1));
		System.out.println(new BeanG1(2));
		System.out.println(new BeanG1(3));
	}

}
