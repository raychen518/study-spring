package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = "com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.definingbeanmetadataincomponents.somepath", excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = Repository.class) })
public class BeanConfiguration {

	@Bean
	public CommonBean generateBeanB3() {
		return new BeanB3();
	}

}
