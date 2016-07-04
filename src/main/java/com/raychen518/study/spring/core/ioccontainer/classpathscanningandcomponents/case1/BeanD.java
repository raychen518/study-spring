package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case1;

import org.springframework.stereotype.Service;

@Service
public class BeanD extends CommonBean {

	public BeanD() {
		super();
	}

	public BeanD(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanD(1));
		System.out.println(new BeanD(2));
		System.out.println(new BeanD(3));
	}

}
