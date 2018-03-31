/**
 * program that display the structure of a specified folder recursively.
 */
package com.epam.rd.files;

import java.io.File;

import com.epam.rd.files.Exception.InputValidationException;

/**
 * The TreeStructure class that display the structure of a specified folder
 * recursively.
 * @author Krishnakanth_Yachare
 * @since 24-01-2018
 */
public final class TreeStructure {
    /**
     * Default constructor.
     */
    private TreeStructure() {
    }

    /**
     * @param arr
     *            File array
     * @param start
     *            integer for maintain index of every file in a directory.
     * @param level
     *            integer for maintain level of every directory.
     */
    private void printTreeStr(File[] arr, int start, int level) {
        // terminate condition
        if (start == arr.length) {
            return;
        }
        // tabs for internal levels
        for (int i = 0; i < level; i++) {
            System.out.print("|\t");
        }

        // for files
        if (arr[start].isFile()) {
            System.out.println(arr[start].getName());
        } else if (arr[start].isDirectory()) {
            System.out.println("+- " + arr[start].getName() + "/");

            // recursion for sub-directories
            printTreeStr(arr[start].listFiles(), 0, level + 1);
        }

        // recursion for main directory
        printTreeStr(arr, ++start, level);

    }

    /**
     * Main method can accept Directory path as command line argument.
     * @param args
     *            String array
     */
    public static void main(final String[] args) {
        try {
            // validate to pass only one exact directory path name.
            if (args.length == 1) {
                // file open
                File fi = new File(args[0]);
                // Directory files to File array.
                File[] files = fi.listFiles();
                TreeStructure obj = new TreeStructure();
                // calling method.
                obj.printTreeStr(files, 0, 0);
            } else {
                throw new InputValidationException(
                        "Pass only one exact path directory");
            }
        } catch (NullPointerException e) {
            System.err.println("Directory path should not be null.");
        } catch (InputValidationException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }

}
