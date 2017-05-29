package springboot.camel.base.controllers;


import javax.websocket.server.PathParam;
import javax.ws.rs.core.Response;

import springboot.camel.base.entities.HelloWorlEntity;
import springboot.camel.base.entities.party.Bun;
import springboot.camel.base.entities.party.Party;

public class HelloWorldApiImpl implements HelloWorldApi {

	@Override
	public Response helloWorldPost(HelloWorlEntity helloWorlEntityRequest) {
		return Response.status(Response.Status.OK).entity(helloWorlEntityRequest).build();
	}

	@Override
	public Response queryParties(@PathParam("id") String Partyid) {
		//return Response.status(Response.Status.OK).entity(id).build();
		return null;
	}

	@Override
	public Response createParty(Party party) {
		return Response.status(Response.Status.CREATED).build();
	}

	@Override
	public Response updateParty(Party party, @PathParam("id") String Partyid) {
		return Response.status(Response.Status.OK).build();
	}

	@Override
	public Response queryPurchase(@PathParam("id") String Partyid) {
		return Response.status(Response.Status.OK).build();
	}

	@Override
	public Response createPurchase(Bun bun, @PathParam("id") String Partyid) {
		return Response.status(Response.Status.CREATED).build();
	}

	@Override
	public Response queryParties() {
		// TODO Auto-generated method stub
		return null;
	}

}
