package springboot.camel.base.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.Message;
import org.springframework.stereotype.Component;

import com.google.common.base.Splitter;

@Component
public class ParameterProcessor implements Processor { 
    @Override 
    public void process(Exchange exchange) throws Exception { 

    	Message cxfMessage = exchange.getIn().getHeader(CxfConstants.CAMEL_CXF_MESSAGE, Message.class);
    	Map<String, String> stringStringMap =  (Map<String, String>) cxfMessage.getExchange().getInMessage().get("jaxrs.template.parameters"); 

        for (Map.Entry<String, String> eachParamEntry : stringStringMap.entrySet()) { 
            exchange.getIn().setHeader(eachParamEntry.getKey(), eachParamEntry.getValue()); 
        } 
    } 

}
