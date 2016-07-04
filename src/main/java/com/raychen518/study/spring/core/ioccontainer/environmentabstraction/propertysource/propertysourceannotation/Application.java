package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.propertysource.propertysourceannotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration1.class, BeanConfiguration2.class);

		CommonsUtil.listBeans(applicationContext);

		applicationContext.close();
	}

}
