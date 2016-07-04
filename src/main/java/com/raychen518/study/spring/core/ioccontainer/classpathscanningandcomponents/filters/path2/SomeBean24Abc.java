package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;

public class SomeBean24Abc extends CommonBean {

	public SomeBean24Abc() {
		super();
	}

	public SomeBean24Abc(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean24Abc(1));
		System.out.println(new SomeBean24Abc(2));
		System.out.println(new SomeBean24Abc(3));
	}

}
