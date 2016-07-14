package com.raychen518.study.spring.core.resources.resourceinterface;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import com.raychen518.study.spring.util.Utils;

/**
 * <pre>
 * The Resource (org.springframework.core.io.Resource) interface is a more capable interface
 * for abstracting access to low-level resources.
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
 * 			|------- InputStreamSource
 * 			|
 * 		Resource
 * 
 * =================
 * Class Details
 * =================
 * Resource (org.springframework.core.io.Resource)
 * InputStreamSource (org.springframework.core.io.InputStreamSource)
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Resource (org.springframework.core.io.Resource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Resource is an interface for a resource descriptor that abstracts from the actual type of the underlying resource, such as a file or a class path resource.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * boolean exists();										Return whether this resource actually exists in physical form.
 * boolean isReadable();									Return whether the contents of this resource can be read. 
 * boolean isOpen();										Return whether this resource represents a handle with an open stream. If true, the InputStream cannot be read multiple times, and must be read and closed to avoid resource leaks. 
 * URL getURL() throws IOException;							Return a URL handle for this resource.
 * URI getURI() throws IOException;							Return a URI handle for this resource.
 * File getFile() throws IOException;						Return a File handle for this resource.
 * long contentLength() throws IOException;					Determine the content length for this resource.
 * long lastModified() throws IOException;					Determine the last-modified timestamp for this resource.
 * Resource createRelative(String relativePath) throws IOException;
 * 															Create a resource relative to this resource.
 * String getFilename();									Determine a filename for this resource.
 * String getDescription();									Return a description for this resource, to be used for error output when working with the resource.
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * InputStreamSource (org.springframework.core.io.InputStreamSource)
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * InputStreamSource is an interface for objects that are sources for an InputStream.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * InputStream getInputStream() throws IOException;			Return an InputStream.
 * 
 * </pre>
 */
public class Introduction {

	private void test() {
		// =====================================================================
		// Resource (org.springframework.core.io.Resource)
		// =====================================================================
		{
			Resource resource = null;

			try {
				resource = new UrlResource("https://en.wikipedia.org/wiki/Main_Page");
				System.out.println("resource: " + resource);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

			// ---------------------------------------------
			// boolean exists();
			// ---------------------------------------------
			System.out.println("resource.exists(): " + resource.exists());

			// ---------------------------------------------
			// boolean isReadable();
			// ---------------------------------------------
			System.out.println("resource.isReadable(): " + resource.isReadable());

			// ---------------------------------------------
			// boolean isOpen();
			// ---------------------------------------------
			System.out.println("resource.isOpen(): " + resource.isOpen());

			// ---------------------------------------------
			// URL getURL() throws IOException;
			// ---------------------------------------------
			try {
				System.out.println("resource.getURL(): " + resource.getURL());
			} catch (IOException e) {
				e.printStackTrace();
			}

			// ---------------------------------------------
			// URI getURI() throws IOException;
			// ---------------------------------------------
			try {
				System.out.println("resource.getURI(): " + resource.getURI());
			} catch (IOException e) {
				e.printStackTrace();
			}

			// ---------------------------------------------
			// File getFile() throws IOException;
			// ---------------------------------------------
			try {
				System.out.println("resource.getFile(): " + resource.getFile());
			} catch (IOException e) {
				e.printStackTrace();
			}

			// ---------------------------------------------
			// long contentLength() throws IOException;
			// ---------------------------------------------
			try {
				System.out.println("resource.contentLength(): " + resource.contentLength());
			} catch (IOException e) {
				e.printStackTrace();
			}

			// ---------------------------------------------
			// long lastModified() throws IOException;
			// ---------------------------------------------
			try {
				System.out.println("resource.lastModified(): " + resource.lastModified());
			} catch (IOException e) {
				e.printStackTrace();
			}

			// ---------------------------------------------
			// Resource createRelative(String relativePath) throws IOException;
			// ---------------------------------------------
			try {
				Resource mainResource = new UrlResource("https://en.wikipedia.org/wiki");
				System.out.println("mainResource: " + mainResource);

				Resource relativeResource = mainResource.createRelative("Wikipediaa");
				System.out.println("relativeResource: " + relativeResource);
			} catch (IOException e) {
				e.printStackTrace();
			}

			// ---------------------------------------------
			// String getFilename();
			// ---------------------------------------------
			System.out.println("resource.getFilename(): " + resource.getFilename());

			// ---------------------------------------------
			// String getDescription();
			// ---------------------------------------------
			System.out.println("resource.getDescription(): " + resource.getDescription());
		}

		Utils.printDelimiterLine();

		// =====================================================================
		// InputStreamSource (org.springframework.core.io.InputStreamSource)
		// =====================================================================
		{
			InputStreamSource inputStreamSource = null;

			try {
				inputStreamSource = new UrlResource("https://en.wikipedia.org/wiki/Main_Page");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

			// ---------------------------------------------
			// InputStream getInputStream() throws IOException;
			// ---------------------------------------------
			try {
				System.out.println("inputStreamSource.getInputStream(): " + inputStreamSource.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Introduction().test();
	}

}
