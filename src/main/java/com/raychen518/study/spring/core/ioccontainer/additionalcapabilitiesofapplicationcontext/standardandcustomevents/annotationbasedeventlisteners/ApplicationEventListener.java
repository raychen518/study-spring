package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents.annotationbasedeventlisteners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * - Besides implementing the ApplicationListener interface,
 *   listening to an event can also be done by registering on any public method of a managed bean via the @EventListener annotation.
 * 
 * - Runtime filtering can be added via the "condition" attribute of the @EventListener annotation 
 *   Value of the "condition" attribute should be a SpEL expression.
 * 
 *   Here is the event SpEL available metadata.
 *   Name				Location				Example				Description
 *   -----------------------------------------------------------------------------------------------
 *   event				root object				#root.event			The actual ApplicationEvent.
 *   args				root object				#root.args[0]		The arguments (as array) used for invoking the target.
 *   <Argument Name>	evaluation context		someFlag			Name of any of the method argument.
 *   											a0					If for some reason the names are not available,
 *   											p1					the argument names are also available under the a<#arg>/p<#arg>
 *   																where #arg stands for the argument index (starting from 0).
 * </pre>
 */
@Component
public class ApplicationEventListener {

	/**
	 * <pre>
	 * Mark the method as a listener for the specified event.
	 * </pre>
	 */
	@EventListener
	public void handleEventA(EventA eventA) {
		System.out.println(getClass().getSimpleName() + ": EventA Triggered:\n" + eventA);
		System.out.println();
	}

	/**
	 * <pre>
	 * Mark the method as a listener for the specified events.
	 * </pre>
	 */
	@EventListener({ EventB.class, EventC.class })
	public void handleEventBAndEventC(BaseEvent event) {
		System.out.println(getClass().getSimpleName() + ": EventB/EventC Triggered:\n" + event);
		System.out.println();
	}

	/**
	 * <pre>
	 * Mark the method as a listener for the specified event and with the specified condition.
	 * Note: The object name in the SpEL expression should be identical to the one in the method arguments.
	 * </pre>
	 */
	@EventListener(condition = "#eventD.someFlag == true")
	public void handleEventD(EventD eventD) {
		System.out.println(getClass().getSimpleName() + ": EventD Triggered:\n" + eventD);
		System.out.println("eventD.isSomeFlag(): " + eventD.isSomeFlag());
		System.out.println();
	}

	/**
	 * <pre>
	 * An event or a list of events can be returned as the method result, to indirectly publish more events after handling current event.
	 * 
	 * For example, the method return can be EventF or List<BaseEvent>.
	 * </pre>
	 */
	@EventListener
	public EventF handleEventE(EventE eventE) {
		System.out.println(getClass().getSimpleName() + ": EventE Triggered:\n" + eventE);
		System.out.println();

		return new EventF(eventE.getSource());
	}

	@EventListener
	public void handleEventF(EventF eventF) {
		System.out.println(getClass().getSimpleName() + ": EventF Triggered:\n" + eventF);
		System.out.println();
	}

	/**
	 * @see the method handleEventE().
	 */
	@EventListener
	public List<BaseEvent> handleEventG(EventG eventG) {
		System.out.println(getClass().getSimpleName() + ": EventG Triggered:\n" + eventG);
		System.out.println();

		List<BaseEvent> events = new ArrayList<>();
		events.add(new EventH(eventG.getSource()));
		events.add(new EventI(eventG.getSource()));

		return events;
	}

	/**
	 * <pre>
	 * The @Order annotation can be used to change the order of invoking the event listeners.
	 * 
	 * TODO Settings of the @Order annotation do not work now, due to unknown reason.
	 * </pre>
	 */
	@EventListener
	@Order(2)
	public void handleEventH(EventH eventH) {
		System.out.println(getClass().getSimpleName() + ": EventH Triggered:\n" + eventH);
		System.out.println();
	}

	@EventListener
	@Order(1)
	public void handleEventI(EventI eventI) {
		System.out.println(getClass().getSimpleName() + ": EventI Triggered:\n" + eventI);
		System.out.println();
	}

}
