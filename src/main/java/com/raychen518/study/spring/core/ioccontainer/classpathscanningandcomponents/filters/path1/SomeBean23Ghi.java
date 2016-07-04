package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path1;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;

public class SomeBean23Ghi extends CommonBean {

	public SomeBean23Ghi() {
		super();
	}

	public SomeBean23Ghi(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean23Ghi(1));
		System.out.println(new SomeBean23Ghi(2));
		System.out.println(new SomeBean23Ghi(3));
	}

}
