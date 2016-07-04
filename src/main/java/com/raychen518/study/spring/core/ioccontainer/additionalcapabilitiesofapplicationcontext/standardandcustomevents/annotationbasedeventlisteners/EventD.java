package com.raychen518.study.spring.core.ioccontainer.additionalcapabilitiesofapplicationcontext.standardandcustomevents.annotationbasedeventlisteners;

public class EventD extends BaseEvent {

	private static final long serialVersionUID = -995606299840446372L;

	private boolean someFlag;

	public EventD(Object source, boolean someFlag) {
		super(source);
		this.someFlag = someFlag;
	}

	public boolean isSomeFlag() {
		return someFlag;
	}

}
