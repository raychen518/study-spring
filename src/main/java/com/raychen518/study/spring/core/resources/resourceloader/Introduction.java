package com.raychen518.study.spring.core.resources.resourceloader;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

/**
 * <pre>
 * - The ResourceLoader (org.springframework.core.io.ResourceLoader) interface
 *   is meant to be implemented by objects that can return (i.e. load) Resource instances.
 *   It contains the following main method.
 *   -------------------------------------------------------
 *   Resource getResource(String location);
 *   -------------------------------------------------------
 * 
 * - All application contexts implement the ResourceLoader interface,
 *   therefore all application contexts may be used to obtain Resource instances.
 * 
 * - When calling the getResource(...) method of the ResourceLoader interface on a specific application context,
 * 
 *   if the specified resource location doesn't have a specific prefix,
 *   a Resource type appropriate to that specific application context will be returned.
 *   Statement											Type of the Application Context		Type of Returned Resource
 *   -------------------------------------------------------------------------------------------------------------------
 *   applicationContext.getResource("someResource");	ClassPathXmlApplicationContext		ClassPathResource
 *   applicationContext.getResource("someResource");	FileSystemXmlApplicationContext		FileSystemResource
 *   applicationContext.getResource("someResource");	WebApplicationContext				ServletContextResource
 *   ...
 * 
 *   if the specified resource location does have a specific prefix,
 *   a Resource type matching that prefix will be returned, regardless of the type of the application context.
 * 
 * - Strategy for Converting Strings to Resources
 *   Resource Location
 *   Prefix			Resource Location String			Process Explanation
 *   -------------------------------------------------------------------------------------------------------------------
 *   classpath:		classpath:someXml.xml				Load the resource from the classpath.
 *   file:			file:///someText.txt				Load the resource as a URL from the file system.
 *   http:			http://someLocation/somePage.html	Load the resource as a URL from the Internet.
 *   <None>			someResource						Load the resource depending on the underlying ApplicationContext.
 * </pre>
 */
public class Introduction {

	private void test() throws UnsupportedEncodingException {
		// ---------------------------------------------------------------------
		// If the specified resource location doesn't have a specific prefix...
		// ---------------------------------------------------------------------

		// ClassPathXmlApplicationContext
		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext();

			String resourceLocation = "someXml.xml";
			System.out.println("resourceLocation: " + resourceLocation);
			System.out.println();

			Resource resource = applicationContext.getResource(resourceLocation);

			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource instanceof ClassPathResource: " + (resource instanceof ClassPathResource));
			System.out.println();

			try {
				System.out.println("resource.getFile().getAbsolutePath(): " + resource.getFile().getAbsolutePath());
				System.out.println("resource.getURI(): " + resource.getURI());
				System.out.println("resource.getURL(): " + resource.getURL());
			} catch (IOException e) {
				e.printStackTrace();
			}

			applicationContext.close();
		}

		System.out.println();

		// FileSystemXmlApplicationContext
		{
			ConfigurableApplicationContext applicationContext = new FileSystemXmlApplicationContext();

			String resourceLocation = URLDecoder.decode(Introduction.class.getResource("someXml.xml").getPath(),
					StandardCharsets.UTF_8.name());
			System.out.println("resourceLocation: " + resourceLocation);
			System.out.println();

			Resource resource = applicationContext.getResource(resourceLocation);

			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource instanceof FileSystemResource: " + (resource instanceof FileSystemResource));
			System.out.println();

			try {
				System.out.println("resource.getFile().getAbsolutePath(): " + resource.getFile().getAbsolutePath());
				System.out.println("resource.getURI(): " + resource.getURI());
				System.out.println("resource.getURL(): " + resource.getURL());
			} catch (IOException e) {
				e.printStackTrace();
			}

			applicationContext.close();
		}

		System.out.println();

		// ---------------------------------------------------------------------
		// If the specified resource location does have a specific prefix...
		// ---------------------------------------------------------------------

		// ClassPathXmlApplicationContext
		{
			ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext();

			String resourceLocation = "file://" + URLDecoder
					.decode(Introduction.class.getResource("someXml.xml").getPath(), StandardCharsets.UTF_8.name());
			System.out.println("resourceLocation: " + resourceLocation);
			System.out.println();

			Resource resource = applicationContext.getResource(resourceLocation);

			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource instanceof UrlResource: " + (resource instanceof UrlResource));
			System.out.println();

			try {
				System.out.println("resource.getFile().getAbsolutePath(): " + resource.getFile().getAbsolutePath());
				System.out.println("resource.getURI(): " + resource.getURI());
				System.out.println("resource.getURL(): " + resource.getURL());
			} catch (IOException e) {
				e.printStackTrace();
			}

			applicationContext.close();
		}

		System.out.println();

		// FileSystemXmlApplicationContext
		{
			ConfigurableApplicationContext applicationContext = new FileSystemXmlApplicationContext();

			String resourceLocation = "classpath:someXml.xml";
			System.out.println("resourceLocation: " + resourceLocation);
			System.out.println();

			Resource resource = applicationContext.getResource(resourceLocation);

			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource instanceof ClassPathResource: " + (resource instanceof ClassPathResource));
			System.out.println();

			try {
				System.out.println("resource.getFile().getAbsolutePath(): " + resource.getFile().getAbsolutePath());
				System.out.println("resource.getURI(): " + resource.getURI());
				System.out.println("resource.getURL(): " + resource.getURL());
			} catch (IOException e) {
				e.printStackTrace();
			}

			applicationContext.close();
		}
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		new Introduction().test();
	}

}
