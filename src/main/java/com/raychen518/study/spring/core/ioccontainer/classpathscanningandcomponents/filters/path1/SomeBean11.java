package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path1;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.SpecialComponent;

@SpecialComponent
public class SomeBean11 extends CommonBean {

	public SomeBean11() {
		super();
	}

	public SomeBean11(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean11(1));
		System.out.println(new SomeBean11(2));
		System.out.println(new SomeBean11(3));
	}

}
