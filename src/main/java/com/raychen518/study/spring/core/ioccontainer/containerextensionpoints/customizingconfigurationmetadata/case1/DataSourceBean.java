package com.raychen518.study.spring.core.ioccontainer.containerextensionpoints.customizingconfigurationmetadata.case1;

public class DataSourceBean {
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public void doSomething() {
		System.out.println(getClass().getSimpleName() + ": driverClassName: " + driverClassName);
		System.out.println(getClass().getSimpleName() + ": url: " + url);
		System.out.println(getClass().getSimpleName() + ": username: " + username);
		System.out.println(getClass().getSimpleName() + ": password: " + password);
	}

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

}
