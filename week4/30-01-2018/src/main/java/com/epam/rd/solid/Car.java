/**
 * This package has implementation of Interface segregation design principle.
 */
package com.epam.rd.solid;

/**
 * The Car class has implemented two methods of RadioSwitch.
 * @author Krishnakanth Yachareni.
 */
public class Car extends Vehicle implements RadioSwitch {

    /**
     * @param vehicle
     *            String type of vehicle.
     */
    public Car(final String vehicle) {
        super(vehicle);
    }

    /**
     * This method can turn off the radio. (non-Javadoc)
     * @see com.epam.rd.solid.RadioSwitch#radioTurnOn()
     */
    public void radioTurnOn() {
        System.out.println("Radio is Turn on");
    }

    /**
     * This method can turn off the Radio. (non-Javadoc)
     * @see com.epam.rd.solid.RadioSwitch#radioTurnOff()
     */
    public void radioTurnOff() {
        System.out.println("Radio is Turned off");
    }
}
