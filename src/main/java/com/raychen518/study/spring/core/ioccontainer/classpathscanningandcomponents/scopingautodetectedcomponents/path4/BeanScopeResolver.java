package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.scopingautodetectedcomponents.path4;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;

public class BeanScopeResolver implements ScopeMetadataResolver {

	@Override
	public ScopeMetadata resolveScopeMetadata(BeanDefinition beanDefinition) {
		String beanClassName = beanDefinition.getBeanClassName();
		String beanSimpleClassName = beanClassName.substring(beanClassName.lastIndexOf(".") + 1);
		String scopeName;

		switch (beanSimpleClassName) {
		case "BeanD1":
			scopeName = BeanDefinition.SCOPE_SINGLETON;
			break;

		case "BeanD2":
			scopeName = BeanDefinition.SCOPE_PROTOTYPE;
			break;

		default:
			scopeName = BeanDefinition.SCOPE_SINGLETON;
			break;
		}

		ScopeMetadata scopeMetadata = new ScopeMetadata();
		scopeMetadata.setScopeName(scopeName);

		return scopeMetadata;
	}

}
