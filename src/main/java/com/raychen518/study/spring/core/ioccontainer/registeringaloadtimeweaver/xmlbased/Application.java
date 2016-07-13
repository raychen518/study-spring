package com.raychen518.study.spring.core.ioccontainer.registeringaloadtimeweaver.xmlbased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raychen518.study.spring.util.Utils;

/**
 * <pre>
 * This application shows how to register a LoadTimeWeaver object, by XML based configuration.
 * 
 * - The LoadTimeWeaver object is used by Spring to dynamically transform classes as they are loaded into the JVM.
 * 
 * - A VM argument "-javaagent:{SPRING_INSTRUMENT_JAR}" may have to be added for launching this application, as follows.
 *   e.g.
 *       -javaagent:spring-instrument-4.2.3.RELEASE.jar
 *       -javaagent:"C:\Users\rchen\.m2\repository\org\springframework\spring-instrument\4.2.3.RELEASE\spring-instrument-4.2.3.RELEASE.jar"
 * 
 * - The following dependency may have to be added in the POM file for launching this application.
 *   ---------------------------------------------------------------------------
 *   <dependency>
 *       <groupId>org.springframework</groupId>
 *       <artifactId>spring-instrument</artifactId>
 *       <version>4.2.3.RELEASE</version>
 *   </dependency>
 *   ---------------------------------------------------------------------------
 * </pre>
 */
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.registeringaloadtimeweaver.xmlbased.xml");

		Utils.listBeans(applicationContext);

		SomeBean someBean = applicationContext.getBean(SomeBean.class);
		System.out.println("someBean: " + someBean);
		System.out.println("someBean.getLoadTimeWeaver(): " + someBean.getLoadTimeWeaver());
		System.out.println();

		applicationContext.close();
	}

}
