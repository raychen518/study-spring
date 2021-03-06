package com.raychen518.study.spring.core.ioccontainer.environmentabstraction.javabased;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Profile;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Profile({ "profile1", "profile3" })
public @interface Profile1And3 {
}
