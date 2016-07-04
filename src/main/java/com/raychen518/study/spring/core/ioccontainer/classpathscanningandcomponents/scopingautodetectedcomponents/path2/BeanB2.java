package com.raychen518.study.spring.core.ioccontainer.classpathscanningandcomponents.scopingautodetectedcomponents.path2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
// Any of the following statements does the same thing as the above one.
// @Scope(value = "prototype")
// @Scope(scopeName = "prototype")
// @Scope(BeanDefinition.SCOPE_PROTOTYPE)
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanB2 {
}