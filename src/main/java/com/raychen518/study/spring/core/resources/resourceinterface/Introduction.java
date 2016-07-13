package com.raychen518.study.spring.core.resources.resourceinterface;

/**
 * <pre>
 * The Resource (org.springframework.core.io.Resource) interface is a more capable interface
 * for abstracting access to low-level resources.
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
 * Resource is an interface for a resource descriptor that abstracts from the actual type of the underlying resource, such as a file or a class path resource.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * boolean exists();										Return whether this resource actually exists in physical form.
 * boolean isReadable();									Return whether the contents of this resource can be read. 
 * boolean isOpen();										Return whether this resource represents a handle with an open stream.
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
 * InputStreamSource (org.springframework.core.io.InputStreamSource)
 * InputStreamSource is an interface for objects that are sources for an InputStream.
 * It has main public fields/methods as follows.
 * Fields/Methods											Description
 * ---------------------------------------------------------------------------------------------------------------------
 * InputStream getInputStream() throws IOException;			Return an InputStream.
 * 
 * </pre>
 */
public class Introduction {
}
