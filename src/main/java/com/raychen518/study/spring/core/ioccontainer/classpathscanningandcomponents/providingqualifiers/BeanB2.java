package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.providingqualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Special")
public class BeanB2 extends CommonBean {

	public BeanB2() {
		super();
	}

	public BeanB2(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB2(1));
		System.out.println(new BeanB2(2));
		System.out.println(new BeanB2(3));
	}

}
