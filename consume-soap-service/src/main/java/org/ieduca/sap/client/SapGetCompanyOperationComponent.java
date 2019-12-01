package org.ieduca.sap.client;

import org.jrichardsz.soapeasier.SimpleHttpSoapClient;
import org.jrichardsz.soapeasier.core.impl.SoapClasspathRequest;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class SapGetCompanyOperationComponent implements Callable {

	@Autowired
	private SimpleHttpSoapClient simpleHttpSoapClient;

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		SoapClasspathRequest request = new SoapClasspathRequest();
		request.setRequestAddress("/soap-operation-get-company.xml");
		String response = simpleHttpSoapClient.performOperation(request);

		return response;
	}

}
