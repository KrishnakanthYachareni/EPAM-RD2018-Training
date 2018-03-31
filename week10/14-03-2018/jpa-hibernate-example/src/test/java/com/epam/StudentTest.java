/**
 * This is a Simple JPA example.
 */
package com.epam;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * This is a test case for Student.It can map the student object to entity in MySQL.
 * 
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class StudentTest {

    /**
     * {@link EntityManagerFactory}
     */
    private EntityManagerFactory entityManagerFactory;

    /**
     * {@link EntityManager}
     */
    private EntityManager entityManager;

    /**
     * Injecting to {@link Student} class.
     */
    @InjectMocks
    Student student;

    @Before
    public void setUp() {
        /*
         * Here "TestPersistence" is a persistence-unit name in persistence.xml
         */
        entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
        entityManagerFactory.createEntityManager();
    }

    @Test
    public void insertTest() {

        student.setRollNumber(529);
        student.setName("Krishnakanth Yachareni");
        student.setGrade("A");

        entityManager.getTransaction().begin();

        entityManager.persist(student);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
