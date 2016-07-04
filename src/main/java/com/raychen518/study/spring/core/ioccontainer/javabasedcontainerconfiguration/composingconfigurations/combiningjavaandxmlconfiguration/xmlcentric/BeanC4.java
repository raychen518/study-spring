package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.composingconfigurations.combiningjavaandxmlconfiguration.xmlcentric;

public class BeanC4 {

	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "BeanC4 (" + Integer.toHexString(hashCode()) + ") [driverClassName = " + driverClassName + ", url = "
				+ url + ", username = " + username + ", password = " + password + "]";
	}

}
