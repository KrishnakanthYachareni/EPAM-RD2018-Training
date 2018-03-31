/**
 * this file contains constants used in the application.
 */
package com.epam.util;

/**
 * @author Krishnakanth_Yachare
 */
public final class Constants {
    /**
     * default constructor.
     */
    private Constants() {
    }

    /**
     * Vehicle Properties file name.
     */
    public static final String VEHICLE_PROPERTIES_FILE =
            "src/main/resources/vehicleproperties.txt";
    /**
     * Land Vehicles package.
     */
    public static final String LAND_VEHICLES_PACKAGE_NAME =
            "com.epam.vehicle.land.";
    /**
     * Water vechiles package name.
     */
    public static final String WATER_VEHICLES_PACKAGE_NAME =
            "com.epam.vehicle.water.";
    /**
     * Air Vehicle package name.
     */
    public static final String AIR_VEHICLES_PACKAGE_NAME =
            "com.epam.vehicle.air.";
    /**
     * String array It contains the vehicle package names. Because It can
     * identify the where the vehicle present.
     */
    public static final String[] PACKAGEARRAY = new String[] {
            LAND_VEHICLES_PACKAGE_NAME, WATER_VEHICLES_PACKAGE_NAME,
            AIR_VEHICLES_PACKAGE_NAME };

    /**
     * Vehicles classes names array.
     */
    public static final String[] VEHICLECLASSLIST = new String[] {"Bicycle",
            "Bus", "Car", "Metro", "MotorCycle", "QuadBike", "Scooter",
            "Segway", "SnowMobile", "Tank", "Train", "Tram", "Van", "Barge",
            "Boat", "Catamaran", "JetSki", "Ship", "Yacht", "AirHotBallon",
            "Airplane", "Airship", "HangGlider", "HeliCopter", "JetFighter",
            "RocketPack", "Spaceship" };
}
