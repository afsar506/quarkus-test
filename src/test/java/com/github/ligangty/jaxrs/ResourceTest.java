package com.github.ligangty.jaxrs;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static javax.ws.rs.core.Response.Status.OK;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ResourceTest
{
    @Test
    public void testGetOk(){
        given().when()
               .get( "/test/ok" )
               .then()
               .statusCode( OK.getStatusCode() )
               .contentType( MediaType.APPLICATION_JSON )
               .body( "status", is( "ok" ));
    }
}