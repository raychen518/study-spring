package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.collections;

import java.util.Calendar;

public class BeanForList {

	@Override
	public String toString() {
		return getClass().getName() + "_" + Calendar.getInstance().getTimeInMillis();
	}

}
