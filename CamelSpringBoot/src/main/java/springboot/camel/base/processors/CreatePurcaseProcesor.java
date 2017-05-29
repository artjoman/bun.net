package springboot.camel.base.processors;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import springboot.camel.base.entities.HelloResp;
import springboot.camel.base.entities.HelloWorlEntity;
import springboot.camel.base.entities.party.Bun;
import springboot.camel.base.entities.party.Party;
import springboot.camel.base.entities.party.PartyList;

@Component
public class CreatePurcaseProcesor implements Processor {
	
	private static final Logger logger = Logger.getLogger(CreatePurcaseProcesor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		Bun input = exchange.getIn().getBody(Bun.class);
		
		logger.debug(input.toString());
		
		exchange.getIn().setBody(Response.status(Response.Status.CREATED).build());
		
		
	}

}
