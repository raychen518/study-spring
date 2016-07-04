package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizinginstantiationlogic.case1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.containerextensionpoints.customizinginstantiationlogic.xml");
		System.out.println();

		Car car1 = (Car) applicationContext.getBean("car1");
		Car car2 = (Car) applicationContext.getBean("car2");
		Car car3 = (Car) applicationContext.getBean("car3");
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println();

		CarFactoryBean carFactoryBean = (CarFactoryBean) applicationContext.getBean("&car1");
		System.out.println("carFactoryBean: " + carFactoryBean);
		System.out.println("carFactoryBean.isSingleton(): " + carFactoryBean.isSingleton());
		System.out.println();

		applicationContext.close();
	}

}
