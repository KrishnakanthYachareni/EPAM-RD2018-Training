/**
 * This is jpa-crud operation example
 */
package com.jpa.relationship;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import javax.persistence.EntityManager;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonTest {

    @InjectMocks
    Department department;

    @Test
    public void insertTest() {
        department.setName("EPAM");

        Person person1 = new Person("Krishnakanth");
        Person person2 = new Person("Ayush Srivastava");

        department.getPersons().add(person1);
        department.getPersons().add(person2);

        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();

        em.getTransaction().begin();

        em.persist(department);

        em.getTransaction().commit();

        em.close();
    }
}
