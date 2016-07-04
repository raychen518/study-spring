package com.raychen518.study.spring;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SomeTest extends TestCase {

	/**
	 * Create the test case.
	 * 
	 * @param someTestName
	 *            Name of the test case.
	 */
	public SomeTest(String someTestName) {
		super(someTestName);
	}

	/**
	 * @return The suite of tests being tested.
	 */
	public static Test suite() {
		return new TestSuite(SomeTest.class);
	}

	public void testApplication() {
		assertTrue(true);
	}
}
