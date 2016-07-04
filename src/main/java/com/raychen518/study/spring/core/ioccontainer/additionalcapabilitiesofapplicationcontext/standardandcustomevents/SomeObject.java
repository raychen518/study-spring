package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * This class shows how to publish a custom event.
 * 
 * Steps
 * - Implement the ApplicationEventPublisherAware interface.
 * - New an instance of the custom event.
 * - Invoke the ApplicationEventPublisher.publishEvent() method with that event instance passed in.
 * </pre>
 */
@Component
public class SomeObject implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void doSomething() {
		// ...
		// =====================================================================
		Integer someInfo1 = 123;
		String someInfo2 = "abc";
		Boolean someInfo3 = true;
		SomeEvent someEvent = new SomeEvent(this, someInfo1, someInfo2, someInfo3);
		applicationEventPublisher.publishEvent(someEvent);
		// =====================================================================
		// ...
	}

}
