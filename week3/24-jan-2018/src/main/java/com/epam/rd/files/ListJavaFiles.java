/**
 * This code simple listing program that lists all the ”*.java” files
 * within a specified directory.
 */
package com.epam.rd.files;

import java.io.File;

import com.epam.rd.files.Exception.InputValidationException;

/**
 * The ListJavaFiles class is simple listing program that lists all the ”*.java”
 * files within a specified directory.
 * @author Krishnakanth_Yachareni
 * @since 24-01-2018
 */
public final class ListJavaFiles {
    /**
     * Default Constructor.
     */
    private ListJavaFiles() {

    }

    /**
     * Main method can accept directory path name and display all the files ends
     * with '.java'.
     * @param args
     *            command line argument contains directory path as String.
     */
    public static void main(final String[] args) {
        /*
         * Handle NullPointerException, ArrayIndexOutOfBoundsExceptions.
         */
        try {
            if (args.length == 1) {
                // Returns abstract path name.
                File file = new File(args[0]);
                // Converting file objects to String list.
                String[] fileName = file.list();
                for (String name : fileName) {
                    /*
                     * checking file ends with'.java'
                     */
                    if (name.endsWith(".java")) {
                        System.out.println(name);
                    }
                }
            } else {
                throw new InputValidationException(
                        "Pass only one exact path directory");
            }
        } catch (NullPointerException e) {
            System.err.println("Invalid Directory Path");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Path name should not empty");
        } catch (InputValidationException e) {
            System.err.println(e.getMessage());
        }

    }

}
