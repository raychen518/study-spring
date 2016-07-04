package com.raychen518.study.spring.core.ioccontainer.dependencies.configuration.collections.collectionmerging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SomeBean {

	private Properties someProperties;
	private List<Object> someList;
	private Map<String, Object> someMap;
	private Set<Object> someSet;

	public void doSomething() {
		System.out.println("someProperties: " + someProperties);
		System.out.println("someList: " + someList);
		System.out.println("someMap: " + someMap);
		System.out.println("someSet: " + someSet);
	}

	public void setSomeProperties(Properties someProperties) {
		this.someProperties = someProperties;
	}

	public void setSomeList(List<Object> someList) {
		this.someList = someList;
	}

	public void setSomeMap(Map<String, Object> someMap) {
		this.someMap = someMap;
	}

	public void setSomeSet(Set<Object> someSet) {
		this.someSet = someSet;
	}

	public static void main(String[] args) {
		SomeBean someBean = new SomeBean();

		Properties properties = new Properties();
		properties.setProperty("propertyKeyA", "propertyValueA");
		properties.setProperty("propertyKeyB", "propertyValueB");
		properties.setProperty("propertyKeyC", "propertyValueC");
		someBean.setSomeProperties(properties);

		List<Object> list = new ArrayList<Object>();
		list.add("listValueA");
		list.add("listValueB");
		list.add("listValueC");
		someBean.setSomeList(list);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mapKeyA", "mapValueA");
		map.put("mapKeyB", "mapValueB");
		map.put("mapKeyC", "mapValueC");
		someBean.setSomeMap(map);

		Set<Object> set = new HashSet<Object>();
		set.add("setValueA");
		set.add("setValueB");
		set.add("setValueC");
		someBean.setSomeSet(set);

		someBean.doSomething();
	}

}
