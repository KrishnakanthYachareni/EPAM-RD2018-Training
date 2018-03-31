/**
 * This package has implementation of Interface segregation design principle.
 */
package com.epam.rd.solid;

/**
 * @author Krishnakanth Yachareni
 *
 */
public final class IspDemo {
    /**
     * Default constructor.
     */
    private IspDemo() {
    }

    /**
     * @param args
     *            String array.
     */
    public static void main(final String[] args) {
        /*
         * Car instance.
         */
        Car car = new Car("Car");
        // Engine status before starting
        System.out.println(car.getVehicleStatus());
        // Engine Started.
        car.engineStart();
        // Engine status after starting
        System.out.println(car.getVehicleStatus());
        // Radio on
        car.radioTurnOn();
        // Radio off
        car.radioTurnOff();
        // Engine stop
        car.engineStop();
        // Engine status after stopping.
        System.out.println(car.getVehicleStatus());
        /*
         * Drone instance
         */
        Drone drone = new Drone("Drone");
        // Engine status before starting
        System.out.println(drone.getVehicleStatus());
        // Engine started.
        drone.engineStart();
        // Engine status after starting
        System.out.println(drone.getVehicleStatus());
        // camera turned on
        drone.cameraTurnOn();
        // camera turned off
        drone.cameraTurnOff();
        // Engine stopped
        drone.engineStop();
        // Engine status after stopping.
        System.out.println(drone.getVehicleStatus());

    }

}
