package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.shuttingdowncontainergracefully;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.customizingbeannature.shuttingdowncontainergracefully.xml");
		System.out.println();

		applicationContext.registerShutdownHook();

		applicationContext.close();
	}

}
