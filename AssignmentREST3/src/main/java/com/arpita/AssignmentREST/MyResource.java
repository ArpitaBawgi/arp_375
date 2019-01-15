package com.arpita.AssignmentREST;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arpita.pojoclass.UserDAO;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("")
public class MyResource {

   UserDAO dao=new UserDAO();
	
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        return "Got it!";
    }
}
