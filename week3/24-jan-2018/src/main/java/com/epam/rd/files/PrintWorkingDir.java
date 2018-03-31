/**
 * program that prints the working directory to the console.
 */
package com.epam.rd.files;

/**
 * The PrintWorkingDir class that prints the working directory to the console.
 * @author Krishnakanth_Yachare
 * @since 24-01-2018
 */
public final class PrintWorkingDir {
    /**
     * Default Constructor.
     */
    private PrintWorkingDir() {
    }

    /**
     * @param args
     *            String array.
     */
    public static void main(final String[] args) {
        /*
         * 'user.name' User's account name 'user.home' User's home directory
         * 'user.dir' User's current working directory
         */
        // Current working Directory.
        System.out.println(System.getProperty("user.dir"));
    }

}
