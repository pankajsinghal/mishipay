package com.mishipay.controller;

import com.google.gson.Gson;
import com.mishipay.service.Service;
import com.mishipay.service.pojo.LineItems;
import com.mishipay.service.pojo.response.order.OrderResponse;
import com.mishipay.utils.NetworkCommunicationException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

@Component
@Path("/mishipay")
public class Controller {
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);
	@Autowired
	private Service service;

    @Path("/inventory")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response submit(@Context ContainerRequestContext requestContext
	) {

		String res;
		try {
			res = service.getInventory();
		} catch (NetworkCommunicationException e) {
			e.printStackTrace();
			res = "error";
		}
		return Response.status(Status.OK).entity(res).build();
	}

    @Path("/order")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.WILDCARD)
	public Response get(@Context ContainerRequestContext requestContext
			, List<LineItems> items
	) {
		String orderResponse = service.placeOrder(items);

		return Response.status(Status.OK).entity(orderResponse).build();
	}

}
