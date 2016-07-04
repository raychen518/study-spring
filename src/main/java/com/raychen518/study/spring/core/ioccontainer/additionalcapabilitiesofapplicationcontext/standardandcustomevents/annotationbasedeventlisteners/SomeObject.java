package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents.annotationbasedeventlisteners;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class SomeObject implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void doSomething1() {
		applicationEventPublisher.publishEvent(new EventA(this));
	}

	public void doSomething2() {
		applicationEventPublisher.publishEvent(new EventB(this));
	}

	public void doSomething3() {
		applicationEventPublisher.publishEvent(new EventC(this));
	}

	public void doSomething41() {
		applicationEventPublisher.publishEvent(new EventD(this, false));
	}

	public void doSomething42() {
		applicationEventPublisher.publishEvent(new EventD(this, true));
	}

	public void doSomething5() {
		applicationEventPublisher.publishEvent(new EventE(this));
	}

	public void doSomething6() {
		applicationEventPublisher.publishEvent(new EventG(this));
	}

}
