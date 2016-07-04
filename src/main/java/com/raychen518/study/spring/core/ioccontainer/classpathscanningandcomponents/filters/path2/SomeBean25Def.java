package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;

public class SomeBean25Def extends CommonBean {

	public SomeBean25Def() {
		super();
	}

	public SomeBean25Def(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean25Def(1));
		System.out.println(new SomeBean25Def(2));
		System.out.println(new SomeBean25Def(3));
	}

}
