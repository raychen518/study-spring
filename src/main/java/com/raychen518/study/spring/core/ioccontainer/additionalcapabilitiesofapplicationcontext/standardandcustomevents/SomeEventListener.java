package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * This class shows how to listen to a custom event.
 * 
 * Steps
 * - Implement the ApplicationListener interface, the type parameter should be the custom event class.
 * - Process the custom event in the onApplicationEvent method.
 * </pre>
 */
@Component
public class SomeEventListener implements ApplicationListener<SomeEvent> {

	@Override
	public void onApplicationEvent(SomeEvent event) {
		System.out.println(getClass().getSimpleName() + ": SomeEvent Triggered:\n" + event);
		System.out.println("event.getSomeInfo1(): " + event.getSomeInfo1());
		System.out.println("event.getSomeInfo2(): " + event.getSomeInfo2());
		System.out.println("event.getSomeInfo3(): " + event.getSomeInfo3());
		System.out.println();
	}

}
