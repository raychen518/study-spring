package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path1.BeanB;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path1.BeanC;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2.BeanD;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2.BeanE;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path3.BeanF;

public class BeanA {

	@Autowired
	private BeanB beanB;

	@Autowired
	private BeanC beanC;

	@Autowired
	private BeanD beanD;

	@Autowired
	private BeanE beanE;

	@Autowired
	private BeanF beanF;

	@Autowired
	private List<CommonBean> beans;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println();

		System.out.println("beanB: " + beanB);
		System.out.println("beanC: " + beanC);
		System.out.println("beanD: " + beanD);
		System.out.println("beanE: " + beanE);
		System.out.println("beanF: " + beanF);
		System.out.println();

		System.out.println("beans: " + beans);
		if (beans != null) {
			System.out.println("beans.size(): " + beans.size());
			int beanNumber = 0;
			for (CommonBean bean : beans) {
				System.out.println("beans[" + (++beanNumber) + "]: " + bean);
			}
		}
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
