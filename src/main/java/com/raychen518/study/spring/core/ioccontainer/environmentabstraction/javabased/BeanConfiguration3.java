package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.javabased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("profile3")
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.environmentabstraction.package3")
public class BeanConfiguration3 {
}
