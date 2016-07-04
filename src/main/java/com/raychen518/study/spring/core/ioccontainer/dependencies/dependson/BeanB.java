package com.raychen518.study.spring.core.ioccontainer.dependencies.dependson;

import java.util.Calendar;

public class BeanB {

	public BeanB() {
		System.out.println("Initialized " + getClass().getName());
	}

	@Override
	public String toString() {
		return getClass().getName() + "_" + Calendar.getInstance().getTimeInMillis();
	}

}
