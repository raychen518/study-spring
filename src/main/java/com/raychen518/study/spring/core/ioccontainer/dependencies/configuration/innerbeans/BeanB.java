package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.innerbeans;

import java.util.Calendar;

public class BeanB {

	private int field1;
	private String field2;

	public BeanB() {
	}

	public BeanB(int field1, String field2) {
		this.field1 = field1;
		this.field2 = field2;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	@Override
	public String toString() {
		return getClass().getName() + "_" + Calendar.getInstance().getTimeInMillis() + "_" + field1 + "_" + field2;
	}

}
