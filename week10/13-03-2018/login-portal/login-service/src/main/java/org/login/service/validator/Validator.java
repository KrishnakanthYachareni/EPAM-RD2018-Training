/**
 * This is a simple login example.
 */
package org.login.service.validator;

import org.login.service.exception.InvalidUserNameException;

/**
 * @author Krishnakanth_Yachare
 */
public interface Validator {

    /**
     * @param string validating parameter.
     * @return boolean
     * @throws InvalidUserNameException {@link UserNameValidator}
     */
    boolean validate(String string) throws InvalidUserNameException;
}
