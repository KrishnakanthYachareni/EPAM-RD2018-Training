/**
 * This is jpa-crud operation example
 */
package com.jpa.relationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Krishnakanth_Yachare
 *
 */
public enum PersistenceManager {

    /**
     * 
     */
    INSTANCE;

    /**
     * 
     */
    private EntityManagerFactory emFactory;

    /**
     * This can create the Entity Manager Factory.
     */
    private PersistenceManager() {

        // "jpa-example" was the value of the name attribute of the

        // persistence-unit element.

        emFactory = Persistence.createEntityManagerFactory("TestPersistence");

    }

    /**
     * This method can create the {@link EntityManager} and then it can return it.
     * 
     * @return {@link EntityManager}
     */
    public EntityManager getEntityManager() {

        return emFactory.createEntityManager();
    }

    /**
     * It can close the entitymanager.
     */
    public void close() {
        emFactory.close();

    }

}
