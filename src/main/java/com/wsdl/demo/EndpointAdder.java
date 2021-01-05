package com.wsdl.demo;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EndpointAdder {
    @PayloadRoot(namespace = "http://localhost/services", localPart = "Request")
    @ResponsePayload
    public Response responseAdder(@RequestPayload Request requestAdder) {
        Response response = new Response();
        response.setResult("Hello " + requestAdder.getName());
        return response;
    }
}
