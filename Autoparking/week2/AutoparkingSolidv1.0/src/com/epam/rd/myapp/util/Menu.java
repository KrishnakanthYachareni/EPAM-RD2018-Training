/**
 * Auto Car Parking Application that accept parking area and number of parking
 * slots in a parking area. After accepting the prompt will stay and accept
 * commands to accept the parking cars one by one. Also accept command to unpark
 * the car.
 */
package com.epam.rd.myapp.util;

/**
 * The Menu class contains menu list.
 * @author Krishnakanth Yachareni
 * @version 1.0
 * @since 2018-01-19
 */
public class Menu {
    /**
     * Menu command list.
     */
    public void menu() {
        System.out.println("---------- AUTOPARKING ---------");
        System.out.println("Choose any one command in MENU.");
        System.out.println("p => park");
        System.out.println("u => unpark");
        System.out.println("e => exit");
    }
}
