/**
 * This code can calculate the sum of the rows,
 * columns and a diagonal of a two dimensional array.
 */
package com.epam.rd.arrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The TwoDimensionalSum implements the methods that can calculate
 * the sum of the rows, columns and a diagonal of a two dimensional array.
 * It displays in the following way.
 * 0 1 2 | 3
 * 1 2 3 | 6
 * 2 3 4 | 9
 * ------/
 * 3 6 9 6
 * @author Krishnakanth_Yachareni.
 * @since 23-01-2018.
 */
public final class TwoDimensionalSum {
    /**
     * Default constructor.
     */
    private TwoDimensionalSum() {
    }

    /**
     * This method calculate rows, columns, diagonals and it display there
     * itself.
     * @param arr
     *            double array.
     */
    private void calculateSumOfRows(final int[][] arr) {
        ArrayList<Integer> colarray = new ArrayList<Integer>();
        int diagnolSum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j] + " ");
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            colarray.add(colSum);
            diagnolSum += arr[i][i];
            System.out.print("| " + rowSum);
            System.out.println();
        }

        for (int i = 0; i < 2 * arr[0].length; i++) {
            System.out.print("-");
        }
        System.out.println("/");
        for (Integer integer : colarray) {
            System.out.print(integer + " ");
        }
        System.out.println(" " + diagnolSum);
    }

    /**
     * @param args
     *            main args.
     */
    public static void main(final String[] args) {
        // Declare row, columns and double array.
        int rows, columns;
        int[][] arr;
        // Read input
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter no of rows, columns.");
            rows = sc.nextInt();
            columns = sc.nextInt();
            arr = new int[rows][columns];
            System.out.println("Enter values.");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // TwoDimensionalSum class instance.
            TwoDimensionalSum ob = new TwoDimensionalSum();
            // calling method.
            ob.calculateSumOfRows(arr);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, give only valid values.");
        } finally {
            sc.close();
        }
    }

}
