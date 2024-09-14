package org.example;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface DevelopmentHistoryWithReviewer {
    double version() default 1.0;
    String developer() default "mahin";
    String tester() default "Mahin";
    String[] reviewers() default {"Mahmudul", "Islam", "Mahin"};
}
