/**
 * This package has simple example of Dependency Inversion Principle.
 */
package com.epam.dipriniciple;

/**
 * @author Krishnakanth_Yachare
 */
public class RacingCar implements Vehicle {

    /**
     * Vehicle remainingFuel.
     */
    private int remainingFuel;
    /**
     * Vehicle speed.
     */
    private int speed;

    /**
     * This constructor can initialize the fuel and speed.
     * @param maxFuel
     *            Maximum fuel.
     */
    public RacingCar(final int maxFuel) {
        remainingFuel = maxFuel;
        this.speed = 0;
    }

    /**
     * (non-Javadoc).
     * @see com.epam.dipriniciple.Vehicle#accelerate()
     */
    public void accelerate() {
        remainingFuel -= 2;
        speed += 20;
    }

    /**
     * (non-Javadoc).
     * @see com.epam.dipriniciple.Vehicle#getFuel()
     * @return remainingFuel
     */
    public int getFuel() {
        return remainingFuel;
    }

    /**
     * (non-Javadoc).
     * @see com.epam.dipriniciple.Vehicle#getSpeed()
     * @return speed.
     */
    public int getSpeed() {
        return speed;
    }
}
