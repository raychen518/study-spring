package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizingbeans.case2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessor2 implements BeanPostProcessor, Ordered {

	private int order;

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

	@Override
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
