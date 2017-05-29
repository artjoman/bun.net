package springboot.camel.base.config;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import springboot.camel.base.controllers.HelloWorldApiImpl;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.spring.JaxRsConfig;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(JaxRsConfig.class)
public class BaseConfig {
	
	@Bean
    public ServletRegistrationBean servletRegistrationBean(ApplicationContext context) {
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
    }
    
    @Bean
    public JAXRSServerFactoryBean rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setServiceBeanObjects(new HelloWorldApiImpl());
        endpoint.setAddress("/test");
        JacksonJsonProvider jacksonProvider = new JacksonJsonProvider();
        jacksonProvider.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS , false);
        endpoint.setProvider(jacksonProvider);
        return endpoint;
    }

}
