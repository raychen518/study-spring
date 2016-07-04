package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.i18n.javabased;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

/**
 * <pre>
 * This application shows how to utilize the i18n feature by the MessageSource object in Spring, by Java based configuration.
 * </pre>
 * 
 * @see com.raychen518.study.spring.core.ioccontainer.
 *      additionalcapabilitiesofapplicationcontext.i18n.xmlbased.Application
 */
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		CommonsUtil.listBeans(applicationContext);

		System.out.println(applicationContext.getMessage("message.a1", null, null));
		System.out.println(applicationContext.getMessage("message.a2", null, null));
		System.out.println(
				applicationContext.getMessage("message.a3", new Object[] { 123, "abc", true, new Date() }, null));
		System.out
				.println(applicationContext.getMessage("message.a4", null, "This is the message A4. (Default)", null));
		System.out.println();

		System.out.println(applicationContext.getMessage("message.b1", null, null));
		System.out.println(applicationContext.getMessage("message.b2", null, null));
		System.out.println(
				applicationContext.getMessage("message.b3", new Object[] { 123, "abc", true, new Date() }, null));
		System.out.println();

		System.out.println(applicationContext.getMessage("message.c1", null, null));
		System.out.println(applicationContext.getMessage("message.c2", null, null));
		System.out.println(
				applicationContext.getMessage("message.c3", new Object[] { 123, "abc", true, new Date() }, null));
		System.out.println();

		// Provide a locale to utilize the i18n feature.
		System.out.println(applicationContext.getMessage("message.a1", null, Locale.SIMPLIFIED_CHINESE));
		System.out.println(applicationContext.getMessage("message.a2", null, Locale.SIMPLIFIED_CHINESE));
		System.out.println(applicationContext.getMessage("message.a3", new Object[] { 123, "abc", true, new Date() },
				Locale.SIMPLIFIED_CHINESE));
		System.out.println(applicationContext.getMessage("message.a1", null, Locale.CHINA));
		System.out.println(applicationContext.getMessage("message.a1", null, Locale.CHINESE));
		System.out.println();

		// If there are messages with the same name, the first message met is
		// returned.
		// In this case, the resource bundles B and C both contain a message
		// named "message.common". Because the resource bundle B is loaded
		// before the resource bundle C, the message in the resource bundle B is
		// returned.
		System.out.println(applicationContext.getMessage("message.common", null, null));
		System.out.println();

		// Get a bean into which the MessageSource bean is injected in the Java
		// configuration, and then use that MessageSource bean to get messages
		// in some method of that bean.
		SomeObject1 someObject1 = applicationContext.getBean(SomeObject1.class);
		someObject1.doSomething();
		System.out.println();

		// Get a bean into which the MessageSource bean is injected by the
		// MessageSourceAware interface, and then use that MessageSource bean to
		// get messages in some method of that bean.
		SomeObject2 someObject2 = applicationContext.getBean(SomeObject2.class);
		someObject2.doSomething();
		System.out.println();

		applicationContext.close();

		// Since the ApplicationContext interface implements the MessageSource
		// interface, the instantiated ApplicationContext instance can also be
		// defined as a MessageSource object for late use.
		@SuppressWarnings("resource")
		MessageSource messageSource = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		System.out.println(messageSource.getMessage("message.a1", null, null));
	}

}
