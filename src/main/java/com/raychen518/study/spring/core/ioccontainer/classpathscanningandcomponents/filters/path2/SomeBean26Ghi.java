package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;

public class SomeBean26Ghi extends CommonBean {

	public SomeBean26Ghi() {
		super();
	}

	public SomeBean26Ghi(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean26Ghi(1));
		System.out.println(new SomeBean26Ghi(2));
		System.out.println(new SomeBean26Ghi(3));
	}

}
