package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.custom.case1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <pre>
 * A custom qualifier annotation Group is created here.
 * The Qualifier annotation should be used for this creation.
 * </pre>
 */
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Group {
	String value() default "";
}
