package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.javabased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * Using the custom @Profile1And3 annotation on the @Configuration class.
 * </pre>
 */
@Configuration
@Profile1And3
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.environmentabstraction.package6")
public class BeanConfiguration6 {
}
