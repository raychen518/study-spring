package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents.annotationbasedeventlisteners;

import org.springframework.context.ApplicationEvent;

public abstract class BaseEvent extends ApplicationEvent {

	private static final long serialVersionUID = 4633633086439605073L;

	public BaseEvent(Object source) {
		super(source);
	}

}
