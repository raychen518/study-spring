package com.raychen518.study.spring.core.resources.builtinresourceimplementations;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.SessionCookieConfig;
import javax.servlet.SessionTrackingMode;
import javax.servlet.descriptor.JspConfigDescriptor;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.context.support.ServletContextResource;

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
 * FileSystemResource is a class representing a file system resource.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * public FileSystemResource(String path) {...}				Create a new FileSystemResource from a file path.
 * public FileSystemResource(File file) {...}				Create a new FileSystemResource from a File handle.
 * public final String getPath() {...}						Return the file path for this resource.
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ServletContextResource (org.springframework.web.context.support.ServletContextResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ServletContextResource is a class representing a servlet context resource.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * public ServletContextResource(ServletContext servletContext, String path) {...}
 * 															Create a new ServletContextResource.
 * public final String getPath() {...}						Return the path for this resource.
 * public final ServletContext getServletContext() {...}	Return the ServletContext for this resource.
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * InputStreamResource (org.springframework.core.io.InputStreamResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * InputStreamResource is a class representing an input stream resource.
 * In contrast to other Resource implementations, this class is a descriptor for an already opened resource.
 * Thus the isOpen() method always returns true for this class,
 * and do not use this class if the resource descriptor will be kept somewhere or the resource will be read multiple times.
 * This Resource implementation should only be used if no other Resource implementation is applicable.
 * Normally, the ByteArrayResource class or other file-based Resource implementations should be used instead.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * public InputStreamResource(InputStream inputStream) {...}
 * 															Create a new InputStreamResource.
 * public InputStreamResource(InputStream inputStream, String description) {...}
 * 															Create a new InputStreamResource.
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ByteArrayResource (org.springframework.core.io.ByteArrayResource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * ByteArrayResource is a class representing a byte array resource.
 * It is useful for loading content from any given byte array, without having to resort to a single-use InputStreamResource.
 * It is particularly useful for creating mail attachments from local content,
 * where JavaMail needs to be able to read the stream multiple times.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * public ByteArrayResource(byte[] byteArray) {...}			Create a new ByteArrayResource.
 * public ByteArrayResource(byte[] byteArray, String description) {...}
 * 															Create a new ByteArrayResource.
 * public final byte[] getByteArray() {...}					Return the underlying byte array.
 * 
 * </pre>
 */
public class Introduction {

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
				Resource resource = new UrlResource("http://en.wikipedia.org/wiki/Main_Page");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

			System.out.println();

			// FTP Resource
			try {
				Resource resource = new UrlResource("ftp://ftp.cuhk.hk/");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

			System.out.println();

			// File Resource
			try {
				Resource resource = new UrlResource("file:///d:/temp/temp.txt");
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
				Resource resource = new UrlResource(new URL("http://en.wikipedia.org/wiki/Main_Page"));
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
				Resource resource = new UrlResource(new URI("http://en.wikipedia.org/wiki/Main_Page"));
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
				Resource resource = new UrlResource("http", "//en.wikipedia.org/wiki/Main_Page");
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
				Resource resource = new UrlResource("http", "//en.wikipedia.org/wiki/Wikipedia", "History");
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
				Resource resource = new ClassPathResource("someXml.xml");
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("someProperties.properties");
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
			{
				Resource resource = new ClassPathResource("someResource", getClass());
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("String.class", Object.class);
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("/java/lang/String.class", Object.class);
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}
		}

		System.out.println();

		// -------------------------------------------------
		// public ClassPathResource(String path, ClassLoader classLoader) {...}
		// -------------------------------------------------
		{
			{
				Resource resource = new ClassPathResource(
						getClass().getPackage().getName().replace('.', '/') + '/' + "someResource",
						getClass().getClassLoader());
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}

			System.out.println();

			{
				Resource resource = new ClassPathResource("java/lang/String.class", getClass().getClassLoader());
				System.out.println("resource: " + resource);
				System.out.println("resource.exists(): " + resource.exists());
			}
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

	/**
	 * Test the class FileSystemResource.
	 */
	private void testFileSystemResource() {
		// -------------------------------------------------
		// public FileSystemResource(String path) {...}
		// public final String getPath() {...}
		// -------------------------------------------------
		{
			FileSystemResource resource = new FileSystemResource("d:\\temp\\temp.txt");
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource.getPath(): " + resource.getPath());
		}

		System.out.println();

		{
			FileSystemResource resource = new FileSystemResource("temp.txt");
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
		}

		System.out.println();

		// -------------------------------------------------
		// public FileSystemResource(File file) {...}
		// -------------------------------------------------
		{
			FileSystemResource resource = new FileSystemResource(new File("d:\\temp\\temp.txt"));
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
		}
	}

	/**
	 * Test the class ServletContextResource.
	 */
	private void testServletContextResource() {
		// -------------------------------------------------
		// public ServletContextResource(ServletContext servletContext, String
		// path) {...}
		// public final String getPath() {...}
		// public final ServletContext getServletContext() {...}
		// -------------------------------------------------
		{
			ServletContextResource resource = new ServletContextResource(mockServletContext(), "someUrlLocation");
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource.getPath(): " + resource.getPath());
			System.out.println("resource.getServletContext(): " + resource.getServletContext());
		}
	}

	/**
	 * Test the class InputStreamResource.
	 */
	private void testInputStreamResource() {
		// -------------------------------------------------
		// public InputStreamResource(InputStream inputStream) {...}
		// -------------------------------------------------
		{
			InputStream inputStream = new ByteArrayInputStream("Hello, World!".getBytes());
			InputStreamResource resource = new InputStreamResource(inputStream);
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource.isOpen(): " + resource.isOpen());
		}

		System.out.println();

		// -------------------------------------------------
		// public InputStreamResource(InputStream inputStream, String
		// description) {...}
		// -------------------------------------------------
		{
			InputStream inputStream = new ByteArrayInputStream("Hello, World!".getBytes());
			InputStreamResource resource = new InputStreamResource(inputStream,
					"The input stream comes from a string literal.");
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource.getDescription(): " + resource.getDescription());
		}
	}

	/**
	 * Test the class ByteArrayResource.
	 */
	private void testByteArrayResource() {
		// -------------------------------------------------
		// public ByteArrayResource(byte[] byteArray) {...}
		// public final byte[] getByteArray() {...}
		// -------------------------------------------------
		{
			ByteArrayResource resource = new ByteArrayResource("Hello, World!".getBytes());
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("Arrays.toString(resource.getByteArray()): " + Arrays.toString(resource.getByteArray()));
		}

		System.out.println();

		// -------------------------------------------------
		// public ByteArrayResource(byte[] byteArray, String description) {...}
		// -------------------------------------------------
		{
			ByteArrayResource resource = new ByteArrayResource("Hello, World!".getBytes(),
					"The byte array comes from a string literal.");
			System.out.println("resource: " + resource);
			System.out.println("resource.exists(): " + resource.exists());
			System.out.println("resource.getDescription(): " + resource.getDescription());
		}
	}

	private static ServletContext mockServletContext() {
		return new ServletContext() {

			@Override
			public String getContextPath() {
				return null;
			}

			@Override
			public ServletContext getContext(String uripath) {
				return null;
			}

			@Override
			public int getMajorVersion() {
				return 0;
			}

			@Override
			public int getMinorVersion() {
				return 0;
			}

			@Override
			public int getEffectiveMajorVersion() {
				return 0;
			}

			@Override
			public int getEffectiveMinorVersion() {
				return 0;
			}

			@Override
			public String getMimeType(String file) {
				return null;
			}

			@Override
			public Set<String> getResourcePaths(String path) {
				return null;
			}

			@Override
			public URL getResource(String path) throws MalformedURLException {
				return new URL(path);
			}

			@Override
			public InputStream getResourceAsStream(String path) {
				return null;
			}

			@Override
			public RequestDispatcher getRequestDispatcher(String path) {
				return null;
			}

			@Override
			public RequestDispatcher getNamedDispatcher(String name) {
				return null;
			}

			@Override
			public Servlet getServlet(String name) throws ServletException {
				return null;
			}

			@Override
			public Enumeration<Servlet> getServlets() {
				return null;
			}

			@Override
			public Enumeration<String> getServletNames() {
				return null;
			}

			@Override
			public void log(String msg) {
			}

			@Override
			public void log(Exception exception, String msg) {
			}

			@Override
			public void log(String message, Throwable throwable) {
			}

			@Override
			public String getRealPath(String path) {
				return null;
			}

			@Override
			public String getServerInfo() {
				return null;
			}

			@Override
			public String getInitParameter(String name) {
				return null;
			}

			@Override
			public Enumeration<String> getInitParameterNames() {
				return null;
			}

			@Override
			public boolean setInitParameter(String name, String value) {
				return false;
			}

			@Override
			public Object getAttribute(String name) {
				return null;
			}

			@Override
			public Enumeration<String> getAttributeNames() {
				return null;
			}

			@Override
			public void setAttribute(String name, Object object) {
			}

			@Override
			public void removeAttribute(String name) {
			}

			@Override
			public String getServletContextName() {
				return null;
			}

			@Override
			public Dynamic addServlet(String servletName, String className) {
				return null;
			}

			@Override
			public Dynamic addServlet(String servletName, Servlet servlet) {
				return null;
			}

			@Override
			public Dynamic addServlet(String servletName, Class<? extends Servlet> servletClass) {
				return null;
			}

			@Override
			public <T extends Servlet> T createServlet(Class<T> clazz) throws ServletException {
				return null;
			}

			@Override
			public ServletRegistration getServletRegistration(String servletName) {
				return null;
			}

			@Override
			public Map<String, ? extends ServletRegistration> getServletRegistrations() {
				return null;
			}

			@Override
			public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, String className) {
				return null;
			}

			@Override
			public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, Filter filter) {
				return null;
			}

			@Override
			public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName,
					Class<? extends Filter> filterClass) {
				return null;
			}

			@Override
			public <T extends Filter> T createFilter(Class<T> clazz) throws ServletException {
				return null;
			}

			@Override
			public FilterRegistration getFilterRegistration(String filterName) {
				return null;
			}

			@Override
			public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
				return null;
			}

			@Override
			public SessionCookieConfig getSessionCookieConfig() {
				return null;
			}

			@Override
			public void setSessionTrackingModes(Set<SessionTrackingMode> sessionTrackingModes) {
			}

			@Override
			public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
				return null;
			}

			@Override
			public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
				return null;
			}

			@Override
			public void addListener(String className) {
			}

			@Override
			public <T extends EventListener> void addListener(T t) {
			}

			@Override
			public void addListener(Class<? extends EventListener> listenerClass) {
			}

			@Override
			public <T extends EventListener> T createListener(Class<T> clazz) throws ServletException {
				return null;
			}

			@Override
			public JspConfigDescriptor getJspConfigDescriptor() {
				return null;
			}

			@Override
			public ClassLoader getClassLoader() {
				return null;
			}

			@Override
			public void declareRoles(String... roleNames) {
			}

		};
	}

	public static void main(String[] args) {
		new Introduction().test();
	}

}
