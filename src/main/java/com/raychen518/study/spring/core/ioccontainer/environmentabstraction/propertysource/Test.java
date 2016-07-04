package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.propertysource;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

import com.raychen518.study.spring.core.ioccontainer._util.CommonsUtil;

/**
 * <pre>
 * This class does some testing about the property source abstraction.
 * 
 * - The Environment class provides search operations over property sources.
 * 
 * - A PropertySource class is an abstraction over any source of key-value pairs.
 * 
 * - A StandardEnvironment object contains 2 PropertySource objects,
 *   one is the set of the system properties (AKA: JVM system properties, can be retrieved by the System.getProperties() method),
 *   the other is the set of the system environment variables (can be retrieved by the System.getenv() method).
 *   Note: When searching, the system properties have precedence over the system environment variables.
 *         That is to say, if there are 2 items with the same name respectively in the system properties and the system environment variables,
 *         the one in the system properties will be returned as the search result.
 * 
 * - Invoking the containsProperty(String) method on an Environment object
 *   returns whether the specified item exists in the system properties or the system environment variables.
 * </pre>
 */
public class Test {

	private static final String PROPERTY_1_KEY = "property.1";
	private static final String PROPERTY_1_VALUE = "a1";
	private static final String PROPERTY_2_KEY = "PROPERTY_2";
	private static final String PROPERTY_2_VALUE = "b2";
	private static final String PROPERTY_SOURCE_CUSTOM_PROPERTIES_NAME = "customProperties";

	private static void listPropertySources(MutablePropertySources propertySources) {
		if (propertySources != null) {
			System.out.println("propertySources.size(): " + propertySources.size());
			System.out.println();

			for (Iterator<PropertySource<?>> iterator = propertySources.iterator(); iterator.hasNext();) {
				PropertySource<?> propertySource = iterator.next();
				System.out.println("propertySource: " + propertySource);
				System.out.println("propertySource.getName(): " + propertySource.getName());
				System.out.println("propertySource.getSource(): " + propertySource.getSource());
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new GenericApplicationContext();
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		MutablePropertySources propertySources = environment.getPropertySources();

		listPropertySources(propertySources);

		CommonsUtil.printDelimiterLine();

		System.out.println(
				"environment.containsProperty(PROPERTY_1_KEY): " + environment.containsProperty(PROPERTY_1_KEY));
		// Add a system property.
		// ---------------------------------------------------------------------
		System.setProperty(PROPERTY_1_KEY, PROPERTY_1_VALUE);
		// ---------------------------------------------------------------------
		System.out.println(
				"environment.containsProperty(PROPERTY_1_KEY): " + environment.containsProperty(PROPERTY_1_KEY));
		System.out.println();

		System.out.println(
				"environment.containsProperty(PROPERTY_2_KEY): " + environment.containsProperty(PROPERTY_2_KEY));
		// Add a custom property source.
		// ---------------------------------------------------------------------
		Properties customProperties = new Properties();
		customProperties.put(PROPERTY_2_KEY, PROPERTY_2_VALUE);
		PropertySource<Map<String, Object>> customPropertySource = new PropertiesPropertySource(
				PROPERTY_SOURCE_CUSTOM_PROPERTIES_NAME, customProperties);
		propertySources.addFirst(customPropertySource);
		// ---------------------------------------------------------------------
		System.out.println(
				"environment.containsProperty(PROPERTY_2_KEY): " + environment.containsProperty(PROPERTY_2_KEY));
		System.out.println();

		listPropertySources(propertySources);

		CommonsUtil.printDelimiterLine();

		CommonsUtil.listSystemProperties();

		CommonsUtil.printDelimiterLine();

		CommonsUtil.listSystemEnvironmentVariables();

		applicationContext.close();
	}

}
