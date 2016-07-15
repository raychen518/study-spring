package com.raychen518.study.spring.core.resources.builtinresourceimplementations;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import com.raychen518.study.spring.util.Utils;

/**
 * <pre>
 * There are a number of Resource (org.springframework.core.io.Resource) implementations in Spring.
 * 
 * ++++++++++++
 * Contents
 * ++++++++++++
 * Hierarchy Graph
 * Class Details
 * 
 * =================
 * Hierarchy Graph
 * =================
 * 
 * 												Resource
 * 													|
 * 			|-----------|---------------|-----------|-----------|---------------|-----------|
 * 			|			|				|						|				|			|
 * 		UrlResource		|		ClassPathResource		FileSystemResource		|		ServletContextResource
 * 						|														|
 * 				InputStreamResource										ByteArrayResource
 * 
 * =================
 * Class Details
 * =================
 * UrlResource (org.springframework.core.io.UrlResource)
 * ClassPathResource (org.springframework.core.io.ClassPathResource)
 * FileSystemResource (org.springframework.core.io.FileSystemResource)
 * ServletContextResource (org.springframework.web.context.support.ServletContextResource)
 * InputStreamResource (org.springframework.core.io.InputStreamResource)
 * ByteArrayResource (org.springframework.core.io.ByteArrayResource)
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * UrlResource (org.springframework.core.io.UrlResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * UrlResource is a class representing a URL resource.
 * It may be used to access any object that is normally accessible via a URL, such as HTTP targets, FTP targets and files, which are indicated by the URL prefixes http:, ftp: and file:.
 * It wraps the java.net.URL class.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * public UrlResource(String path) throws MalformedURLException {...}
 * 															Create a new UrlResource based on a URL path.
 * public UrlResource(URL url) {...}						Create a new UrlResource based on the given URL object.
 * public UrlResource(URI uri) throws MalformedURLException {...}
 * 															Create a new UrlResource based on the given URI object.
 * public UrlResource(String protocol, String location) throws MalformedURLException {...}
 * 															Create a new UrlResource based on a URI specification.
 * public UrlResource(String protocol, String location, String fragment) throws MalformedURLException {...}
 * 															Create a new UrlResource based on a URI specification.
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ClassPathResource (org.springframework.core.io.ClassPathResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ClassPathResource is a class representing a class path resource.
 * It is used to access any object that is normally accessible via a class path, which is indicated by the class path prefix classpath:.
 * It supports resolution as java.io.File if the class path resource resides in the file system,
 * but not for class path resources which reside in a JAR and have not been expanded to the file system.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * public ClassPathResource(String path) {...}				Create a new ClassPathResource for ClassLoader usage.
 * public ClassPathResource(String path, Class<?> clazz) {...}
 * 															Create a new ClassPathResource for Class usage.
 * public ClassPathResource(String path, ClassLoader classLoader) {...}
 * 															Create a new ClassPathResource for ClassLoader usage.
 * public final ClassLoader getClassLoader() {...}			Return the ClassLoader that this resource will be obtained from.
 * public final String getPath() {...}						Return the path for this resource (as resource path within the class path).
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * FileSystemResource (org.springframework.core.io.FileSystemResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * XXX.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * XXX														XXX
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ServletContextResource (org.springframework.web.context.support.ServletContextResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * XXX.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * XXX														XXX
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * InputStreamResource (org.springframework.core.io.InputStreamResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * XXX.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * XXX														XXX
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ByteArrayResource (org.springframework.core.io.ByteArrayResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * XXX.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * XXX														XXX
 * 
 * 
 * </pre>
 */
public class Introduction {

	private static final String URL_RESOURCE_URL_PATH_HTTP = "http://en.wikipedia.org/wiki/Main_Page";
	private static final String URL_RESOURCE_URL_PATH_FTP = "ftp://ftp.cuhk.hk/";
	private static final String URL_RESOURCE_URL_PATH_FILE = "file:///d:/temp/temp.txt";
	private static final String URL_RESOURCE_URL_PROTOCOL_HTTP = "http";
	private static final String URL_RESOURCE_URL_LOCATION_1 = "//en.wikipedia.org/wiki/Main_Page";
	private static final String URL_RESOURCE_URL_LOCATION_2 = "//en.wikipedia.org/wiki/Wikipedia";
	private static final String URL_RESOURCE_URL_FRAGMENT = "History";

	private void test() {
		testUrlResource();

		Utils.printDelimiterLine();

		testClassPathResource();

		Utils.printDelimiterLine();

		testFileSystemResource();

		Utils.printDelimiterLine();

		testServletContextResource();

		Utils.printDelimiterLine();

		testInputStreamResource();

		Utils.printDelimiterLine();

		testByteArrayResource();
	}

