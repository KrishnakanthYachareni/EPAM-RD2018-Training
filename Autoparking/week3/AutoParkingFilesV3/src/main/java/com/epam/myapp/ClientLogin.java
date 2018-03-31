/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.epam.myapp.exceptions.InvalidParkingAreaException;
import com.epam.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.myapp.exceptions.InvalidUserNameException;

/**
 * The {@link ClientLogin} class has main method it can has two options login
 * and signUp. It can call according to that options given by user.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public final class ClientLogin {
    /**
     * Default constructor.
     */
    private ClientLogin() {
    }

    /**
     * Main method to be called by JVM.
     * @param args
     *            command line arguments.
     * @throws FileNotFoundException
     *             {@link FileNotFoundException}
     * @throws ClassNotFoundException
     *             {@link ClassNotFoundException}
     * @throws IOException
     *             {@link IOException}
     */
    public static void main(final String[] args) {
        ComandInvoker parkingH = new ComandInvoker();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(
                    "**************** Welcome To AutoParking ****************");
            System.out.println("1.Login\n2.SignUp(new user)");
            switch (sc.nextInt()) {
            case 1:
                // login
                parkingH.userLogin();
                break;
            case 2:
                // signUp
                parkingH.userSignUp();
                break;
            default:
                // Wring option.
                System.out.println("Wrong option\nPlease try again......!");
            }
        } catch (InvalidParkingAreaException | InvalidUserNameException e) {
            System.err.println(e.getLocalizedMessage());
        } catch (InputMismatchException e) {
            System.err.println("Please give valid input.");
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidRegistrationNumberException e) {
            System.err.println("Please give valid input.");
        }
    }
}
