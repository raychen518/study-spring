package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case1;

import org.springframework.stereotype.Repository;

@Repository
public class BeanC extends CommonBean {

	public BeanC() {
		super();
	}

	public BeanC(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanC(1));
		System.out.println(new BeanC(2));
		System.out.println(new BeanC(3));
	}

}
