package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.providingqualifiers;

import org.springframework.stereotype.Component;

@Component
@Processed(true)
public class BeanB8 extends CommonBean {

	public BeanB8() {
		super();
	}

	public BeanB8(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB8(1));
		System.out.println(new BeanB8(2));
		System.out.println(new BeanB8(3));
	}

}
