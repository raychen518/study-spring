package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.candidates;

public class BeanB {

	private int number;

	public BeanB() {
	}

	public BeanB(int number) {
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
		System.out.println(new BeanB(1));
		System.out.println(new BeanB(2));
		System.out.println(new BeanB(3));
	}

}
