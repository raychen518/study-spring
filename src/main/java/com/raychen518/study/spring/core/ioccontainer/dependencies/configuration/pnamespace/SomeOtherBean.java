package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.pnamespace;

import java.util.Calendar;

public class SomeOtherBean {

	@Override
	public String toString() {
		return getClass().getName() + "_" + Calendar.getInstance().getTimeInMillis();
	}

}
