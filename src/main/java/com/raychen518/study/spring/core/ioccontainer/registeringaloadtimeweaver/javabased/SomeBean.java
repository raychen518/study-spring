package com.raychen518.study.spring.core.ioccontainer.registeringaloadtimeweaver.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.instrument.classloading.LoadTimeWeaver;

public class SomeBean {

	@Autowired
	private LoadTimeWeaver loadTimeWeaver;

	public LoadTimeWeaver getLoadTimeWeaver() {
		return loadTimeWeaver;
	}

}
