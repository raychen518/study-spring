package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.i18n.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class BeanConfiguration {

	@Bean(name = "messageSource")
	public ResourceBundleMessageSource createMessageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("core_ioccontainer_additionalcapabilitiesofapplicationcontext_i18n_resourceBundleA",
				"core_ioccontainer_additionalcapabilitiesofapplicationcontext_i18n_resourceBundleB",
				"core_ioccontainer_additionalcapabilitiesofapplicationcontext_i18n_resourceBundleC");
		return messageSource;
	}

	@Bean
	public SomeObject1 createSomeObject1() {
		SomeObject1 someObject1 = new SomeObject1();
		someObject1.setMessageSource(createMessageSource());
		return someObject1;
	}

	@Bean
	public SomeObject2 createSomeObject2() {
		SomeObject2 someObject2 = new SomeObject2();
		return someObject2;
	}

}
