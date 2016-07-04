package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents.annotationbasedeventlisteners;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

/**
 * <pre>
 * This application shows how to listen to the application events, by annotation-based event listeners.
 * </pre>
 */
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		CommonsUtil.listBeans(applicationContext);

		SomeObject someObject = applicationContext.getBean(SomeObject.class);

		// Invoking the following method publishes the EventA event.
		someObject.doSomething1();

		// Invoking the following method publishes the EventB event.
		someObject.doSomething2();

		// Invoking the following method publishes the EventC event.
		someObject.doSomething3();

		// Invoking the following method publishes the EventD event (someFlag =
		// false).
		someObject.doSomething41();

		// Invoking the following method publishes the EventD event (someFlag =
		// true).
		someObject.doSomething42();

		// Invoking the following method publishes the EventE event, thus
		// publishes the EventF event as a result of handling the EventE event.
		someObject.doSomething5();

		// Invoking the following method publishes the EventG event, thus
		// publishes the EventH and EventI events as a result of handling the
		// EventG event.
		someObject.doSomething6();

		applicationContext.close();
	}

}
