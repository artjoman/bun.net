package springboot.camel.base.controllers;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.PATCH;

import springboot.camel.base.entities.HelloWorlEntity;
import springboot.camel.base.entities.party.Bun;
import springboot.camel.base.entities.party.Party;

@Path("/")
public interface HelloWorldApi {
	
	 @POST
	    @Path("/hello/world")
	    
	    @Produces({ "application/json" })
	    public Response helloWorldPost(HelloWorlEntity helloWorlEntityRequest);
	 
	 
	 /**
	  * User operations
	  * **/
	 
	 @GET
	    @Path("/party/{id}")	    
	    @Produces({ "application/json" })
	    public Response queryParties(@PathParam("id") String Partyid);
	 
	 @GET
	    @Path("/party")	    
	    @Produces({ "application/json" })
	    public Response queryParties();
	 
	 @POST
	    @Path("/party")
	    
	    @Produces({ "application/json" })
	    public Response createParty(Party party);
	 
	 @POST
	    @Path("/party/{id}")
	    
	    @Produces({ "application/json" })
	    public Response updateParty(Party pary, @PathParam("id") String Partyid);
	 
	 /**
	  * product operations
	  * **/
	 
	 @GET
	    @Path("/party/{id}/bun")
	    
	    @Produces({ "application/json" })
	    public Response queryPurchase(@PathParam("id") String Partyid);
	 
	 @POST
	    @Path("/party/{id}/bun")
	    
	    @Produces({ "application/json" })
	    public Response createPurchase(Bun Bun, @PathParam("id") String Partyid);
}
