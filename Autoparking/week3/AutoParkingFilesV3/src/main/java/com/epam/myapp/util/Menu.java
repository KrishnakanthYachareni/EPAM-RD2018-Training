/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.util;

/**
 * The Menu class contains menu list.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class Menu {
    /**
     * Menu command list.
     */
    public void menu() {
        System.out.println("---------- AUTOPARKING ---------");
        System.out.println("Choose any one command in MENU.");
        System.out.println("p => Park");
        System.out.println("u => Unpark");
        System.out.println("l => Log Data");
        System.out.println("e => Exit");
    }
}
