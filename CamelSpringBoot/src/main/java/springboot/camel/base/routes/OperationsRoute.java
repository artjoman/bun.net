package springboot.camel.base.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springboot.camel.base.processors.CreatePurcaseProcesor;
import springboot.camel.base.processors.CreateUsersProcesor;
import springboot.camel.base.processors.ParameterProcessor;
import springboot.camel.base.processors.QueryPurcaseProcesor;
import springboot.camel.base.processors.QueryUsersProcesor;
import springboot.camel.base.processors.UpdateUsersProcesor;

@Component
public class OperationsRoute extends RouteBuilder {
	
	@Autowired
	ParameterProcessor parameterProcessor;
	
	@Autowired
	private QueryUsersProcesor queryUsersProcesor;
	@Autowired
	private UpdateUsersProcesor updateUsersProcesor;
	@Autowired
	private CreateUsersProcesor createUsersProcesor;
	@Autowired
	private CreatePurcaseProcesor createPurcaseProcesor;
	@Autowired
	private QueryPurcaseProcesor queryPurcaseProcesor;

	@Override
	public void configure() throws Exception {
		
		//localhost:8080/services/hello
		from("cxfrs:bean:rsServer").routeId("REST Operations")
		
        .log("Processing CXF route....http method: ${header.CamelHttpMethod}")
        .log("Processing CXF route....http path: ${header.CamelHttpPath}")
        .log("Processing CXF route....operation name: ${header.operationName}")
        .process(parameterProcessor)
        .removeHeaders("CamelHttp*")
        
        .choice()
        .when(header("operationName").isEqualTo("queryParties"))
        
        .process(queryUsersProcesor)
        .when(header("operationName").isEqualTo("createParty"))
        .process(createUsersProcesor)
        .when(header("operationName").isEqualTo("updateParty"))
        .process(updateUsersProcesor)
        
        .when(header("operationName").isEqualTo("queryPurchase"))
        .process(queryPurcaseProcesor)
        .when(header("operationName").isEqualTo("createPurchase"))
        .process(createPurcaseProcesor);

		
	}

}
