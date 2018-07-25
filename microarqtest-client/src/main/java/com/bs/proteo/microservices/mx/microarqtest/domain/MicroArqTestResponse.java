package com.bs.proteo.microservices.mx.microarqtest.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author BS
 * 
 * TODO, This is a microservice response, it can be 
 * your model entity
 * 
 * TODO, Proteo4 Microservices development guide
 */
public class MicroArqTestResponse {
	private String output;

	@JsonCreator
	public MicroArqTestResponse(@JsonProperty("output") String output) {
		this.output = output;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
}
