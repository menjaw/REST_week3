/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.websen.persons_with_rest_jax;

import Entity.Person;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import domain.Facade;
import interfaces.PersonInterface;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Menja
 */
@Path("persons")
public class PersonResource {

    private PersonInterface facade = new Facade();
    private Gson gson = new com.google.gson.Gson();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PersonResource
     */
    public PersonResource() {
        facade.addEntityManagerFactory(Persistence.createEntityManagerFactory("pu"));
    }

    /**
     * Retrieves representation of an instance of
     * eu.websen.persons_with_rest_jax.PersonResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of PersonResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void postPerson(String content) {
        JsonObject job = gson.fromJson(content, JsonObject.class);

        Person p = new Person();

        p.setFirstname(job.get("fname").getAsString());
        p.setLastname(job.get("lname").getAsString());
        p.setPhone(job.get("phone").getAsString());
        facade.addPerson(p);
    }

}
