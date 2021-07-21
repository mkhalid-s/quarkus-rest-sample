package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws UnknownHostException {
        return "Hello RESTEasy from host: "
                + InetAddress.getLocalHost().getHostName()
                + " and IP: "+InetAddress.getLocalHost().getHostAddress();
    }
}