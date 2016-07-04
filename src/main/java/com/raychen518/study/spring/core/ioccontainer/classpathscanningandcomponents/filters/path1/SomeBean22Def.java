package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path1;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;

public class SomeBean22Def extends CommonBean {

	public SomeBean22Def() {
		super();
	}

	public SomeBean22Def(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean22Def(1));
		System.out.println(new SomeBean22Def(2));
		System.out.println(new SomeBean22Def(3));
	}

}
