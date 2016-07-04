package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path1;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;

public class SomeBean21Abc extends CommonBean {

	public SomeBean21Abc() {
		super();
	}

	public SomeBean21Abc(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean21Abc(1));
		System.out.println(new SomeBean21Abc(2));
		System.out.println(new SomeBean21Abc(3));
	}

}
