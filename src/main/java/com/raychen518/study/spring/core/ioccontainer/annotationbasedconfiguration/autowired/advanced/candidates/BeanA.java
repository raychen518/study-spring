package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.autowired.advanced.candidates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <pre>
 * The AutowireCandidateResolver determines autowire candidates by following ways.
 * - The "autowire-candidate" attribute of each <bean> element. (see code about BeanB)
 * - The "default-autowire-candidates" attribute of each <beans> element.
 * - The occurrences of the Qualifier annotation. (see code about BeanC)
 * - The occurrences of any custom Qualifier annotations (including those ones registered with the CustomAutowireConfigurer). (see code about BeanD and BeanE)
 * </pre>
 */
public class BeanA {

	@Autowired(required = false)
	private List<BeanB> beanBs;

	@Autowired(required = false)
	@Qualifier
	private List<BeanC> beanCs;

	@Autowired(required = false)
	@Online(true)
	private List<BeanD> beanDs;

	@Autowired(required = false)
	@UniqueName
	private List<BeanE> beanEs;

	public void doSomething() {
		System.out.println(getClass().getSimpleName());
		System.out.println();

		System.out.println("beanBs: " + beanBs);
		System.out.println("beanBs.size(): " + (beanBs == null ? 0 : beanBs.size()));

		if (beanBs != null) {
			for (BeanB beanB : beanBs) {
				System.out.println(beanB);
			}
		}
		System.out.println();

		System.out.println("beanCs: " + beanCs);
		System.out.println("beanCs.size(): " + (beanCs == null ? 0 : beanCs.size()));

		if (beanCs != null) {
			for (BeanC beanC : beanCs) {
				System.out.println(beanC);
			}
		}
		System.out.println();

		System.out.println("beanDs: " + beanDs);
		System.out.println("beanDs.size(): " + (beanDs == null ? 0 : beanDs.size()));

		if (beanDs != null) {
			for (BeanD beanD : beanDs) {
				System.out.println(beanD);
			}
		}
		System.out.println();

		System.out.println("beanEs: " + beanEs);
		System.out.println("beanEs.size(): " + (beanEs == null ? 0 : beanEs.size()));

		if (beanEs != null) {
			for (BeanE beanE : beanEs) {
				System.out.println(beanE);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BeanA bean = new BeanA();
		bean.doSomething();
	}

}
