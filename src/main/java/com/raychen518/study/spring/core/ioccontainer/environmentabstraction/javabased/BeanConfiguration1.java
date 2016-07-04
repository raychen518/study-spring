package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.javabased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <pre>
 * Specify one profile name in the @Profile annotation and on the @Configuration class.
 * </pre>
 */
@Configuration
@Profile("profile1")
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.environmentabstraction.package1")
public class BeanConfiguration1 {
}
