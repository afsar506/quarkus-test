package com.github.ligangty.jaxrs;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path( "/test" )
@ApplicationScoped
public class TestResource{

  @Path("/ok")
  @GET
  @Produces( APPLICATION_JSON )
  public Response getOK(){
    return Response.ok("{\"status\":\"ok\"}").build();
  }
}