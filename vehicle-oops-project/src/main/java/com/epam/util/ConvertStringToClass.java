/**
 * This program converts a string to corresponding vehicles sobject.
 */
package com.epam.util;

/**
 * @author Krishnakanth_Yachareni & Srinivas_Chintakindhi
 */
public class ConvertStringToClass {

    /**
     * class type.
     */
    private Class<?> vehicleClass = null;

    /**
     * This method can convert the class name(String) and then Class type.
     * @param vehicleName
     *            string vehicle name.
     * @return corresponding vehicle type Class.
     */
    public Class<?> convertStringToClassType(final String vehicleName) {
        /*
         * Checking class name path and then convert into full class path.
         */
        for (String packagePath : Constants.PACKAGEARRAY) {
            try {
                // convert string to class path.
                vehicleClass = Class.forName(packagePath + vehicleName);
            } catch (ClassNotFoundException e) {
                continue;
            }
        }
        return vehicleClass;
    }
}
