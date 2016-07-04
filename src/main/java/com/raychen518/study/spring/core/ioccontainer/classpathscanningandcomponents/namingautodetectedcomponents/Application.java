package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.namingautodetectedcomponents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * Naming Auto-detected Components
 * - For classes annotated by the Spring stereotype annotations (@Component, @Repository, @Service, and @Controller),
 *     - if the annotation contains no "name" value (the attribute name is "value"), the default bean name generator returns the uncapitalized non-qualified class name as the bean name.
 *       e.g.: @Component public class BeanA { ... } uses "beanA" as the bean name.
 *
 *     - if the annotation contains "name" value (the attribute name is "value"), that "name" value is used as the bean name.
 *       e.g.: @Component("theBeanA") public class BeanA { ... } uses "theBeanA" as the bean name.
 *
 * - Custom bean-naming strategies can be used by creating and specifying classes implementing org.springframework.beans.factory.support.BeanNameGenerator.
 * </pre>
 */
public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"core.ioccontainer.classpathscanningandcomponents.namingautodetectedcomponents.1.xml",
					"core.ioccontainer.classpathscanningandcomponents.namingautodetectedcomponents.2.xml",
					"core.ioccontainer.classpathscanningandcomponents.namingautodetectedcomponents.3.xml");
			System.out.println();

			System.out.println("No.\tName");
			System.out.println("------------------------------------------------");
			int beanCount = 0;
			for (String beanName : applicationContext.getBeanDefinitionNames()) {
				if (!beanName.startsWith("org.springframework") && !beanName.contains("BeanConfiguration")) {
					System.out.println((++beanCount) + "\t" + beanName);
				}
			}
			System.out.println();

			applicationContext.close();
		}
	}

}
