package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizingbeans.case1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessor1 implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(
				getClass().getSimpleName() + ": Do Something before Initializing " + bean.getClass().getSimpleName());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(
				getClass().getSimpleName() + ": Do Something after Initializing " + bean.getClass().getSimpleName());
		return bean;
	}

}
