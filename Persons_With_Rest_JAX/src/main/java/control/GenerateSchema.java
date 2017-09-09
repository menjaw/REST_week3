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
public class GenerateSchema {

    public static void main(String[] args) {

        generateSchema();
//        runEntityManager();
        //insertBasicData();
    }

    //METHODS
    public static void generateSchema() {
        Persistence.generateSchema("pu", null);
    }

}
