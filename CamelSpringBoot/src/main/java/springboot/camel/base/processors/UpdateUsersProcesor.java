package springboot.camel.base.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import springboot.camel.base.entities.HelloResp;
import springboot.camel.base.entities.HelloWorlEntity;
import springboot.camel.base.entities.party.Party;
import springboot.camel.base.entities.party.PartyList;

@Component
public class UpdateUsersProcesor implements Processor {
	
	private static final Logger logger = Logger.getLogger(UpdateUsersProcesor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
Party input = exchange.getIn().getBody(Party.class);
		
		logger.debug(input.toString());
	}

}
