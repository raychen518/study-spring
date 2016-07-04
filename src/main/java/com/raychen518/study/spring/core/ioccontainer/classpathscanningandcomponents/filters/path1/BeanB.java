package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path1;

import org.springframework.stereotype.Component;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;

@Component
public class BeanB extends CommonBean {

	public BeanB() {
		super();
	}

	public BeanB(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB(1));
		System.out.println(new BeanB(2));
		System.out.println(new BeanB(3));
	}

}
