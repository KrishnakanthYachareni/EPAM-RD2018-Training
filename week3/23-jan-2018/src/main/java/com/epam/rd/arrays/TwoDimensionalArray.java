/**
 * This code accept and display two dimensional array.
 */
package com.epam.rd.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The TwoDimensionalArray class takes double values as two dimensional array
 * then it can display that array.
 * @author Krishnakanth_Yachareni
 * @since 23-01-2018.
 */
public final class TwoDimensionalArray {
    /**
     * Default constructor.
     */
    private TwoDimensionalArray() {
    }

    /**
     * The displayMatrix will display double array in matrix form.
     * @param arr
     *            double array.
     */
    private void displayMatrix(final double[][] arr) {
        for (int row = 0; row < arr[0].length; row++) {
            for (int col = 0; col < arr[1].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param args
     *            main args
     */
    public static void main(final String[] args) {
        // Declare row, columns and double array.
        int rows, columns;
        double[][] arr;
        // Read input
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter no of rows, columns.");
            rows = sc.nextInt();
            columns = sc.nextInt();
            // Initialize double array.
            arr = new double[rows][columns];
            // assign value through index.
            arr[1][1] = 1;
            // TwoDimensionalArray class instance.
            TwoDimensionalArray ob = new TwoDimensionalArray();
            // calling method.
            ob.displayMatrix(arr);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, give only valid values.");
        } finally {
            sc.close();
        }

    }

}
