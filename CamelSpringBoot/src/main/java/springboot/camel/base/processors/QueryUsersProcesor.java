package springboot.camel.base.processors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springboot.camel.base.entities.HelloResp;
import springboot.camel.base.entities.HelloWorlEntity;
import springboot.camel.base.entities.party.Party;
import springboot.camel.base.entities.party.PartyList;
import springboot.camel.base.utils.ParseUtils;

@Component
public class QueryUsersProcesor implements Processor {
	
	@Autowired
	ParseUtils parseUtils;
	
	private static final Logger logger = Logger.getLogger(QueryUsersProcesor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		 String partyId =  exchange.getIn().getHeader("id", String.class);
		
		if(partyId!=null && !partyId.isEmpty()){
			Party party = new Party();
			party.setPartyId(partyId);
			party.setEmail("test@test.dev");
			party.setPartyName("testParty");
			
			exchange.getIn().setBody(party);
		}else{
			PartyList response = new PartyList(); 
			
			List<Party> parties = new ArrayList<Party>();
			
			Party party = new Party();
			party.setEmail("test@test.dev");
			party.setPartyName("testParty");
			
			parties.add(party);
			
			response.setPartyList(parties);
			
			exchange.getIn().setBody(response);
		}
		
		
	}

}
