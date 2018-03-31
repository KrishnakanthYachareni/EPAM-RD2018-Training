/**
 * This is jpa-crud operation example
 */
package com.jpa.relationship;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Krishnakanth_Yachare
 *
 */
@Entity
public class Department {

    /**
     * Department id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Department name.
     */
    private String name;

    /**
     * One to many relationship one department can holds the multiple persons.
     */
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Person> persons = new HashSet<Person>();

    /**
     * @return Department id.
     */
    public long getId() {
        return id;
    }

    /**
     * @param id set the Department id.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return department name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name set the depeartment name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return List of {@link Person}.
     */
    public Set<Person> getPersons() {
        return persons;
    }

    /**
     * @param persons
     */
    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.persons);
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
        final Department other = (Department) obj;
        return Objects.equals(this.id, other.id) && Objects.equals(this.name, other.name)
                && Objects.equals(this.persons, other.persons);
    }


}
