package com.raychen518.study.spring.core.ioccontainer.beanscopes.singleton;

public class BeanA {

	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();

		bean.setBeanB(new BeanB());

		System.out.println(bean.getBeanB());
	}

}
