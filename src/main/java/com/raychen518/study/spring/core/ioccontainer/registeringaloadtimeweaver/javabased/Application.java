package com.raychen518.study.spring.core.ioccontainer.registeringaloadtimeweaver.javabased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

/**
 * <pre>
 * This application shows how to register a LoadTimeWeaver object, by Java based configuration.
 * </pre>
 * 
 * @See {@link com.raychen518.study.spring.core.ioccontainer.registeringaloadtimeweaver.xmlbased.Application}
 */
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);

		CommonsUtil.listBeans(applicationContext);

		SomeBean someBean = applicationContext.getBean(SomeBean.class);
		System.out.println("someBean: " + someBean);
		System.out.println("someBean.getLoadTimeWeaver(): " + someBean.getLoadTimeWeaver());
		System.out.println();

		applicationContext.close();
	}

}
