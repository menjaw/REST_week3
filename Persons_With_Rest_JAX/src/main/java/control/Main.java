/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Entity.Person;
import domain.Facade;

/**
 *
 * @author Menja
 */
public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.addPerson(new Person(null, "New firstname", "New Lastname", "12343567"));
    }

}
