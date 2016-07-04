package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.xmlcentric;

public class BeanC3 {

	private int intValue;
	private String stringValue;
	private boolean booleanValue;
	private BeanC1 beanC1Value;

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public void setBooleanValue(boolean booleanValue) {
		this.booleanValue = booleanValue;
	}

	public void setBeanC1Value(BeanC1 beanC1Value) {
		this.beanC1Value = beanC1Value;
	}

	@Override
	public String toString() {
		return "BeanC3 (" + Integer.toHexString(hashCode()) + ") [intValue=" + intValue + ", stringValue=" + stringValue
				+ ", booleanValue=" + booleanValue + ", beanC1Value=" + beanC1Value + "]";
	}

}
