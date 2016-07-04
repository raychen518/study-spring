package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents.somepath;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents.BeanB4;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents.CommonBean;

@Component
public class BeanC3 extends CommonBean {

	public BeanC3() {
		super();
	}

	public BeanC3(int number) {
		super(number);
	}

	@Bean
	public CommonBean generateBean1() {
		return new BeanB4(0);
	}

	@Bean
	@Qualifier("someQualifier")
	public CommonBean generateBean2() {
		return new BeanB4(1);
	}

	@Bean
	@Scope(BeanDefinition.SCOPE_SINGLETON)
	public CommonBean generateBean3() {
		return new BeanB4(2);
	}

	@Bean
	@Primary
	public CommonBean generateBean4() {
		return new BeanB4(3);
	}

	@Bean
	@Lazy
	public CommonBean generateBean5() {
		return new BeanB4(4);
	}

	@Bean
	public CommonBean generateBean6(@Qualifier("someQualifier") CommonBean bean) {
		return new BeanB4(5);
	}

	public static void main(String[] args) {
		System.out.println(new BeanC3(1));
		System.out.println(new BeanC3(2));
		System.out.println(new BeanC3(3));
	}

}
