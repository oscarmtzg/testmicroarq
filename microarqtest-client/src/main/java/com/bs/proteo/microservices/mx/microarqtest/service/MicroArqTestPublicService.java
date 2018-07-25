package com.bs.proteo.microservices.mx.microarqtest.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bs.proteo.microservices.architecture.core.MicroserviceConstants;
import com.bs.proteo.microservices.mx.microarqtest.domain.MicroArqTestResponse;

/**
 * @author BS
 *
 * TODO, This is a service of your microservice and it's
 * impemented on a controller.
 * 
 * TODO, Proteo4 Microservices development guide
 */
@FeignClient("microarqtest-v0")
public interface MicroArqTestPublicService{
	
	@RequestMapping(value = "/operation1", method = RequestMethod.GET, produces = MicroserviceConstants.JSON_CONTENT_TYPE)
	public String operation1();
	
	@RequestMapping(value = "/operation2/{param}", method = RequestMethod.GET, produces = MicroserviceConstants.JSON_CONTENT_TYPE)
	public MicroArqTestResponse operation2(@PathVariable("param") String inputParam);
	
}
