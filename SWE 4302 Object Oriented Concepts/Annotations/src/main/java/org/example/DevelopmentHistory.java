package org.example;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DevelopmentHistory {
    double version() default 1.0;
    String developer() default "mahin";
    String tester() default "Mahin";
}
