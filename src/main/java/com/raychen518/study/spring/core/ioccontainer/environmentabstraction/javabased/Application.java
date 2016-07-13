package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.javabased;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.util.Utils;

/**
 * <pre>
 * There are several ways to specify the profiles to activate in a container (application context).
 * The most straightforward is to invoke the following method via the ApplicationContext object.
 *     setActiveProfiles(String...)
 * Other ways are as follows.
 * - Specify the spring.profiles.active property through system environment variables, JVM system properties, servlet context parameters (in web.xml), or as an JNDI entry.
 *   e.g. Specify the profiles "profile1" and "profile3" to activate through a JVM system property,
 *        by adding the following option statement to the Java command.
 *            -Dspring.profiles.active="profile1, profile3"
 *            Note: The option "-D{PropertyName}={PropertyValue}" is used to set a JVM system property value when starting a Java application.
 * - Use the @ActiveProfiles annotation (in the spring-test module) in integration tests.
 * </pre>
 */
public class Application {

	private static void instantiateContainerUsingProfileNames(String... profileNames) {
		System.out.println("The profiles to activate are: " + Arrays.toString(profileNames) + ".");
		System.out.println();

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		// Specify the profiles to activate.
		applicationContext.getEnvironment().setActiveProfiles(profileNames);
		applicationContext.register(BeanConfiguration.class);
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
