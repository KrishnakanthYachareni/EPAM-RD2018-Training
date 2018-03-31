/**
 * This is a simple login example.
 */
package org.login.consoleapp;

import org.apache.log4j.Logger;
import org.login.service.UserManager;
import org.login.service.exception.InvalidCredentialsException;
import org.login.service.exception.InvalidUserNameException;
import org.login.service.validator.PasswordValidator;
import org.login.service.validator.UserNameValidator;

import java.util.Scanner;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class LoginDemo {

    /**
     * Logging Initialization
     */
    private static final Logger LOGGER = Logger.getLogger(LoginDemo.class);

    /**
     * @param args
     */
    public static void main(String[] args) {

        UserNameValidator nameValid = new UserNameValidator();
        PasswordValidator passValid = new PasswordValidator();

        UserManager userManager = new UserManager();

        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter username and Password");

        String username = sc.next();
        String password = sc.next();

        try {
            if (nameValid.validate(username) && passValid.validate(password)) {
                userManager.login(username, password);
                LOGGER.info("Login Successs....");
            }
        } catch (InvalidUserNameException | InvalidCredentialsException e) {
            LOGGER.error(e);
        } finally {
            sc.close();
        }
    }
}
