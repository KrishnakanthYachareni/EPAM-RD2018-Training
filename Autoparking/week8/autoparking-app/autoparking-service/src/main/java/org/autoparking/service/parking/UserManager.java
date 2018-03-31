/**
 * This is an auto parking web application.
 */
package org.autoparking.service.parking;

import org.autoparking.api.model.impl.UserEntityImpl;
import org.autoparking.service.exception.InvalidCredentialsException;

/**
 * @author Krishnakanth
 *
 */
public class UserManager {

    /**
     * {@link UserEntityImpl}.
     */
    private UserEntityImpl userEntityImpl;

    /**
     * Default construcor, It can initialize the usermanager refernce.
     */
    public UserManager() {
        userEntityImpl = new UserEntityImpl();
    }

    /**
     * This method can check whether the given user credentials are correct or
     * not.
     * 
     * @param userName
     * @param password
     * @return boolean true on successfull login.
     * @throws InvalidCredentialsException {@link InvalidCredentialsException}.
     */
    public boolean userLogin(final String userName, final String password)
            throws InvalidCredentialsException {
        boolean isValid = false;
        if (userEntityImpl.checkUser(userName, password)) {
            isValid = true;
        } else {
            throw new InvalidCredentialsException("Incorret Login Credentials");
        }
        return isValid;
    }

    /**
     * This method can do signUp of user.
     * 
     * @param userName
     * @param password
     * @param parkingLotName
     * @return boolean true on successful signup.
     * @throws InvalidCredentialsException {@link InvalidCredentialsException}.
     */
    public boolean userSignUp(final String userName, final String password, String parkingLotName)
            throws InvalidCredentialsException {
        boolean isValid = false;
        if (userEntityImpl.checkUser(userName, password)) {
            throw new InvalidCredentialsException("username password alreday exists.");
        } else {
            isValid = userEntityImpl.addNewUser(userName, password, parkingLotName);
        }

        return isValid;
    }
}
