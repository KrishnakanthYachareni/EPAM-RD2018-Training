/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.epam.myapp.exceptions.InvalidCommandException;
import com.epam.myapp.exceptions.InvalidParkingAreaException;
import com.epam.myapp.exceptions.InvalidRegistrationNumberException;
import com.epam.myapp.exceptions.InvalidUserNameException;
import com.epam.myapp.service.Command;
import com.epam.myapp.service.ParkingManager;
import com.epam.myapp.util.Menu;
import com.epam.myapp.validators.CapacityValidator;
import com.epam.myapp.validators.ParkAreaValidator;
import com.epam.myapp.validators.PasswordValidator;
import com.epam.myapp.validators.UseNameValidator;
import com.epam.myapp.validators.Validator;

/**
 * The {@link ComandInvoker} class is driver class for AutoParking
 * Application.It can accept the commands.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class ComandInvoker {
    /**
     * {@link ParkingManager} object reference.
     */
    private ParkingManager vHandler = new ParkingManager();
    /**
     * {@link ParkAreaValidator} reference.
     */
    private Validator nameValidator = new ParkAreaValidator();
    /**
     * {@link CapacityValidator} reference.
     */
    private Validator capaValidator = new CapacityValidator();
    /**
     * {@link UseNameValidator} reference.
     */
    private Validator usernameValidator = new UseNameValidator();
    /**
     * {@link PasswordValidator} reference.
     */
    private Validator passwordValidator = new PasswordValidator();

    /**
     * This method can accepts the user name and password and then validates the
     * credentials if credentials valid it can call vehicleDrive method.
     * @throws FileNotFoundException
     *             {@link FileNotFoundException}
     * @throws ClassNotFoundException
     *             {@link ClassNotFoundException}
     * @throws IOException
     *             {@link IOException}
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     * @throws InvalidRegistrationNumberException
     *             {@link InvalidRegistrationNumberException}
     * @throws InvalidParkingAreaException
     *             {@link InvalidParkingAreaException}
     */
    public void userLogin() throws FileNotFoundException,
            ClassNotFoundException, IOException, InvalidUserNameException,
            InvalidParkingAreaException, InvalidRegistrationNumberException {
        // Read user name
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("*********** Login Panel **********");
            System.out.println("Enter User Name");
            String username = sc.next();
            // validate user name format
            usernameValidator.validate(username);
            // Read password If console supports it can read through console
            // else can read through Scanner.
            String password;
            Console console = System.console();
            if (console != null) {
                char[] passwordArray = console
                        .readPassword("Enter your secret password: ");
                password = new String(passwordArray);
            } else {
                System.out.println("Enter your secret password: ");
                password = sc.next();
            }
            // Validates password format
            passwordValidator.validate(password);
            // Check for valid user name and password.
            if (vHandler.isUserValid(username, password)) {
                vehicleDriver();
            } else {
                throw new InvalidUserNameException(
                        "Invalid user name and password");
            }
        }
    }

    /**
     * This method can accept the new user information and then it can
     * {@link UserManager} class to store.If it success will call vehicleDriver
     * method.
     * @throws ClassNotFoundException
     *             {@link ClassNotFoundException}
     * @throws IOException
     *             {@link IOException}
     * @throws InvalidParkingAreaException
     *             {@link InvalidParkingAreaException}
     * @throws InvalidRegistrationNumberException
     *             {@link InvalidRegistrationNumberException}
     * @throws InvalidUserNameException
     *             {@link InvalidUserNameException}
     */
    public void userSignUp() throws ClassNotFoundException, IOException,
            InvalidParkingAreaException, InvalidRegistrationNumberException,
            InvalidUserNameException {
        // Read input data.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("************ SignUp Panel ***********");
            System.out.println("Enter User Name");
            String username = sc.next();
            // validate user name format
            usernameValidator.validate(username);
            // Read password If console supports it can read through console
            // else can read through Scanner.
            String password;
            Console console = System.console();
            if (console != null) {
                char[] passwordArray = console
                        .readPassword("Enter your secret password: ");
                password = new String(passwordArray);
            } else {
                System.out.println("Enter your secret password");
                password = sc.next();
            }
            // validates password format.
            passwordValidator.validate(password);
            System.out.println("Enter Paking Lot Name");
            String parkingLot = sc.next();
            System.out.println("Enter Parking Lot Capacity");
            int lotCapacity = sc.nextInt();
            // Validates parking Lot name and capacity.
            if (nameValidator.validate(parkingLot)
                    && capaValidator.validate(String.valueOf(lotCapacity))) {
                vHandler.addNewUser(username, password, parkingLot,
                        lotCapacity);
                vehicleDriver();
            }
        }
    }

    /**
     * This method accept commands and then call respective methods.
     */
    public void vehicleDriver() {
        Scanner sc = new Scanner(System.in);
        // Menu class object
        Menu ob = new Menu();
        DoFactory doF = new DoFactory();
        try {
            while (true) {
                // calling display Menu.
                ob.menu();
                try {
                    Command pl = doF.getTask(sc.next());
                    if (pl == null) {
                        break;
                    }
                    pl.doTask(vHandler);
                } catch (InvalidCommandException e) {
                    System.err.println(e.getLocalizedMessage());
                } catch (InvalidRegistrationNumberException e) {
                    System.err.println(e.getLocalizedMessage());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InvalidParkingAreaException e) {
                    System.err.println(e.getLocalizedMessage());
                } catch (InvalidUserNameException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        } finally {
            sc.close(); // closing scanner resource.
        }
    }
}
