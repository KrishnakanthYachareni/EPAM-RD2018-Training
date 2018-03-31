/**
 * This package has simple example of Dependency Inversion Principle.
 */
package com.epam.dipriniciple;

/**
 * @author Krishnakanth_Yachare
 */
public class NormalCar implements Vehicle {

    /**
     * Remaining fuel can hold.
     */
    private int remainingFuel;
    /**
     * vehicle speed.
     */
    private int speed;

    /**
     * This constructor can initialize the fuel and speed.
     * @param maxFuel
     *            Maximum fuel.
     */
    public NormalCar(final int maxFuel) {
        remainingFuel = maxFuel;
        this.speed = 0;
    }

    /**
     * @see com.epam.dipriniciple.Vehicle#accelerate()
     */
    public void accelerate() {
        remainingFuel--;
        speed += 10;
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
