package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.candidates;

public class BeanC {

	private int number;

	public BeanC() {
	}

	public BeanC(int number) {
		this.number = number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ": #" + number;
	}

	public static void main(String[] args) {
		System.out.println(new BeanC(1));
		System.out.println(new BeanC(2));
		System.out.println(new BeanC(3));
	}

}
