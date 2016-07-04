package com.raychen518.study.spring.core.ioccontainer.dependencies.methodinjection.lookup;

public class BeanA {

	private BeanB beanB;

	public void doSomething() {
		System.out.println("beanB: " + getBeanBInstance());
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public BeanB getBeanBInstance() {
		return beanB;
	}

	public static void main(String[] args) {
		BeanA beanA = new BeanA();

		beanA.setBeanB(new BeanB());

		beanA.doSomething();
		beanA.doSomething();
		beanA.doSomething();
	}

}
