/**
 * This is Example of DataInputStream and DataOutputStream
 */
package com.epam.rd.datastreams;

/**
 * The Student class is a dao. It has some attributes of Student.
 * @author Krishnakanth Yachareni.
 * @since 25-01-2018
 *
 */
public class Student {
    /**
     * name of student.
     */
    private String name;
    /**
     * gender of student.
     */
    private boolean gender; // true is male, false is female
    /**
     * age of student.
     */
    private int age;
    /**
     * grade of student.
     */
    private float grade;

    /**
     * @param sName
     *            name
     * @param sGender
     *            gender
     * @param sAge
     *            age
     * @param sGrade
     *            grade
     */
    public Student(final String sName, final boolean sGender, final int sAge,
            final float sGrade) {
        this.name = sName;
        this.gender = sGender;
        this.age = sAge;
        this.grade = sGrade;
    }

    /**
     * @return name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param sName
     *            set name
     */
    public final void setName(final String sName) {
        this.name = sName;
    }

    /**
     * @return gender
     */
    public final boolean isGender() {
        return gender;
    }

    /**
     * @param sGender
     *            set gender.
     */
    public final void setGender(final boolean sGender) {
        this.gender = sGender;
    }

    /**
     * @return age
     */
    public final int getAge() {
        return age;
    }

    /**
     * @param sAge
     *            age
     */
    public final void setAge(final int sAge) {
        this.age = sAge;
    }

    /**
     * @return grade
     */
    public final float getGrade() {
        return grade;
    }

    /**
     * @param sGrade
     *            grade
     */
    public final void setGrade(final float sGrade) {
        this.grade = sGrade;
    }
}
