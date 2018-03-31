/**
 * This package has implementation of Interface segregation design principle.
 */
package com.epam.rd.solid;

/**
 * The RadioSwitch is an interface, It has two abstract methods.
 * @author Krishnakanth Yachareni
 */
public interface RadioSwitch {
    /**
     * Radio turn on.
     */
    void radioTurnOn();

    /**
     * Radio turn off.
     */
    void radioTurnOff();
}
