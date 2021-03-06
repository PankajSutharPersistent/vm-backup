package com.tienda.resource;

import java.util.HashSet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.glassfish.jersey.model.internal.RankedComparator.Order;

import com.tienda.bean.ExceptionMessage;
import com.tienda.bean.Link;
import com.tienda.bean.User;
import com.tienda.service.TiendaService;
import com.tienda.util.OrderStatus;
import com.tienda.util.UserNotFoundException;

@Path("/users")
public class UserResource { //resource class

	@Context // dependency injection 
	private ResourceContext resourceContext;
	
	@Context
	private UriInfo uriInfo;
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) //MIME TYPE
	@Path("{uname}")
	public User fetchUserDetail(@PathParam("uname") String username) throws UserNotFoundException{ // resource method
		User user;
		user=new TiendaService().getUserDetails(username);
		user.setLinks(new HashSet<Link>());
		UriBuilder baseBuilder=uriInfo.getBaseUriBuilder();
		baseBuilder.path(UserResource.class);
		baseBuilder.path(UserResource.class, "getSubResource").resolveTemplate("username", username);
		
		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate()).resolveTemplate("sub-resource-name", "orders").build().toString(), "collection", String.format("%s,%s",MediaType.APPLICATION_JSON,MediaType.APPLICATION_ATOM_XML)));
		
		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate()).resolveTemplate("sub-resource-name", "wishlist").build().toString(), "current", String.format("%s,%s",MediaType.APPLICATION_JSON,MediaType.APPLICATION_ATOM_XML)));

		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate()).resolveTemplate("sub-resource-name", "orders").replaceQueryParam("status", OrderStatus.ACTIVE).build().toString(), "collection", String.format("%s,%s",MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML)));

		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate()).resolveTemplate("sub-resource-name", "orders").replaceQueryParam("status", OrderStatus.CANCELED).build().toString(), "collection", String.format("%s,%s",MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML)));

		return user;
	}
	
@Path("/{username}/{sub-resource-name}")
	public Object getSubResource(@PathParam("sub-resource-name") String subResourceName){//sub-resource locator
		
	if("orders".equals(subResourceName))
	{
		return resourceContext.getResource(OrderResource.class);
	}
	else if ("wishlist".equals(subResourceName)) {
		return resourceContext.getResource(WishList.class);
	}
		
		
		throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity(new ExceptionMessage(String.format("Resource '%s' not found", subResourceName))).build());
		
	} 
}
