/**
 * This is jpa-crud operation example
 */
package com.jpa.relationship;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Krishnakanth_Yachare
 *
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    /**
     * Many To one
     */
    @ManyToOne(cascade = CascadeType.ALL)
    private Department department;

    /**
     * Default constructor
     */
    public Person() {
        // Nothing to do.
    }

    /**
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return
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
     * @return
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.department);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.id, other.id) && Objects.equals(this.name, other.name)
                && Objects.equals(this.department, other.department);
    }



}
