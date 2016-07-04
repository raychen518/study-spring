package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEventListenerForContextStoppedEvent implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("The application context stopped.");
		System.out.println(getClass().getSimpleName() + ": Event Triggered:\n" + event);
		System.out.println();
	}

}
