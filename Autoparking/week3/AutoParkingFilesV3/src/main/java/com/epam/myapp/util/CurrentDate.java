/**
 * Auto Car Parking Application that can have Login and SignUp panels and after
 * successful login the prompt will stay and accept commands to accept the
 * parking cars one by one. Also accept command to unpark the car. Vehcile
 * parking in time , unpark time will store in text file.
 */
package com.epam.myapp.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * The {@link CurrentDate} class create the current instance time.
 * @author Krishnakanth Yachareni
 * @version 3.0
 */
public class CurrentDate {
    /**
     * @return String Current date and time
     */
    public String getDate() {
        // Date and time format
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String date = dateFormat.format(cal.getTime());
        return date;
    }
}
