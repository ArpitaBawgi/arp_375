package com.arpita.pojoclass;

import java.util.Map;

import javax.websocket.server.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/zipcodes")
public class Resource {

	@Path("{zip}")

	@POST

	@Produces(MediaType.APPLICATION_JSON)
	public UserInfo getAllInfo(@FormParam("zip") int zip1) {
		UserDAO dao = new UserDAO();

		for (Map.Entry<Integer, UserInfo> entry : dao.getAllInfo().entrySet()) {

			System.out.println(zip1 + " " + entry.getKey() + "  " + entry.getValue());
			if (zip1 == entry.getKey()) {
				System.out.println(entry.getKey());
				return entry.getValue();

			}
		}
		return null;
	}
}

/* This is to written in the form method */
// @Path//("{zip}")

/*
 * @POST
 * 
 * @Produces(MediaType.APPLICATION_JSON)
 * 
 * public UserInfo getAllInfo(@FormParam("zip") int zip1) { UserDAO dao = new
 * UserDAO();
 * 
 * for (Map.Entry<Integer, UserInfo> entry : dao.getAllInfo().entrySet()) {
 * 
 * 
 * if (zip1 == entry.getKey()) { System.out.println(entry.getKey()); return
 * entry.getValue(); } }
 * 
 * return null; } }
 */