package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path1;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.SpecialComponent;

@SpecialComponent
public class SomeBean12 extends CommonBean {

	public SomeBean12() {
		super();
	}

	public SomeBean12(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean12(1));
		System.out.println(new SomeBean12(2));
		System.out.println(new SomeBean12(3));
	}

}
