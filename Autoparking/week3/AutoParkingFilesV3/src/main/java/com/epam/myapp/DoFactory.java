/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp;

import com.epam.myapp.exceptions.InvalidCommandException;
import com.epam.myapp.model.LogFile;
import com.epam.myapp.model.Park;
import com.epam.myapp.model.Unpark;
import com.epam.myapp.service.Command;
import com.epam.myapp.util.Constants;

/**
 * The DoFactory class checks the string and then return Its respective object.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class DoFactory {
    /**
     * This method compare given command and then create its object then
     * returns.
     * @param taskType
     *            is a String command.
     * @return returns respective command object based on tested condition.
     * @throws InvalidCommandException
     *             {@link InvalidCommandException}
     */
    public Command getTask(final String taskType)
            throws InvalidCommandException {
        Object object = null;
        switch (taskType.toUpperCase()) {
            case Constants.PARK_COMMAND:
                object = new Park();
                break;
            case Constants.UNPARK_COMMAND:
                object = new Unpark();
                break;
            case Constants.LOG_REPORT:
                object = new LogFile();
                break;
            case Constants.EXIT:
                object = null;
                break;

            default:
                throw new InvalidCommandException("Invalid command");
        }
        return (Command) object;
    }
}
