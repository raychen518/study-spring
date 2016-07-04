package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.providingqualifiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

	@Autowired(required = false)
	private List<CommonBean> commonBeanCollection;

	@Autowired(required = false)
	@Qualifier("Special")
	private List<CommonBean> commonBeanCollectionSpecial;

	@Autowired(required = false)
	@Online
	private List<CommonBean> commonBeanCollectionOnline;

	@Autowired(required = false)
	@Processed(false)
	private List<CommonBean> commonBeanCollectionNotProcessed;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("----------------------------------------------------");

		System.out.println("commonBeanCollection: " + commonBeanCollection);
		if (commonBeanCollection != null) {
			System.out.println("commonBeanCollection.size(): " + commonBeanCollection.size());
			for (CommonBean commonBean : commonBeanCollection) {
				System.out.println(commonBean);
			}
		}

		System.out.println();

		System.out.println("commonBeanCollectionSpecial: " + commonBeanCollectionSpecial);
		if (commonBeanCollectionSpecial != null) {
			System.out.println("commonBeanCollectionSpecial.size(): " + commonBeanCollectionSpecial.size());
			for (CommonBean commonBean : commonBeanCollectionSpecial) {
				System.out.println(commonBean);
			}
		}

		System.out.println();

		System.out.println("commonBeanCollectionOnline: " + commonBeanCollectionOnline);
		if (commonBeanCollectionOnline != null) {
			System.out.println("commonBeanCollectionOnline.size(): " + commonBeanCollectionOnline.size());
			for (CommonBean commonBean : commonBeanCollectionOnline) {
				System.out.println(commonBean);
			}
		}

		System.out.println();

		System.out.println("commonBeanCollectionNotProcessed: " + commonBeanCollectionNotProcessed);
		if (commonBeanCollectionNotProcessed != null) {
			System.out.println("commonBeanCollectionNotProcessed.size(): " + commonBeanCollectionNotProcessed.size());
			for (CommonBean commonBean : commonBeanCollectionNotProcessed) {
				System.out.println(commonBean);
			}
		}

		System.out.println("----------------------------------------------------");
	}

}
