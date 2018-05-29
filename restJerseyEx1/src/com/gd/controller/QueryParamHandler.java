package com.gd.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/login")
public class QueryParamHandler {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Provide login & password";		
	}
	
	//method overridding is not possible as below
	/*
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(@QueryParam("name") String name) {
		return "Provide password as well";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(@QueryParam("name") String name, @QueryParam("pw") String password) {
		return "Login validated";
	}
	 */
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson() {
		return "need to generate json";
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXml(@QueryParam("name") String name, @QueryParam("pw") String password) {
		String s = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>"
				+"<hello>name is "+ name + " password is " + password +"</hello>";
		return s;
	}

}
