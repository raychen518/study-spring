package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ResourceLoader;

/**
 * <pre>
 * Use of the @Resource annotation on fields or setter methods also injects dependencies like the @Autowired annotation.
 * 
 * - The @Resource annotation is a JSR-250 annotation instead of a Spring annotation like the @Autowired annotation.
 * - The "name" attribute of the @Resource annotation can be used to qualify the dependencies to inject.
 * - Like the @Autowired annotation, the @Resource annotation resolves well-known resolvable dependencies: BeanFactory, ApplicationContext, ResourceLoader, ApplicationEventPublisher, and MessageSource.
 * </pre>
 */
public class BeanA {

	@Resource
	private BeanB beanB;

	private BeanC beanC;

	@Resource
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

	@Resource(name = "primaryBeanD")
	private BeanD beanD;

	@Resource
	private BeanFactory beanFactory;

	@Resource
	private ApplicationContext applicationContext;

	@Resource
	private ResourceLoader resourceLoader;

	@Resource
	private ApplicationEventPublisher applicationEventPublisher;

	@Resource
	private MessageSource messageSource;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println();

		System.out.println("beanB: " + beanB);
		System.out.println("beanC: " + beanC);
		System.out.println("beanD: " + beanD);
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
