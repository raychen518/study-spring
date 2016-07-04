package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2;

import org.springframework.stereotype.Controller;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.CommonBean;

@Controller
public class BeanE extends CommonBean {

	public BeanE() {
		super();
	}

	public BeanE(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanE(1));
		System.out.println(new BeanE(2));
		System.out.println(new BeanE(3));
	}

}
