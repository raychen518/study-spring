package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.providingqualifiers;

import org.springframework.stereotype.Component;

@Component
@Processed(false)
public class BeanB9 extends CommonBean {

	public BeanB9() {
		super();
	}

	public BeanB9(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB9(1));
		System.out.println(new BeanB9(2));
		System.out.println(new BeanB9(3));
	}

}
