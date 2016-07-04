package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.providingqualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Special")
public class BeanB4 extends CommonBean {

	public BeanB4() {
		super();
	}

	public BeanB4(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanB4(1));
		System.out.println(new BeanB4(2));
		System.out.println(new BeanB4(3));
	}

}
