package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.SpecialComponent;

@SpecialComponent
public class SomeBean13 extends CommonBean {

	public SomeBean13() {
		super();
	}

	public SomeBean13(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean13(1));
		System.out.println(new SomeBean13(2));
		System.out.println(new SomeBean13(3));
	}

}
