/**
 * This package has implementation of Interface segregation design principle.
 */
package com.epam.rd.solid;

/**
 * The Drone implemented two methods of CameraSwitch.
 * @author Krishnakanth Yachareni
 */
public class Drone extends Vehicle implements CameraSwitch {

    /**
     * @param vehicle
     *            string type of vehicle.
     */
    public Drone(final String vehicle) {
        super(vehicle);
    }

    /**
     * This method can turn on the camera.
     * @see com.epam.rd.solid.CameraSwitch#cameraTurnOn()
     */
    public void cameraTurnOn() {
        System.out.println("Camera Turned On");
    }

    /**
     * This method can turn off the camera.
     * @see com.epam.rd.solid.CameraSwitch#cameraTurnOff()
     */
    public void cameraTurnOff() {
        System.out.println("Camera Turned Off");
    }

}
