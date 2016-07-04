package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents.somepath;

import org.springframework.stereotype.Repository;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents.CommonBean;

@Repository
public class BeanC2 extends CommonBean {

	public BeanC2() {
		super();
	}

	public BeanC2(int number) {
		super(number);
	}

	public static void main(String[] args) {
		System.out.println(new BeanC2(1));
		System.out.println(new BeanC2(2));
		System.out.println(new BeanC2(3));
	}

}
