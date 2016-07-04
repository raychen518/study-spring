package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.i18n.javabased;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class SomeObject2 implements MessageSourceAware {

	private MessageSource messageSource;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": doSomething...");
		System.out.println(messageSource.getMessage("message.a1", null, null));
	}

}
