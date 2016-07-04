package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.configurationannotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		CommonsUtil.listBeans(applicationContext);

		applicationContext.close();
	}

}
