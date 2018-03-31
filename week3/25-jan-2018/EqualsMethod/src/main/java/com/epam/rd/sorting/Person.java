/**
 * overriding equals method and then compare two objects.
 */
package com.epam.rd.sorting;

/**
 * @author Krishnakanth Yachareni
 * @since 24-01-2018
 */
class Person {
    /**
     * Person name.
     */
    private double salary;
    /**
     * Person age.
     */
    private double age;

    /**
     * Parameterized constructor.
     * @param pSalary
     *            salary
     * @param pAge
     *            age
     */
    Person(final double pSalary, final double pAge) {
        this.salary = pSalary;
        this.age = pAge;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }

        /*
         * Check if o is an instance of Person or not "null instanceof [type]"
         * also returns false
         */
        if (!(obj instanceof Person)) {
            return false;
        }

        Person c = (Person) obj;

        // Compare the data members and return accordingly
        return Double.compare(salary, c.salary) == 0
                && Double.compare(age, c.age) == 0;
    }

}
