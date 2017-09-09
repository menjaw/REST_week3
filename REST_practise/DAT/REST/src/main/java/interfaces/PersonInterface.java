/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Person;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Menja
 */
public interface PersonInterface {

    public void addEntityManagerFactory(EntityManagerFactory emf);

    public Person getBook(int id);

    public Person addBook(Person book);

    public Person deleteBook(int id);

    public Person editBook(Person book);

    public List<Person> getBooks();
}
