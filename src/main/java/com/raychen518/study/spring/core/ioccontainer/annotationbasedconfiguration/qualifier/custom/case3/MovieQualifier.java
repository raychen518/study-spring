package com.raychen518.study.spring.core.ioccontainer.annotationbasedconfiguration.qualifier.custom.case3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <pre>
 * A custom qualifier annotation Offline is created here.
 * This annotation does not require a value by removing the statement "String value()".
 * </pre>
 */
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface MovieQualifier {

	String genre();

	MovieFormat format();

}
