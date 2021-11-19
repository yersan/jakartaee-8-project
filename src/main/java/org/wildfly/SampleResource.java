package org.wildfly;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("orders")
@Stateless
public class SampleResource {

    @GET
    public Response message() {
        return Response.ok("Hello").build();
    }

}
