package com.raychen518.study.spring.core.ioccontainer.dependencies.autowiring;

import java.util.Calendar;

public class BeanC {

	@Override
	public String toString() {
		return getClass().getName() + "_" + Calendar.getInstance().getTimeInMillis();
	}

}
