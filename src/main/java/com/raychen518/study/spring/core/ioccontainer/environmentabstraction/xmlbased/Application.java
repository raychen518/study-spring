package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.xmlbased;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raychen518.study.spring.util.Utils;

/**
 * @see com.raychen518.study.spring.core.ioccontainer.environmentabstraction.
 *      javabased.Application
 */
public class Application {

	private static void instantiateContainerUsingProfileNames(String... profileNames) {
		System.out.println("The profiles to activate are: " + Arrays.toString(profileNames) + ".");
		System.out.println();

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
		applicationContext.getEnvironment().setActiveProfiles(profileNames);
		applicationContext.setConfigLocation("core.ioccontainer.environmentabstraction.xmlbased.xml");
		applicationContext.refresh();

		Utils.listBeans(applicationContext);

		applicationContext.close();
	}

	public static void main(String[] args) {
		instantiateContainerUsingProfileNames("profile1");
		instantiateContainerUsingProfileNames("profile2");
		instantiateContainerUsingProfileNames("profile3");
		instantiateContainerUsingProfileNames("profile1", "profile3");
	}

}
