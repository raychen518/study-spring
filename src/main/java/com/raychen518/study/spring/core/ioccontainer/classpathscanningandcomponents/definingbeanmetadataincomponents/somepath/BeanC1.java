package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents.somepath;

import org.springframework.stereotype.Component;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents.CommonBean;

@Component
public class BeanC1 extends CommonBean {

	public BeanC1() {
		super();
	}

	public BeanC1(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanC1(1));
		System.out.println(new BeanC1(2));
		System.out.println(new BeanC1(3));
	}

}
