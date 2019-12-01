package org.ieduca.sap.client;

import org.jrichardsz.soapeasier.SimpleHttpSoapClient;
import org.jrichardsz.soapeasier.core.impl.SoapClasspathRequest;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class SapGetCompanyOperationComponentWithoutSpring implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		SimpleHttpSoapClient client = new SimpleHttpSoapClient();

		client.setServiceUrl("http://www.crcind.com/csp/samples/SOAP.Demo.cls");
		client.setContentType("text/xml; charset=utf-8");
		client.setSoapAction("http://tempuri.org/SOAP.Demo.AddInteger");

		client.setSkipCertificateValidation(true);
		client.setAllowedStringHostnames("crcind.com");

		client.setBasicAuthUser("jane");
		client.setBasicAuthPassword("doe");

		client.configure();

		SoapClasspathRequest request = new SoapClasspathRequest();
		request.setRequestAddress("/soap-operation-get-company.xml");

		String response = client.performOperation(request);

		return response;
	}

}
