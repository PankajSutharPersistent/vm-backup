package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tienda.bean.Order;
import com.tienda.service.TiendaService;
import com.tienda.util.OrderNotFoundException;

public class OrderResource {
	
	
	@GET
	@Path("{ord-number}")
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Order fetchOrderDetailsForUser(@PathParam("username") String username,@PathParam("ord-number") String ordernumber) throws OrderNotFoundException{
		
		Order order;
		return order=new TiendaService().getOrderDetailsForUser(username, ordernumber);
	}
	  
	@GET
	public Set<Order> fetchAllOrdersForUser(@PathParam("username") String username){
		
		Set<Order> orders;
		orders=new TiendaService().getAllOrdersForUser(username);
		return orders;
		
		
		
	}
	
	
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response createOrder(Order order) throws URISyntaxException{
		
		
		System.out.println(order.getOrderedBy().getUsername() );
		return Response.created(new URI("http://localhost:8080/tienda/users/ophelia/orders/333")).build();
		
	}

}