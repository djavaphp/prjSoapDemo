package com.demo.soap.cxf
import org.grails.cxf.utils.EndpointType

import javax.jws.WebMethod
import javax.jws.WebResult
import javax.jws.WebService;

@WebService(name = 'MasterService',
	targetNamespace = 'http://test.cxf.grails.org/',
	serviceName = 'MasterService',
	portName = 'MasterServicePort')
class MasterService {
	static expose = [EndpointType.JAX_WS_WSDL]
	
	static wsdl = 'org/grails/cxf/test/soap/MasterService.wsdl'
		@WebResult(name = 'hello')
		@WebMethod(operationName = 'sayHello')
		String sayHello() {
			println "Method called"
			'hello'
		}    
}