	/**
	 * Test the class UrlResource.
	 */
	private void testUrlResource() {
		// -------------------------------------------------
		// public UrlResource(String path) throws MalformedURLException {...}
		// -------------------------------------------------
		{
			// HTTP Resource
			try {
				Resource resource = new UrlResource(URL_RESOURCE_URL_PATH_HTTP);
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

			System.out.println();

			// FTP Resource
			try {
				Resource resource = new UrlResource(URL_RESOURCE_URL_PATH_FTP);
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

			System.out.println();

			// File Resource
			try {
				Resource resource = new UrlResource(URL_RESOURCE_URL_PATH_FILE);
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		System.out.println();

		// -------------------------------------------------
		// public UrlResource(URL url) {...}
		// -------------------------------------------------
		{
			try {
				Resource resource = new UrlResource(new URL(URL_RESOURCE_URL_PATH_HTTP));
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		System.out.println();

		// -------------------------------------------------
		// public UrlResource(URI uri) throws MalformedURLException {...}
		// -------------------------------------------------
		{
			try {
				Resource resource = new UrlResource(new URI(URL_RESOURCE_URL_PATH_HTTP));
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException | URISyntaxException e) {
				e.printStackTrace();
			}
		}

		System.out.println();

		// -------------------------------------------------
		// public UrlResource(String protocol, String location) throws
		// MalformedURLException {...}
		// -------------------------------------------------
		{
			try {
				Resource resource = new UrlResource(URL_RESOURCE_URL_PROTOCOL_HTTP, URL_RESOURCE_URL_LOCATION_1);
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		System.out.println();

		// -------------------------------------------------
		// public UrlResource(String protocol, String location, String fragment)
		// throws MalformedURLException {...}
		// -------------------------------------------------
		{
			try {
				Resource resource = new UrlResource(URL_RESOURCE_URL_PROTOCOL_HTTP, URL_RESOURCE_URL_LOCATION_2,
						URL_RESOURCE_URL_FRAGMENT);
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Test the class ClassPathResource.
	 */
	private void testClassPathResource() {
		// -------------------------------------------------
		// public ClassPathResource(String path) {...}
		// -------------------------------------------------
		{
			{
				Resource resource = new ClassPathResource("someFile");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("someDir/");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("someText.txt");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("someFile.properties");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("someFile.xml");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("classpath:/dirA/dirB/dirC/someFile.xml");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("java/lang/Object.class");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}
		}

		System.out.println();

		// -------------------------------------------------
		// public ClassPathResource(String path, Class<?> clazz) {...}
		// -------------------------------------------------
		{
			Resource resource1 = new ClassPathResource("String.class", Object.class);
			System.out.println("resource1: " + resource1);
			System.out.println("resource1.exists(): " + resource1.exists());

			System.out.println();

			Resource resource2 = new ClassPathResource("/java/lang/String.class", Object.class);
			System.out.println("resource2: " + resource2);
			System.out.println("resource2.exists(): " + resource2.exists());

			System.out.println();

			// Get some resource from the location where current class is.
			Resource resource3 = new ClassPathResource("someFile.properties", getClass());
			System.out.println("resource3: " + resource3);
			System.out.println("resource3.exists(): " + resource3.exists());
		}

		System.out.println();

		// -------------------------------------------------
		// public ClassPathResource(String path, ClassLoader classLoader) {...}
		// -------------------------------------------------
		{
			Resource resource1 = new ClassPathResource("java/lang/String.class", getClass().getClassLoader());
			System.out.println("resource1: " + resource1);
			System.out.println("resource1.exists(): " + resource1.exists());

			System.out.println();

			Resource resource2 = new ClassPathResource("someFile.properties", getClass().getClassLoader());
			System.out.println("resource2: " + resource2);
			System.out.println("resource2.exists(): " + resource2.exists());
		}

		System.out.println();

		// -------------------------------------------------
		// public final ClassLoader getClassLoader() {...}
		// -------------------------------------------------
		{
			ClassPathResource resource = new ClassPathResource("java/lang/Object.class");
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource.getClassLoader(): " + resource.getClassLoader());
		}

		System.out.println();

		// -------------------------------------------------
		// public final String getPath() {...}
		// -------------------------------------------------
		{
			ClassPathResource resource = new ClassPathResource("java/lang/Object.class");
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource.getPath(): " + resource.getPath());
		}
	}

	private void testFileSystemResource() {
		// =====================================================================
		// FileSystemResource (org.springframework.core.io.FileSystemResource)
		// =====================================================================
		{

		}
	}

	private void testServletContextResource() {
		// =====================================================================
		// ServletContextResource
		// (org.springframework.web.context.support.ServletContextResource)
		// =====================================================================
		{

		}
	}

	private void testInputStreamResource() {
		// =====================================================================
		// InputStreamResource (org.springframework.core.io.InputStreamResource)
		// =====================================================================
		{

		}
	}

	private void testByteArrayResource() {
		// =====================================================================
		// ByteArrayResource (org.springframework.core.io.ByteArrayResource)
		// =====================================================================
		{

		}
	}

	public static void main(String[] args) {
		new Introduction().test();
	}

}
