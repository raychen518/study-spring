package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.startupandshutdowncallbacks;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.customizingbeannature.startupandshutdowncallbacks.xml");
		System.out.println();

		// BeanA, BeanB and BeanC implement the SmartLifecycle interface.

		// BeanA.isAutoStartup() returns false (default).
		// BeanB.isAutoStartup() returns true.
		// BeanC.isAutoStartup() returns false (default).
		// BeanD.isAutoStartup() returns true.

		// BeanA.isRunning() returns false (default).
		// BeanB.isRunning() returns false (default).
		// BeanC.isRunning() returns true.
		// BeanD.isRunning() returns false (default).

		// BeanA.getPhase() returns 0 (default).
		// BeanB.getPhase() returns 0 (default).
		// BeanC.getPhase() returns 0 (default).
		// BeanD.getPhase() returns -1.

		applicationContext.close();
	}

}
