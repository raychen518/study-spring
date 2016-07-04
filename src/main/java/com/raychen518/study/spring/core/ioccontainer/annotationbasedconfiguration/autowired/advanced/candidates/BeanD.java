package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.candidates;

public class BeanD {

	private int number;

	public BeanD() {
	}

	public BeanD(int number) {
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
		System.out.println(new BeanD(1));
		System.out.println(new BeanD(2));
		System.out.println(new BeanD(3));
	}

}
