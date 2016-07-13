package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.importannotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.util.Utils;

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		Utils.listBeans(applicationContext);

		applicationContext.close();
	}

}
