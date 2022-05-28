package com.iasri.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {
	@WebMethod
 public String greeting(String name){
	 return "Greetings, "+name;
 }
}
