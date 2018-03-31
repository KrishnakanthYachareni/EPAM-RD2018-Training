/**
 * This application can create 5 persons objects and store its in a file and
 * then read the objects from the file using serialization.
 */
package com.epam.rd.persistentfiles;

import java.io.Serializable;

/**
 * The Employee class implements Serializable interface. This class has some
 * person attributes.
 * @author Krishnakanth Yachareni
 * @since 25-01-2018
 */
public class Employee implements Serializable {
    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Employee Name.
     */
    private String empName;
    /**
     * Employee Age.
     */
    private int empAge;
    /**
     * Employee Address.
     */
    private String empAddress;

    /**
     * Employee constructor.
     * @param name
     *            name
     * @param age
     *            age
     * @param address
     *            address
     */
    public Employee(final String name, final int age, final String address) {
        this.empName = name;
        this.empAge = age;
        this.empAddress = address;
    }

    /**
     * @return employee name.
     */
    public final String getEmpName() {
        return empName;
    }

    /**
     * @return Employee age.
     */
    public final int getEmpAge() {
        return empAge;
    }

    /**
     * @return Employee Address.
     */
    public final String getEmpAddress() {
        return empAddress;
    }

    @Override
    public final String toString() {
        return "Name: " + empName + ", Age: " + empAge + ", Address: "
                + empAddress;
    }

}
