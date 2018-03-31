/**
 * This is a simple custom annotation creation example.
 */
package com.epam;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * This is test case for {@link MyAnnotationExample}
 * 
 * @author Krishnakanth
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MyAnnotationExampleTest {

    /**
     * {@link MyAnnotationExample}.
     */
    @InjectMocks
    MyAnnotationExample myExample;

    @Test
    public void myAnnotationTest() {
        MyAnnotation myAnnotation = myExample.getClass().getAnnotation(MyAnnotation.class);
        assertThat(myAnnotation.priority().toString(), is("HIGH"));
        assertThat(myAnnotation.createdBy().toString(), is("Krishnakanth Yachareni"));
        assertThat(myAnnotation.lasModified().toString(), is("15-03-2018"));
        assertThat(myAnnotation.tags().length, is(1));
    }

}
