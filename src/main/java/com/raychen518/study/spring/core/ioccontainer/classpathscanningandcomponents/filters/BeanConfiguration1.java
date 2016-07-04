package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.filters.path2", includeFilters = {
		@Filter(type = FilterType.REGEX, pattern = ".*Abc"),
		@Filter(type = FilterType.REGEX, pattern = ".*Ghi") }, excludeFilters = @Filter(SpecialComponent.class) )
public class BeanConfiguration1 {
}
