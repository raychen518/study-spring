package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation.somepackage")
public class BeanConfiguration2 {
}
