package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.javabased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <pre>
 * Specify multiple profile names in the @Profile annotation and on the @Configuration class.
 * </pre>
 */
@Configuration
@Profile({ "profile1", "profile3" })
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.environmentabstraction.package4")
public class BeanConfiguration4 {
}
