package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.javabased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * Using the custom @Profile1 annotation on the @Configuration class.
 * </pre>
 */
@Configuration
@Profile1
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.environmentabstraction.package5")
public class BeanConfiguration5 {
}
