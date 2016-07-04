package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.collections;

import java.util.Calendar;

public class BeanForSet {

	@Override
	public String toString() {
		return getClass().getName() + "_" + Calendar.getInstance().getTimeInMillis();
	}

}
