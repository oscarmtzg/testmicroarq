package com.bs.proteo.microservices.mx.microarqtest.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bs.proteo.microservices.architecture.core.MicroserviceConstants;
import com.bs.proteo.microservices.architecture.core.messages.MicroserviceRequest;
import com.bs.proteo.microservices.architecture.core.messages.MicroserviceResponse;
import com.bs.proteo.microservices.mx.microarqtest.domain.MicroArqTestRequest;
import com.bs.proteo.microservices.mx.microarqtest.domain.MicroArqTestResponse;

/**
 * @author BS
 *
 * TODO, This is a service of your microservice and it's
 * impemented on a controller.
 * 
 * TODO, Proteo4 Microservices development guide
 */
public interface MicroArqTestService extends MicroArqTestPublicService{
	
	@RequestMapping(value = "/operation3", method = RequestMethod.POST, consumes = MicroserviceConstants.JSON_CONTENT_TYPE, produces = MicroserviceConstants.JSON_CONTENT_TYPE)
	public MicroserviceResponse<MicroArqTestResponse> operation3(@RequestBody MicroserviceRequest<MicroArqTestRequest> inputObject);
	
	@RequestMapping(value = "/operation4", method = RequestMethod.POST, consumes = MicroserviceConstants.JSON_CONTENT_TYPE, produces = MicroserviceConstants.JSON_CONTENT_TYPE)
	public MicroArqTestResponse operation4(@RequestBody MicroArqTestRequest inputObject);
}
