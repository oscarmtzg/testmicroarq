package com.bs.proteo.microservices.mx.microarqtest;

import com.bs.proteo.microservices.architecture.core.MicroserviceApplication;

/**
 * @author BS
 * 
 * TODO, This is a main class of your Microservice.
 * 
 * TODO, Proteo4 Microservices development guide
 */
public class MicroArqTestApp extends MicroserviceApplication {
	/**
	 * Main method of MicroArqTest.
	 * @param args type of String[]
	 */
	public static void main(String[] args) {
		startMicroservice(MicroArqTestApp.class, args);
		logger.info("MicroArqTestApp started very well!");
	}
}
