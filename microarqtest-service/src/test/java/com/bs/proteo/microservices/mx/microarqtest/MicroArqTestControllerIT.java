package com.bs.proteo.microservices.mx.microarqtest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.bs.proteo.microservices.architecture.core.MicroserviceRequestContext;
import com.bs.proteo.microservices.architecture.core.MXRequestContext;
import com.bs.proteo.microservices.architecture.core.aop.MXControllerAspect;
import com.bs.proteo.microservices.architecture.core.config.MXHeaders;
import com.bs.proteo.microservices.architecture.test.FastTest;
import com.bs.proteo.microservices.architecture.core.config.MicroservicesConfig;


/**
 * @author BS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {MicroArqTestApp.class, MicroArqTestControllerIT.class, MXHeaders.class, MXControllerAspect.class, MXRequestContext.class, MicroserviceRequestContext.class})
@WebIntegrationTest(randomPort=true)
public class MicroArqTestControllerIT {

	private int port = 0;
	private MicroservicesConfig config = new MicroservicesConfig();
	
	/**
	 * Operations
	 */
	private static final String operation1 = "/operation1";
	
	/**
	 * HttpHeaders
	 */
	private static Map<String,String> httpHeaders = new HashMap<String,String>();
	
	/**
	 * MXHeadersConfig
	 */
	@Autowired
	private MXHeaders mxHeaders;
	
	/**
	 * Setup for MicroArqTestControllerIT()
	 */
	@Before
	public void setupMicroArqTestIT() {
		// Legacy RequestBody Headers
		mxHeaders.getRequired().forEach(header -> httpHeaders.put(header, header));
		
	}
	
	/**
	 * Operation1 test Get Method without Headers 
	 */
	@Test
	public void operation1GetWithoutHeaders() {
		port = Integer.valueOf(config.getProperty("local.server.port","8080"));
		FastTest fastTest = new FastTest(port);
		fastTest.getWithoutHeaders(operation1);
	}
	
	/**
	 * Operation1 test Get Method with Headers 
	 */
	@Test
	public void operation1GetWithHeaders() {
		port = Integer.valueOf(config.getProperty("local.server.port","8080"));
		FastTest fastTest = new FastTest(port, httpHeaders);
		fastTest.getAvailableWithHeaders(operation1);
	}
	
	/**
	 * Operation1 test Post Method isn't available
	 */
	@Test
	public void operation1PostNotAvailable() {
		port = Integer.valueOf(config.getProperty("local.server.port","8080"));
		FastTest fastTest = new FastTest(port);
		fastTest.postNotAvailable(operation1);
	}
	
}
