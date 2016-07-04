package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.SpecialComponent;

@SpecialComponent
public class SomeBean14 extends CommonBean {

	public SomeBean14() {
		super();
	}

	public SomeBean14(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new SomeBean14(1));
		System.out.println(new SomeBean14(2));
		System.out.println(new SomeBean14(3));
	}

}
