package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path3;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.SpecialComponent;

@SpecialComponent
public class BeanF extends CommonBean {

	public BeanF() {
		super();
	}

	public BeanF(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanF(1));
		System.out.println(new BeanF(2));
		System.out.println(new BeanF(3));
	}

}
