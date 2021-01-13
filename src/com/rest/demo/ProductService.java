package com.rest.demo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/products")
	public class ProductService 
	{

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Product> listall()
	    {
	        return new ProductDAO().getAllProducts();
	        
	    }
	    
	    @GET
	    @Path("{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Product> listById(@PathParam("id") String pid) 
	    {
	        System.out.println("from request "+pid);
	        return new ProductDAO().getProductByID(pid);
	        
	    }
	    
	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    public Response addProduct(Product product) throws URISyntaxException
	    {
	        System.out.println("Product Came into WS "+product.getProdId());
	        String prodid=product.getProdId();
	        boolean result = new ProductDAO().addProduct(product);
	        URI uri=new URI("/products/"+prodid);
	        return Response.created(uri).build();
	    }

	 

	}

