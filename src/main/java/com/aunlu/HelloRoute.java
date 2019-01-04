package com.aunlu;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@ContextName("test")
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("undertow:http://0.0.0.0:8080/hello").bean("helloBean");
    }
}
