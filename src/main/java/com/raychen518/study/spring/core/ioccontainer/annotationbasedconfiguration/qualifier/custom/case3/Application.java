package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.custom.case3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println();

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"core.ioccontainer.annotationbasedconfiguration.qualifier.custom.3.xml");
		System.out.println();

		MovieRecommender movieRecommender = (MovieRecommender) applicationContext.getBean("movieRecommender");
		movieRecommender.showRecommendedMovies();
		System.out.println();

		applicationContext.close();
	}

}
