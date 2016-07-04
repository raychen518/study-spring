package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.i18n.xmlbased;

import org.springframework.context.MessageSource;

public class SomeObject1 {

	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": doSomething...");
		System.out.println(messageSource.getMessage("message.a1", null, null));
	}

}
