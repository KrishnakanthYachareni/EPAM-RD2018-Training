/**
 * This is a Simple JPA example.
 */
package com.epam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class is a Student bean class. We are mapping this class object to entity.
 * 
 * @author Krishnakanth_Yachare
 *
 */
@Entity
public class Student {

    /**
     * It is an Student roll Number as a primary key.
     */
    @Id
    @Column
    private int rollNumber;

    @Column
    private String name;

    @Column
    private String grade;

    /**
     * @return student roll number
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * @param rollNumber
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
