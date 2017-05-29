package springboot.camel.base.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import springboot.camel.base.entities.HelloResp;
import springboot.camel.base.entities.HelloWorlEntity;

@Component
public class HelloWorldProcessor implements Processor {
	
	private static final Logger logger = Logger.getLogger(HelloWorldProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		HelloResp response = new HelloResp(); 
		
		HelloWorlEntity input = exchange.getIn().getBody(HelloWorlEntity.class);
		
		logger.info("Input: "+input.toString());
		
		response.setNumber(input.getName()+input.getSurname());
		logger.info("Output: "+response.toString());
		exchange.getIn().setBody(response);
	}

}
