package com.raychen518.study.spring.util;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;

import org.springframework.context.ApplicationContext;

public class Utils {

	private static final String LINE_DELIMITER = "############################################################";
	private static final String LINE_COLUMN_HEADING = "----------------------------------------";

	private static final String SPACE = " ";
	private static final String TAB = "\t";
	private static final String ROUND_BRACKET_LEFT = "(";
	private static final String ROUND_BRACKET_RIGHT = ")";
	private static final String NUMBER = "No.";
	private static final String NAME = "Name";
	private static final String HASH_CODE = "Hash Code";

	private static final String SPRING_FRAMEWORK_BASE_PACKAGE = "org.springframework";

	/**
	 * Print a delimiter line with a blank line before and after this delimiter
	 * line respectively.
	 */
	public static void printDelimiterLine() {
		System.out.println();
		System.out.println(LINE_DELIMITER);
		System.out.println();
	}

	/**
	 * List the beans registered in the specified application context. The beans
	 * of the Spring framework will not be shown.
	 * 
	 * @param applicationContext
	 *            The application context.
	 */
	public static void listBeans(ApplicationContext applicationContext) {
		listBeans(applicationContext, false);
	}

	/**
	 * List the beans registered in the specified application context.
	 * 
	 * @param applicationContext
	 *            The application context.
	 * @param showingSpringBeans
	 *            Whether to show the beans of the Spring framework.
	 */
	public static void listBeans(ApplicationContext applicationContext, boolean showingSpringBeans) {
		System.out.println(NUMBER + TAB + NAME + SPACE + ROUND_BRACKET_LEFT + HASH_CODE + ROUND_BRACKET_RIGHT);
		System.out.println(LINE_COLUMN_HEADING);

		int beanCount = 0;
		String[] beanNames = applicationContext.getBeanDefinitionNames().clone();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			if (showingSpringBeans ? true : !beanName.startsWith(SPRING_FRAMEWORK_BASE_PACKAGE)) {
				System.out.println((++beanCount) + TAB + beanName + SPACE + ROUND_BRACKET_LEFT
						+ Integer.toHexString(applicationContext.getBean(beanName).hashCode()) + ROUND_BRACKET_RIGHT);
			}
		}

		System.out.println();
	}

	/**
	 * List the system properties.
	 */
	public static void listSystemProperties() {
		Properties systemProperties = System.getProperties();
		SortedMap<Object, Object> sortedSystemProperties = new TreeMap<>(systemProperties);

		for (Map.Entry<Object, Object> systemPropertyEntry : sortedSystemProperties.entrySet()) {
			System.out.println(systemPropertyEntry.getKey() + ": " + systemPropertyEntry.getValue());
		}

		System.out.println();
	}

	/**
	 * List the system environment variables.
	 */
	public static void listSystemEnvironmentVariables() {
		Map<String, String> systemEnvironmentVariables = System.getenv();
		SortedMap<String, String> sortedSystemEnvironmentVariables = new TreeMap<>(systemEnvironmentVariables);

		for (Map.Entry<String, String> systemEnvironmentVariableEntry : sortedSystemEnvironmentVariables.entrySet()) {
			System.out.println(
					systemEnvironmentVariableEntry.getKey() + ": " + systemEnvironmentVariableEntry.getValue());
		}

		System.out.println();
	}

}
