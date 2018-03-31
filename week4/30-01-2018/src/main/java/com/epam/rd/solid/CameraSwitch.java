/**
 * This package has implementation of Interface segregation design principle.
 */
package com.epam.rd.solid;

/**
 * The CameraSwitch is has two abstract methods that is camera turn on or off.
 * @author Krishnakanth_Yachareni
 */
public interface CameraSwitch {
    /**
     * Camera switch turn on.
     */
    void cameraTurnOn();

    /**
     * camera switch turn off.
     */
    void cameraTurnOff();
}
