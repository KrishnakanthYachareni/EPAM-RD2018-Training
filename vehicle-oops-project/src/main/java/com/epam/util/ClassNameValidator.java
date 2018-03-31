/**
 * this program validates the commands.
 */
package com.epam.util;

import com.epam.exception.NoVehicleFoundException;

/**
 * @author Krishnakanth_Yachareni & Srinivas_Chintakindhi
 */
public class ClassNameValidator {
    /**
     * This method can validates the vehicle class name. and then return the
     * validated class name.
     * @param vehicleName
     *            name of vehicle.
     * @return String vehcile name.
     * @throws NoVehicleFoundException
     *             {@link NoVehicleFoundException}
     */
    public String validateCommand(final String vehicleName)
            throws NoVehicleFoundException {
        // string variable
        String vehicle = "";
        // Iterate the String array to validate the given string.
        for (String vehicleClassType : Constants.VEHICLECLASSLIST) {
            if (vehicleName.equalsIgnoreCase(vehicleClassType)) {
                // Assign vehicle class name to
                vehicle = vehicleClassType;
            }
        }
        if (vehicle.isEmpty()) {
            throw new NoVehicleFoundException("Invalid Class Name");
        }
        // return validated class name.
        return vehicle;
    }
}
