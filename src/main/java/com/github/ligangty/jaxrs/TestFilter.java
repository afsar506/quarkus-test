package com.github.ligangty.jaxrs;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@ApplicationScoped
@Provider
public class TestFilter implements ContainerResponseFilter{
  @Override
  public void filter( ContainerRequestContext requestContext, ContainerResponseContext responseContext )
          throws IOException
  {
    String reqApiVersion = requestContext.getHeaderString( "Test-API-version" );
    responseContext.getHeaders().add( "Test-API-version", reqApiVersion );
  }
}