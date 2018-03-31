/**
 * This is a simple login example.
 */
package org.login.consoleapp;

import org.apache.log4j.Logger;
import org.login.service.UserManager;
import org.login.service.exception.InvalidUserNameException;
import org.login.service.validator.PasswordValidator;
import org.login.service.validator.UserNameValidator;

import java.util.Scanner;

public class SignInDemo {

    /**
     * Logging Initialization
     */
    private static final Logger LOGGER = Logger.getLogger(SignInDemo.class);

    public static void main(String[] args) {

        UserNameValidator nameValid = new UserNameValidator();
        PasswordValidator passValid = new PasswordValidator();

        UserManager userManager = new UserManager();

        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter username and Password for signIn");

        String username = sc.next();
        String password = sc.next();

        try {
            if (nameValid.validate(username) && passValid.validate(password)) {
                userManager.signIn(username, password);
                LOGGER.info("SignUp Successs....");
            }
        } catch (InvalidUserNameException e) {
            LOGGER.error(e);
        } finally {
            sc.close();
        }
    }
}
