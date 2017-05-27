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
import springboot.camel.base.entities.party.Bun;
import springboot.camel.base.entities.party.BunList;
import springboot.camel.base.entities.party.Party;
import springboot.camel.base.entities.party.PartyList;
import springboot.camel.base.utils.ParseUtils;

@Component
public class QueryPurcaseProcesor implements Processor {
	
	@Autowired
	ParseUtils parseUtils;
	
	private static final Logger logger = Logger.getLogger(QueryPurcaseProcesor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		 String partyId =  exchange.getIn().getHeader("id", String.class);
		
		 BunList response = new BunList();
		 List<Bun> buns = new ArrayList<Bun>();
			Bun bun = new Bun();
			bun.setLocation("aa");
			bun.setPartyId(partyId);
			bun.setProductType("Bulcina");
			
			buns.add(bun);
			response.setBunList(buns);
			
			exchange.getIn().setBody(response);
		}
		
		
	}


