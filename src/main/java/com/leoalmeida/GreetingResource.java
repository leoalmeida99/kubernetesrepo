package com.leoalmeida;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private static int requisicao = 0;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.err.println("teste");
        System.out.println("teste");
        
        return "Hello World number V2 " + requisicao++;
    }
}
