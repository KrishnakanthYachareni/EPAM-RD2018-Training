/**
 * This is a simple custom annotation creation example.
 */
package com.epam;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is custom annotation creation it has some attributes.
 * 
 * @author Krishnakanth
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // on class level
/**
 * @author Krishnakanth
 *
 */
public @interface MyAnnotation {

    /**
     * This is an ENUM for Priority type.
     * 
     * @author Krishnakanth
     *
     */
    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    /**
     * @return priority type.
     */
    Priority priority() default Priority.MEDIUM;

    /**
     * @return tag array.
     */
    String[] tags() default "";

    /**
     * @return String as creater name.
     */
    String createdBy() default "";

    /**
     * @return Last Modified date.
     */
    String lasModified() default "";
}
