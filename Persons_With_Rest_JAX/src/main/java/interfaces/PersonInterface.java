/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Menja
 */
public interface PersonInterface {

    public void addEntityManagerFactory(EntityManagerFactory emf);
    public EntityManager getEntityManager();

    public Person addPerson(Person p);

    public Person deletePerson(Person p);

    public Person getPerson(Person p);

    public List<Person> getPersons();

    public Person editPerson(Person p);
}
