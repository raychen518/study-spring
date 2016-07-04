package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.fields.case2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ResourceLoader;

/**
 * <pre>
 * Use of the @Autowired annotation on fields does not need the <property> elements in the configuration and the setter methods in the class.
 * Note: The @Autowired annotation also resolves well-known resolvable dependencies: BeanFactory, ApplicationContext, ResourceLoader, ApplicationEventPublisher, and MessageSource.
 * </pre>
 */
public class BeanA {

	@Autowired
	private BeanB beanB;

	@Autowired
	private BeanFactory beanFactory;

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private ResourceLoader resourceLoader;

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	@Autowired
	private MessageSource messageSource;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println();

		System.out.println("beanB: " + beanB);
		if (beanB != null) {
			beanB.doSomething();
		}
		System.out.println();

		System.out.println("beanFactory\t\t\t: " + beanFactory);
		System.out.println("applicationContext\t\t: " + applicationContext);
		System.out.println("resourceLoader\t\t\t: " + resourceLoader);
		System.out.println("applicationEventPublisher\t: " + applicationEventPublisher);
		System.out.println("messageSource\t\t\t: " + messageSource);
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
