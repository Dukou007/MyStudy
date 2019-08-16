package com.study.annotation;

import com.study.enumeration.LogOperateTypeEnum;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {
    LogOperateTypeEnum operationType() ;
    String operateContent();
}
