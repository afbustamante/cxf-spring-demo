package net.andresbustamante.example.common.config;

import net.andresbustamante.example.users.webservices.UsersManagementWebService;
import net.andresbustamante.example.users.webservices.impl.UsersManagementWebServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServicesConfig {

    @Autowired
    private Bus springBus;

    @Bean
    public UsersManagementWebService usersManagementWebService() {
        return new UsersManagementWebServiceImpl();
    }

    @Bean
    public EndpointImpl usersManagementEndpoint() {
        String serviceName = "users_management";
        EndpointImpl endpoint = new EndpointImpl(springBus, usersManagementWebService());
        endpoint.setAddress("/" + serviceName);
        endpoint.publish("/" + serviceName);
        endpoint.setWsdlLocation("wsdl/" + serviceName + ".wsdl");
        endpoint.getProperties().put("schema-validation-enabled", true); // Active la validation du flux XML
        return endpoint;
    }

}
