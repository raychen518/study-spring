package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.candidates;

public class BeanE {

	private int number;

	public BeanE() {
	}

	public BeanE(int number) {
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
		System.out.println(new BeanE(1));
		System.out.println(new BeanE(2));
		System.out.println(new BeanE(3));
	}

}
