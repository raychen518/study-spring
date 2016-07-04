package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.cnamespace;

import java.util.Calendar;

public class SomeOtherBean {

	@Override
	public String toString() {
		return getClass().getName() + "_" + Calendar.getInstance().getTimeInMillis();
	}

}
