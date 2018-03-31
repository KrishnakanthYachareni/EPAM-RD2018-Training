/**
 * overriding equals method and then compare two objects.
 */
package com.epam.rd.sorting;

/**
 * @author Krishnakanth Yachareni
 * @since 24-01-2018
 */
public final class WithEqauls {
    /**
     * Default constructor.
     */
    private WithEqauls() {
    }

    /**
     * @param args
     *            args
     */
    public static void main(final String[] args) {
        Person c1 = new Person(10, 15);
        Person c2 = new Person(10, 15);

        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }

}
