package org.jrichardsz.template.mule;

import org.apache.log4j.Logger;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.processor.MessageProcessor;

public class EndpointMessageInterceptor  implements MessageProcessor{

	private Logger log = Logger.getLogger(EndpointMessageInterceptor.class);
	
	@Override
	public MuleEvent process(MuleEvent event) throws MuleException {
	    
	    log.info(String.format("\n\n\nInside:\n[flowname:%s]\n[payload:%s]\n\n\n", 
	    		event.getFlowConstruct().getName(),
	    		event.getMessage().getPayload()));
	    
		return event;
	}

}
