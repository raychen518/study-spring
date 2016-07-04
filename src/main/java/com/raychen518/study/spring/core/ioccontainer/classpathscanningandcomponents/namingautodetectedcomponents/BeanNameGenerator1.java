package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.namingautodetectedcomponents;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class BeanNameGenerator1 implements BeanNameGenerator {

	public BeanNameGenerator1() {
	}

	@Override
	public String generateBeanName(BeanDefinition beanDefinition, BeanDefinitionRegistry beanDefinitionRegistry) {
		String beanName = "";

		beanName += "the";
		String beanClassName = beanDefinition.getBeanClassName();
		beanName += beanClassName.substring(beanClassName.lastIndexOf(".") + 1);
		beanName += "FromXml";

		return beanName;
	}

}
