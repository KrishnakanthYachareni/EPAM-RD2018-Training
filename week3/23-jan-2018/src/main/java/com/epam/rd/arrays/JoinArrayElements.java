/**
 * This Program that can pretty print a given two-dimensional array:.
 */
package com.epam.rd.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The JoinArrayElements class which joins the elements of an array into one
 * string. The separator character must be optional.
 * @author Krishnakanth_Yachareni
 * @since 23-01-2018.
 */
public final class JoinArrayElements {
    /**
     * default constructor.
     */
    private JoinArrayElements() {
    }

    /**
     * The join method can convert int array values to string and default
     * separator is comma.
     * @param array
     *            array is an int array.
     * @return String
     */
    private String join(final int[] array) {
        String string = "";
        for (int id = 0; id < array.length; id++) {
            if (id == array.length - 1) {
                string += array[id];
            } else {
                string += array[id] + ", ";
            }
        }
        return string;
    }

    /**
     * The join method can convert int array values to string and it separate
     * the values based on separator.
     * @param array
     *            array is an int array.
     * @param sep
     *            separator for array values.
     * @return string
     */
    private String join(final int[] array, final String sep) {
        String string = "";
        for (int id = 0; id < array.length; id++) {
            if (id == array.length - 1) {
                string += array[id];
            } else {
                string += array[id] + sep + " ";
            }
        }
        return string;
    }

    /**
     * Main method to be called.
     * @param args
     *            main args.
     */
    public static void main(final String[] args) {
        // Read input as size of an array.
        Scanner sc = new Scanner(System.in);
        try {
            int size;
            int[] array;
            System.out.println("Enter size of an array.");
            size = sc.nextInt();
            // Initialize an array.
            array = new int[size];
            System.out.println("Enter array values.");
            // Read input for array.
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            // Create instance.
            JoinArrayElements object = new JoinArrayElements();
            // Call join methods and those get overload.
            System.out.println(object.join(array));
            // passing separator to join.
            System.out.println(object.join(array, ";"));
        } catch (InputMismatchException e) {
            System.out.println("Invalid values, give only integer values");
        } finally {
            sc.close();
        }
    }

}
