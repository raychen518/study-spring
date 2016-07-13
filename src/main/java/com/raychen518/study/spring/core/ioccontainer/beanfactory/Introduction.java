package com.raychen518.study.spring.core.ioccontainer.beanfactory;

/**
 * <pre>
 * - Use ApplicationContext instead of BeanFactory unless there is a good reason
 *   (such as the application runs on resource-constrained devices where memory consumption might be critical).
 * 
 * - ApplicationContext includes all functionality of BeanFactory.
 * 
 * - If using only a plain BeanFactory, many supports such as transactions and AOP will not take effect, at least not without some extra steps. 
 * 
 * - BeanFactory and its related interfaces, such as BeanFactoryAware, InitializingBean, DisposableBean
 *   are still present in Spring for the purposes of backward compatibility
 *   with the large number of third-party frameworks that integrate with Spring.
 * 
 * - Feature Matrix - BeanFactory vs ApplicationContext
 *   Feature											BeanFactory		ApplicationContext
 *   -----------------------------------------------------------------------------------------------
 *   Bean Instantiation/Wiring							Yes				Yes
 *   Automatic BeanPostProcessor Registration			No				Yes
 *   Automatic BeanFactoryPostProcessor Registration	No				Yes
 *   Convenient MessageSource Access (for i18n)			No				Yes
 *   ApplicationEvent Publication						No				Yes
 * </pre>
 */
public class Introduction {
}
