/**
 * This Program calculate sum and average of an array values.
 */
package com.epam.rd.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The SumAvgArrays class implements the method that calculates sum and average
 * of an array.
 * @author Krishnakanth_Yachareni
 */
public final class SumAvgArrays {
    /**
     * sum is an integer, it holds sum of array.
     */
    private int sum;
    /**
     * average is an double, it holds average of an array.
     */
    private double average;

    /**
     * SumAvgArrays is constructor it can accept an int array, calculate sum and
     * average then assign results to sum, average respective variable.
     * @param array
     *            array is an integer array.
     */
    private SumAvgArrays(final int[] array) {
        for (int id : array) {
            this.sum += id;
        }
        this.average = this.sum / array.length;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Array Sum is:" + sum + "\nAverage is:" + average);
    }

    /**
     * Main method to be called by JVM.
     * @param args
     *            args is string array.
     */
    public static void main(final String[] args) {
        /* read input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        try {
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter integer values for an array");
            /* read input */
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            SumAvgArrays object = new SumAvgArrays(array);
            System.out.println(object);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Give integer values");
        } finally {
            sc.close();
        }
    }

}
