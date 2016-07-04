package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.resource;

public abstract class CommonBean {

	private int number;

	public CommonBean() {
	}

	public CommonBean(int number) {
		this.number = number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " (" + number + ")";
	}

}
