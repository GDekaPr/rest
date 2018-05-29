package com.gd.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/welcome")
public class WelcomeGeneric {		//simple rest controller to handle /welcome request. even the controller has 3 specific method to return diff. output, only first method will be executed each time as there is no specific arguement mentioned to handle a req. see other controller for more details
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		System.out.println("getting req.");
		return "Hi, this is plain hello";		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson() {
		System.out.println("getting req.");
		return "";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXml() {
		System.out.println("getting req.");
		String s = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>"
				+"<hello>this is hello from xml</hello>";
		return s;
	}

}
