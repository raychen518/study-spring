package com.raychen518.study.spring.core.ioccontainer.usingjsr330standardannotations;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * - To use JSR-330 standard annotations, the javax.inject package should be imported.
 *   If Maven is used, the following statements can be used in the pom.xml.
 *       <dependency>
 *           <groupId>javax.inject</groupId>
 *           <artifactId>javax.inject</artifactId>
 *           <version>1</version>
 *       </dependency>
 * - Like the @Autowired annotation, the @Inject annotation can be used on fields, constructors and methods.
 * - The javax.inject.Provider<T> class can be used to declare an injection point as a provider.
 *   Thus, on-demand access to beans of shorter scopes or lazy access to other beans is allowed (through the provider.get() call).
 * - The @Named annotation can be used to replace the @Component annotation.
 * - Spring Annotations VS JSR-330 Annotations
 *     							JSR-330 Annotation
 *     Spring Annotation		(javax.inject.*)			JSR-330 Annotation Restrictions/Comments
 *   -------------------------------------------------------------------------------------------------------------------
 *   | @Autowired				@Inject						The @Inject annotation has no "required" attribute.
 *   |														The class java.util.Optional<T> in Java 8 can be used to mark a bean as optional instead.
 *   | @Component				@Named						JSR-330 does not provide a component model, just a way to identify named components.
 *   | @Scope("singleton")		@Singleton					The default scope of JSR-330 is "prototype" instead of the default scope "singleton" of Spring.
 *   |														In order to keep consistent with Spring, a JSR-330 bean declared in the Spring container uses the scope "singleton" by default.
 *   |														There is also a @Scope annotation in JSR-330, but it is only used to create scope annotations.
 *   | @Qualifier				@Qualifier / @Named			The @Qualifier annotation in JSR-330 is just a meta-annotation for building custom qualifiers.
 *   |														The @Named annotation in JSR-330 can be used to associate with concrete string qualifiers like the @Qualifier annotation in Spring.
 *   | @Value					----						<No equivalent in JSR-330>
 *   | @Required				----						<No equivalent in JSR-330>
 *   | @Lazy					----						<No equivalent in JSR-330>
 *   | ObjectFactory			Provider					The class javax.inject.Provider is a direct alternative to the ObjectFactory class, just with a shorter get() method name.
 * </pre>
 */
@Component
public class BeanA {

	@Autowired
	private CommonBean commonBean1;

	@Inject
	private CommonBean commonBean2;

	private CommonBean commonBean3;

	private CommonBean commonBean4;

	@Inject
	@Named("target2")
	private CommonBean commonBean5;

	private CommonBean commonBean6;

	private BeanB1 beanB1;

	private BeanB2 beanB2;

	private BeanB3 beanB3;

	@Autowired
	private List<CommonBean> commonBeanCollection1;

	@Inject
	private List<CommonBean> commonBeanCollection2;

	@Inject
	private Provider<CommonBean> commonBeanProvider;

	@Inject
	public void setCommonBean3(CommonBean commonBean3) {
		this.commonBean3 = commonBean3;
	}

	@Inject
	public void setCommonBean6(@Named("target2") CommonBean commonBean6) {
		this.commonBean6 = commonBean6;
	}

	public BeanA() {
	}

	@Inject
	public BeanA(CommonBean commonBean4) {
		this.commonBean4 = commonBean4;
	}

	@Inject
	public void prepareBeanBs(BeanB1 beanB1, BeanB2 beanB2, BeanB3 beanB3) {
		this.beanB1 = beanB1;
		this.beanB2 = beanB2;
		this.beanB3 = beanB3;
	}

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println("----------------------------------------------------");

		System.out.println("commonBean1: " + commonBean1);
		System.out.println("commonBean2: " + commonBean2);
		System.out.println("commonBean3: " + commonBean3);
		System.out.println("commonBean4: " + commonBean4);
		System.out.println("commonBean5: " + commonBean5);
		System.out.println("commonBean6: " + commonBean6);

		System.out.println();

		System.out.println("beanB1: " + beanB1);
		System.out.println("beanB2: " + beanB2);
		System.out.println("beanB3: " + beanB3);

		System.out.println("----------------------------------------------------");

		System.out.println("commonBeanCollection1: " + commonBeanCollection1);
		if (commonBeanCollection1 != null) {
			System.out.println("commonBeanCollection1.size(): " + commonBeanCollection1.size());
			for (CommonBean commonBean : commonBeanCollection1) {
				System.out.println(commonBean);
			}
		}

		System.out.println();

		System.out.println("commonBeanCollection2: " + commonBeanCollection2);
		if (commonBeanCollection2 != null) {
			System.out.println("commonBeanCollection2.size(): " + commonBeanCollection2.size());
			for (CommonBean commonBean : commonBeanCollection2) {
				System.out.println(commonBean);
			}
		}

		System.out.println("----------------------------------------------------");

		System.out.println("commonBeanProvider: " + commonBeanProvider);
		System.out.println("commonBeanProvider.get(): " + commonBeanProvider.get());

		System.out.println("----------------------------------------------------");

	}

}
