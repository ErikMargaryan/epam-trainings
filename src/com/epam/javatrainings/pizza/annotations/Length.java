package com.epam.javatrainings.pizza.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Length {
    String message() default "The length of name must be in 3-100 characters";
    int min() default 3;
    int max() default 100;
}
