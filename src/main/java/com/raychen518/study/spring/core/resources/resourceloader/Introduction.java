package com.raychen518.study.spring.core.resources.resourceloader;

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
 *   applicationContext.getResource("someResource");	ClassPathXmlApplicationContext		UrlResource
 *   applicationContext.getResource("someResource");	ClassPathXmlApplicationContext		ClassPathResource
 *   applicationContext.getResource("someResource");	FileSystemXmlApplicationContext		FileSystemResource
 *   applicationContext.getResource("someResource");	WebApplicationContext				ServletContextResource
 *   applicationContext.getResource("someResource");	ClassPathXmlApplicationContext		InputStreamResource
 *   applicationContext.getResource("someResource");	ClassPathXmlApplicationContext		ByteArrayResource
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

	private void test() {
	}

	public static void main(String[] args) {
		new Introduction().test();
	}

}
