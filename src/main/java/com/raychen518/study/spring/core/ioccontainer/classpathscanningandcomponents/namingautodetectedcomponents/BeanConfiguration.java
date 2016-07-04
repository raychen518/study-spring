package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.namingautodetectedcomponents;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.namingautodetectedcomponents.path3", nameGenerator = BeanNameGenerator2.class)
public class BeanConfiguration {
}
