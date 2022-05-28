package com.iasri.ws;

import javax.xml.ws.Endpoint;

public class WebserviceServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bindingURI="http://localhost:9089/hellows";
		Hello helloService=new Hello();
		Endpoint.publish(bindingURI, helloService);
		
		System.out.println("Webservice Server Started ..... ! " + bindingURI);

	}

}
