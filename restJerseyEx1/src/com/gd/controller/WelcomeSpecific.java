package com.gd.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("welcomeSp")
public class WelcomeSpecific {

	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hi, this is plain hello";		
	}
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson() {
		return "need to generate json";
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXml() {
		String s = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>"
				+"<hello>this is hello from xml</hello>";
		return s;
	}

}
