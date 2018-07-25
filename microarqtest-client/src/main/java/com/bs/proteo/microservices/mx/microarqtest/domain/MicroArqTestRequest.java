package com.bs.proteo.microservices.mx.microarqtest.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author BS
 * 
 * TODO, This is a microservice request,it can be 
 * your model entity
 * 
 * TODO, Proteo4 Microservices development guide
 */
public class MicroArqTestRequest {

	private String input;

	@JsonCreator
	public MicroArqTestRequest(@JsonProperty("input") String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
}
