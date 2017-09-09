/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Menja
 */
public class HardCodeData {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void main(String[] args) {
        runEntityManager();
        insertBasicData();
    }

    //Hardcoded data to DB
    public static void runEntityManager() {
        emf = Persistence.createEntityManagerFactory("pu");
    }

    public static void insertBasicData() {
        em = emf.createEntityManager();

        em.getTransaction().begin();
        Person person = new Person();
        person.setFirstname("Lilly");
        person.setLastname("Laursen");
        person.setPhone("23875643");
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }
}
