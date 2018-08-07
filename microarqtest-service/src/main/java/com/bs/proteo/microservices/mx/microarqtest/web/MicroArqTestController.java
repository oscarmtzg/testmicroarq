package com.bs.proteo.microservices.mx.microarqtest.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bs.proteo.microservices.architecture.core.MicroserviceController;
import com.bs.proteo.microservices.architecture.core.log.MicroserviceLogger;
import com.bs.proteo.microservices.architecture.core.log.MicroserviceLoggerFactory;
import com.bs.proteo.microservices.architecture.core.messages.MicroserviceRequest;
import com.bs.proteo.microservices.architecture.core.messages.MicroserviceResponse;
import com.bs.proteo.microservices.mx.microarqtest.domain.MicroArqTestRequest;
import com.bs.proteo.microservices.mx.microarqtest.domain.MicroArqTestResponse;
import com.bs.proteo.microservices.mx.microarqtest.service.MicroArqTestService;

/**
 * @author BS
 *
 * TODO, This is a controller of your Microservice,
 * it has two GET and two POST methods.
 * 
 * TODO, Proteo4 Microservices development guide
 */
@MicroserviceController
public class MicroArqTestController implements MicroArqTestService {

	private MicroserviceLogger logger = MicroserviceLoggerFactory.getLogger(this.getClass());
	
	private String messageProperty = "Operation 1.";

	public String operation1() {
		if(logger.isInfoEnabled()) {
			logger.info("Operation 1 invoked");
		}
		return "Some dummy modified string : " + messageProperty;
	}

	public MicroArqTestResponse operation2(@PathVariable("param") String inputParam) {
		if(logger.isInfoEnabled()) {
			logger.info("Operation 2 invoked");
		}
		return new MicroArqTestResponse(inputParam);
	}

	public MicroserviceResponse<MicroArqTestResponse> operation3(@RequestBody MicroserviceRequest<MicroArqTestRequest> inputObject) {
		if(logger.isInfoEnabled()) {
			logger.info("Operation 3 invoked");
		}
		return new MicroserviceResponse<MicroArqTestResponse>(new MicroArqTestResponse(inputObject.getBody().getInput()));
	}
	
	public MicroArqTestResponse operation4(@RequestBody MicroArqTestRequest inputObject) {
		if(logger.isInfoEnabled()) {
			logger.info("Operation 4 invoked");
		}
		return new MicroArqTestResponse(inputObject.getInput());
	}
}
