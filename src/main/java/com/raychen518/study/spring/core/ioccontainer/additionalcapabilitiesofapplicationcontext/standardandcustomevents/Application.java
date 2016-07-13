package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.util.Utils;

/**
 * <pre>
 * This application shows how to handle the application events, by Java based configuration.
 * 
 * - Event handling in the ApplicationContext is provided through the ApplicationEvent class and ApplicationListener interface.
 *   If a bean that implements the ApplicationListener interface is deployed into the application context,
 *   every time an ApplicationEvent gets published to the ApplicationContext, that bean is notified.
 * 
 * - Standard Events
 *   Event							Description
 *   -------------------------------------------------------------------------------------------------------------------
 *   ContextRefreshedEvent			This event is published when the ApplicationContext object is initialized or refreshed.
 *   								For example, using the refresh() method on the ConfigurableApplicationContext interface will publish this event.
 *   								"Initialized" here means that all beans are loaded, post-processor beans are detected and activated, singletons are pre-instantiated, and the ApplicationContext object is ready for use.
 *   								The ApplicationContext object can be refreshed multiple times, if the ApplicationContext object has not been closed and the ApplicationContext object supports such "hot" refreshes.
 *   								For example, XmlWebApplicationContext supports hot refreshes, but GenericApplicationContext does not.
 * 
 *   ContextStartedEvent			This event is published when the ApplicationContext object is started,
 *   								using the start() method on the ConfigurableApplicationContext interface.
 *   								"Started" here means that all Lifecycle beans receive an explicit start signal.
 *   								Typically this signal is used to restart beans after an explicit stop, but it may also be used to start components that have not been configured for auto-start,
 *   								for example, components that have not already started on initialization.
 * 
 *   ContextStoppedEvent			This event is published when the ApplicationContext object is stopped,
 *   								using the stop() method on the ConfigurableApplicationContext interface.
 *   								"Stopped" here means that all Lifecycle beans receive an explicit stop signal.
 *   								A stopped application context may be restarted through a start() call.
 * 
 *   ContextClosedEvent				This event is published when the ApplicationContext object is closed,
 *   								using the close() method on the ConfigurableApplicationContext interface.
 *   								"Closed" here means that all singleton beans are destroyed.
 *   								A closed application context reaches its end of life; it cannot be refreshed or restarted.
 * 
 *   RequestHandledEvent			This event is published after the HTTP request is complete.
 *   								This event is a web-specific event telling all beans that an HTTP request has been serviced.
 *   								This event is only applicable to web applications using Spring's DispatcherServlet.
 * 
 * - Custom Events
 *   - Create a Custom Event
 *     <See the SomeEvent class>
 * 
 *   - Publish a Custom Event
 *     <See the SomeObject class>
 *     
 *   - Listen to a Custom Event
 *     <See the SomeEventListener class>
 * </pre>
 */
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		Utils.listBeans(applicationContext);

		SomeObject someObject = applicationContext.getBean(SomeObject.class);
		// Invoking the following method publishes the SomeEvent event.
		someObject.doSomething();

		// =================================================
		// Note: The following statement cannot be executed because the
		// ConfigurableApplicationContext (GenericApplicationContext) does not
		// support multiple refresh attempts.
		// =================================================
		// Refresh the application context to trigger the event
		// ContextRefreshedEvent.
		// applicationContext.refresh();

		// Stop the application context to trigger the event
		// ContextStoppedEvent.
		applicationContext.stop();

		// Start the application context to trigger the event
		// ContextStartedEvent.
		applicationContext.start();

		// Close the application context to trigger the event
		// ContextClosedEvent.
		applicationContext.close();
	}

}
