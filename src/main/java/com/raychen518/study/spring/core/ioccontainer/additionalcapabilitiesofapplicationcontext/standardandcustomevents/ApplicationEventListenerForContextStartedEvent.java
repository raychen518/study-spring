package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEventListenerForContextStartedEvent implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("The application context started.");
		System.out.println(getClass().getSimpleName() + ": Event Triggered:\n" + event);
		System.out.println();
	}

}
