package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext;

import java.util.Random;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.util.Utils;

/**
 * <pre>
 * - ApplicationContext Hierarchy
 *   Package: org.springframework.context
 *   Package: org.springframework.web.context
 *   ===========================================================================
 *   ApplicationContext (Interface)
 *   	ConfigurableApplicationContext (Interface)
 *   		AbstractApplicationContext (Abstract Class)
 *   			AbstractRefreshableApplicationContext (Abstract Class)
 *   				AbstractRefreshableConfigApplicationContext (Abstract Class)
 *   					AbstractRefreshableWebApplicationContext (Abstract Class)
 *   						<See Below>
 *   					AbstractXmlApplicationContext (Abstract Class)
 *   						ClassPathXmlApplicationContext (Class)				<COMMONLY USED>
 *   						FileSystemXmlApplicationContext (Class)				<COMMONLY USED>
 *   			GenericApplicationContext (Class)
 *   				AnnotationConfigApplicationContext (Class)					<COMMONLY USED>
 *   				GenericGroovyApplicationContext (Class)
 *   				GenericWebApplicationContext (Class)
 *   				GenericXmlApplicationContext (Class)
 *   				StaticApplicationContext (Class)
 *   					StaticWebApplicationContext (Class)
 *   		ConfigurableWebApplicationContext (Interface)
 *   			<See Below>
 *   	WebApplicationContext (Interface)
 *   		ConfigurableWebApplicationContext (Interface)
 *   			AbstractRefreshableWebApplicationContext (Abstract Class)
 *   				AnnotationConfigWebApplicationContext (Class)				<COMMONLY USED>
 *   				GroovyWebApplicationContext (Class)
 *   				XmlWebApplicationContext (Class)
 *   			GenericWebApplicationContext (Class)
 *   			StaticWebApplicationContext (Class)
 *   ===========================================================================
 * 
 * - AnnotationConfigApplicationContext VS ClassPathXmlApplicationContext
 *  Implementation							Instantiation															Input
 *  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 *  AnnotationConfigApplicationContext		new AnnotationConfigApplicationContext(BeanConfiguration.class);		Java configuration classes.
 *  ClassPathXmlApplicationContext			new ClassPathXmlApplicationContext("beanConfiguration.xml");			XML configuration files.
 *  
 * - The AnnotationConfigApplicationContext accepts classes annotated with @Configuration, @Component (and @Repository, @Service and @Controller) and JSR-330 annotations, and also the POJO classes.
 *   Note: Actually, the @Configuration annotation is a special @Component annotation. It is meta-annotated with the @Component annotation.
 * 
 * - The AnnotationConfigApplicationContext allows for completely XML-free usage of the Spring container.
 * 
 * - An Example of Support for Web Applications Using the AnnotationConfigWebApplicationContext
 *   The AnnotationConfigWebApplicationContext can be used to support web applications
 *   when configuring the Spring ContextLoaderListener servlet listener, the Spring MVC DispatcherServlet, etc.
 *   Here is an example of a web.xml snippet that configures a typical Spring MVC web application.
 *   -------------------------------------------------------------------------------------------------------------------
 *   <?xml version="1.0" encoding="UTF-8"?>
 *   <web-app>
 *   	<!-- Specify the context implementation. -->
 *   	<!-- The default value is XmlWebApplicationContext. -->
 *   	<context-param>
 *   		<param-name>contextClass</param-name>
 *   		<param-value>org.springframework.web.context.support.AnnotationConfigWebApplicationContext</param-value>
 *   	</context-param>

 *   	<!-- Specify the context configuration location. -->
 *   	<!-- Fully-qualified @Configuration classes or packages (for component-scanning) can be used here. -->
 *   	<!-- Those classes or packages are delimited using commas or spaces. -->
 *   	<context-param>
 *   		<param-name>contextConfigLocation</param-name>
 *   		<param-value>com.somecompany.someapplication.ApplicationConfig</param-value>
 *   	</context-param>

 *   	<!-- Specify the context loader listener. -->
 *   	<listener>
 *   		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
 *   	</listener>

 *   	<!-- Specify a servlet. -->
 *   	<servlet>
 *   		<servlet-name>dispatcher</servlet-name>

 *   		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>

 *   		<init-param>
 *   			<param-name>contextClass</param-name>
 *   			<param-value>org.springframework.web.context.support.AnnotationConfigWebApplicationContext</param-value>
 *   		</init-param>

 *   		<init-param>
 *   			<param-name>contextConfigLocation</param-name>
 *   			<param-value>com.somecompany.someapplication.web.ApplicationConfig</param-value>
 *   		</init-param>
 *   	</servlet>

 *   	<!-- Specify a servlet mapping. -->
 *   	<servlet-mapping>
 *   		<servlet-name>dispatcher</servlet-name>
 *   		<url-pattern>/somePath/*</url-pattern>
 *   	</servlet-mapping>
 *   </web-app>
 *   -------------------------------------------------------------------------------------------------------------------
 * </pre>
 */
public class Application {

	public static void main(String[] args) {
		// =====================================================================
		// Case 1: Create the application context using the constructor with a
		// Java configuration class.
		// =====================================================================
		{
			ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
					BeanConfiguration1.class);
			System.out.println();

			Utils.listBeans(applicationContext);

			applicationContext.close();
		}

		// =====================================================================
		// Case 2: Create the application context using the constructor with
		// multiple Java configuration classes.
		// =====================================================================
		{
			ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
					BeanConfiguration1.class, BeanConfiguration2.class, BeanConfiguration3.class,
					BeanConfiguration4.class, BeanConfiguration5.class, BeanConfiguration6.class,
					BeanConfiguration7.class, SomeBean.class);
			System.out.println();

			Utils.listBeans(applicationContext);

			applicationContext.close();
		}

		// =====================================================================
		// Case 3: Create the application context using the register() method.
		// This approach is particularly useful when there is a need to
		// programmatically create the application context.
		// =====================================================================
		{
			AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
			applicationContext.register(BeanConfiguration1.class);
			boolean processFlag = new Random().nextBoolean();
			if (processFlag) {
				applicationContext.register(BeanConfiguration2.class);
			} else {
				applicationContext.register(BeanConfiguration3.class);
			}
			applicationContext.refresh();
			System.out.println();

			Utils.listBeans(applicationContext);

			applicationContext.close();
		}

		// =====================================================================
		// Case 4: Create the application context as
		// AnnotationConfigApplicationContext which exposes the scan(...) method
		// to do the component-scanning functionality.
		// =====================================================================
		{
			AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
			applicationContext.scan(
					"com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.annotationconfigapplicationcontext.somepackage");
			applicationContext.refresh();
			System.out.println();

			Utils.listBeans(applicationContext);

			applicationContext.close();
		}
	}

}
