package com.chenqx.pojo.annotataion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author cqx
 * @date 2018/7/20 17:42
 */
public class UserCase {
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UserCases{
        public String id();
        public String description() default "no description";
    }
}
