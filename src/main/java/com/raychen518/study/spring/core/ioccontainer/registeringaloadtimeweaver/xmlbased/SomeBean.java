package com.raychen518.study.spring.core.ioccontainer.registeringaloadtimeweaver.xmlbased;

import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.instrument.classloading.LoadTimeWeaver;

public class SomeBean implements LoadTimeWeaverAware {

	private LoadTimeWeaver loadTimeWeaver;

	public LoadTimeWeaver getLoadTimeWeaver() {
		return loadTimeWeaver;
	}

	@Override
	public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
		System.out.println(getClass().getSimpleName() + ": Setting the \"loadTimeWeaver\" bean: " + loadTimeWeaver);
		System.out.println();

		this.loadTimeWeaver = loadTimeWeaver;
	}

}
