package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * The @ComponentScan annotation scans the @Configuration classes in packages specified using the annotation's "basePackages" attribute.
 * If no packages are not specified, the scanning will occur from the package of the class that declares the @ComponentScan annotation.
 * </pre>
 */
@Configuration
@ComponentScan(basePackages = {
		"com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case2.path1",
		"com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.case2.path2" })
public class BeanConfiguration {

}
