package com.bs.proteo.microservices.mx.microarqtest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.bs.proteo.microservices.architecture.test.MicroserviceMock;
import com.bs.proteo.microservices.mx.microarqtest.web.MicroArqTestController;

/**
 * @author BS
 * 
 */
public class MicroArqTestControllerTest extends MicroserviceMock {
	/**
	 * Mocks
	 */
	@InjectMocks
	MicroArqTestController microarqtestController;
	
	/**
	 * Mock test
	 */
	@Test
	public void operation1Mock() {
		String expected = "Some dummy modified string : Operation 1.";
		String result = microarqtestController.operation1();
		Assert.assertEquals(expected, result);
	}
}
