package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.fields.case1;

public class BeanA {

	private BeanB beanB;

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("beanB: " + beanB);

		if (beanB != null) {
			beanB.doSomething();
		}
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
