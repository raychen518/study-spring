package com.raychen518.study.spring.core.ioccontainer.dependencies.methodinjection.replacement;

public class BeanA {

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": doSomething()");
	}

	public String doSomethingSpecial(int someValue1) {
		System.out.println(getClass().getSimpleName() + ": doSomethingSpecial(int)");
		return String.valueOf(someValue1);
	}

	public String doSomethingSpecial(int someValue1, String someValue2) {
		System.out.println(getClass().getSimpleName() + ": doSomethingSpecial(int, String)");
		return (someValue1 + "|" + someValue2);
	}

	public String doSomethingSpecial(int someValue1, String someValue2, boolean someValue3) {
		System.out.println(getClass().getSimpleName() + ": doSomethingSpecial(int, String, boolean)");
		return (someValue1 + "|" + someValue2 + "|" + someValue3);
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();

		bean.doSomething();
		System.out.println();

		System.out.println("bean.doSomethingSpecial(123): " + bean.doSomethingSpecial(123));
		System.out.println();

		System.out.println("bean.doSomethingSpecial(123, \"abc\"): " + bean.doSomethingSpecial(123, "abc"));
		System.out.println();

		System.out.println("bean.doSomethingSpecial(123, \"abc\", true): " + bean.doSomethingSpecial(123, "abc", true));
		System.out.println();
	}

}
