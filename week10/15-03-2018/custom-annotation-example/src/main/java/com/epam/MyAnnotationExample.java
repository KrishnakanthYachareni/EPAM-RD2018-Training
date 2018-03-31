/**
 * This is a simple custom annotation creation example.
 */
package com.epam;

import com.epam.MyAnnotation.Priority;

/**
 * @author Krishnakanth
 *
 */
@MyAnnotation(priority = Priority.HIGH, createdBy = "Krishnakanth Yachareni",
        lasModified = "15-03-2018", tags = {"EPAM SYSTEMS"})
public class MyAnnotationExample {

    /**
     * Simple method can calculate the sum of two numbers.
     */
    int simpleMethod(int a, int b) {
        return a + b;
    }
}
