package com.epam.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.log4j.Logger;

import com.epam.exception.InvalidPropertiesException;
import com.epam.exception.NoVehicleFoundException;
import com.epam.util.ClassNameValidator;
import com.epam.util.ConvertStringToClass;
import com.epam.vehicle.Vehicle;

/**
 * class name Vehicle Service Manager.
 */
public class VehicleServiceManager {
    /**
     * Logger initialization.
     */
    private static final Logger LOGGER = Logger
            .getLogger(VehicleServiceManager.class);
    /**
     * Command validator.
     */
    private ClassNameValidator commandValidator;
    /**
     * convert string to class.
     */
    private ConvertStringToClass convertStringToClass;

    /**
     * Vehicle Service Manager constructor and It can instantiate
     * {@link ClassNameValidator} and {@link ConvertStringToClass}.
     */
    public VehicleServiceManager() {
        commandValidator = new ClassNameValidator();
        convertStringToClass = new ConvertStringToClass();
    }

    /**
     * This method can accept the vehicle property list and It can validate the
     * vehicle name then it can create the instance of that class then it can
     * return that object.
     * @param vehiclePropertiesList
     *            all vehicle properties.
     * @return Vehicle instance.
     * @throws NoVehicleFoundException
     *             no.
     * @throws InvalidPropertiesException
     *             {@link InvalidPropertiesException}
     */
    public Vehicle getVehicleObject(final List<String> vehiclePropertiesList)
            throws NoVehicleFoundException, InvalidPropertiesException {

        // Empty object type variable.
        Vehicle vehicle = null;
        // Constructor type.
        Constructor<?> constructor;
        /*
         * If vehicle property file has empty values It can return the
         * exception.
         */
        if (vehiclePropertiesList.contains("")) {
            throw new InvalidPropertiesException("Insuffciant data");
        }
        // calling commandValidator method to validate the class name
        String vehicleClassame = commandValidator
                .validateCommand(vehiclePropertiesList.get(0));
        // calling method convert string class name to class type.
        Class<?> myClass = convertStringToClass
                .convertStringToClassType(vehicleClassame);
        try {
            // get constructor of respective class type.
            constructor = myClass.getConstructor(List.class);
            // creating instance of constructor.
            vehicle = (Vehicle) constructor.newInstance(vehiclePropertiesList);
        } catch (InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            LOGGER.error("Error! Invalid vehicle property", e);
        }
        // return vehicle instance.
        return vehicle;
    }

}
