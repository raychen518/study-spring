package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents;

import org.springframework.context.ApplicationEvent;

/**
 * <pre>
 * This class shows how to create a custom event.
 * 
 * Steps
 * - Extend the ApplicationEvent class.
 * - Add the constructor with the "source" as the constructor argument.
 * - Invoke the "super" method with the "source" passed in.
 * </pre>
 */
public class SomeEvent extends ApplicationEvent {

	private static final long serialVersionUID = -4565999229498612511L;

	private Integer someInfo1;
	private String someInfo2;
	private Boolean someInfo3;

	public SomeEvent(Object source, Integer someInfo1, String someInfo2, Boolean someInfo3) {
		// =============================
		super(source);
		// =============================
		this.someInfo1 = someInfo1;
		this.someInfo2 = someInfo2;
		this.someInfo3 = someInfo3;
	}

	public Integer getSomeInfo1() {
		return someInfo1;
	}

	public String getSomeInfo2() {
		return someInfo2;
	}

	public Boolean getSomeInfo3() {
		return someInfo3;
	}

}
