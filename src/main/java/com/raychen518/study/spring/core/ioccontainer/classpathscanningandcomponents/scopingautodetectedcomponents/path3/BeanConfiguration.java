package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.scopingautodetectedcomponents.path3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(scopeResolver = BeanScopeResolver.class)
public class BeanConfiguration {
}
