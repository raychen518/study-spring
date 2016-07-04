package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.dependenciesinsametype;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

	@Autowired
	private BeanB[] arrayOfBeanB;

	private List<BeanC> listOfBeanC;

	private Map<String, BeanD> mapOfBeanD;

	public BeanA() {
	}

	@Autowired
	public BeanA(Map<String, BeanD> mapOfBeanD) {
		this.mapOfBeanD = mapOfBeanD;
	}

	@Autowired
	public void setListOfBeanC(List<BeanC> listOfBeanC) {
		this.listOfBeanC = listOfBeanC;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("arrayOfBeanB: " + arrayOfBeanB);
		System.out.println("listOfBeanC: " + listOfBeanC);
		System.out.println("mapOfBeanD: " + mapOfBeanD);

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		if (arrayOfBeanB != null) {
			System.out.println("arrayOfBeanB.length: " + arrayOfBeanB.length);
			for (int i = 0; i < arrayOfBeanB.length; i++) {
				arrayOfBeanB[i].doSomething();
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		if (listOfBeanC != null) {
			System.out.println("listOfBeanC.size(): " + listOfBeanC.size());
			for (BeanC beanC : listOfBeanC) {
				beanC.doSomething();
			}
		}

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		if (mapOfBeanD != null) {
			System.out.println("mapOfBeanD.size(): " + mapOfBeanD.size());
			for (Map.Entry<String, BeanD> entryOfBeanD : mapOfBeanD.entrySet()) {
				System.out.println(entryOfBeanD.getKey());
				entryOfBeanD.getValue().doSomething();
			}
		}

	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
