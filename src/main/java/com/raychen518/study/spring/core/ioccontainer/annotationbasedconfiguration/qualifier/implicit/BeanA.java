package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.implicit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>
 * There is an implicit form of qualification
 * that generic types are used as the qualifiers in the qualification.
 * 
 * In this case, the generic types Integer and String are used to qualify the managed beans of the type SomeBean.
 * </pre>
 */
public class BeanA {

	@Autowired
	private List<SomeBean<Integer>> someBeanCollectionUsingInteger;

	@Autowired
	private List<SomeBean<String>> someBeanCollectionUsingString;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("someBeanCollectionUsingInteger: " + someBeanCollectionUsingInteger);
		System.out.println("someBeanCollectionUsingString: " + someBeanCollectionUsingString);
		System.out.println();

		if (someBeanCollectionUsingInteger != null) {
			for (SomeBean<Integer> someBean : someBeanCollectionUsingInteger) {
				System.out.println(someBean);
			}
		}
		System.out.println();

		if (someBeanCollectionUsingString != null) {
			for (SomeBean<String> someBean : someBeanCollectionUsingString) {
				System.out.println(someBean);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
