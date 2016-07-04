package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case2;

import org.springframework.beans.factory.annotation.Autowired;

import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case2.path1.BeanB;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case2.path1.BeanC;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case2.path2.BeanD;
import com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case2.path2.BeanE;

/**
 * <pre>
 * The beans annotated using @Component (BeanB), @Repository (BeanC), @Service (BeanD) and @Controller (BeanE) are autowired here.
 * These beans are scanned, detected and treated as dependency candidates to inject, by the @ComponentScan annotation used in a Java configuration file which is annotated by the @Configuration annotation.
 * </pre>
 */
public class BeanA {

	@Autowired
	private BeanB beanB;

	@Autowired
	private BeanC beanC;

	@Autowired
	private BeanD beanD;

	@Autowired
	private BeanE beanE;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println();

		System.out.println("beanB: " + beanB);
		System.out.println("beanC: " + beanC);
		System.out.println("beanD: " + beanD);
		System.out.println("beanE: " + beanE);
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
