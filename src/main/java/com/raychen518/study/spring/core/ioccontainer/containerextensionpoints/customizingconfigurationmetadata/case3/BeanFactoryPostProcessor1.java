package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizingconfigurationmetadata.case3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessor1 implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(getClass().getSimpleName() + ": Do Something after the Container's Standard Initialization");
		System.out.println("beanFactory: " + beanFactory);
		System.out.println("beanFactory.getBeanDefinitionCount(): " + beanFactory.getBeanDefinitionCount());
		System.out.println("beanFactory.getBeanPostProcessorCount(): " + beanFactory.getBeanPostProcessorCount());
		System.out.println("beanFactory.getSingletonCount(): " + beanFactory.getSingletonCount());
		System.out.println("beanFactory.containsBean(\"someBean1\"): " + beanFactory.containsBean("someBean1"));
		System.out.println("beanFactory.containsBean(\"someBean3\"): " + beanFactory.containsBean("someBean3"));
		System.out.println("beanFactory.getBean(\"someBean1\"): " + beanFactory.getBean("someBean1"));
		System.out.println("beanFactory.isFactoryBean(\"someBean1\"): " + beanFactory.isFactoryBean("someBean1"));
		System.out.println("beanFactory.isPrototype(\"someBean1\"): " + beanFactory.isPrototype("someBean1"));
	}

}
