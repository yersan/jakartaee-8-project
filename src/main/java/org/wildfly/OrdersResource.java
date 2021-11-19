package org.wildfly;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("orders")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class OrdersResource {

    @EJB
    OrderService orderService;

    @GET
    public Response message() {
        return Response.ok("Hello").build();
    }

    @POST
    public Response createOrder(Order order) {
        orderService.createOrder(order);

        return Response.status(Response.Status.OK).build();
    }
}
