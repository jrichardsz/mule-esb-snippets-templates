package org.jrichardsz.template.mule;

import org.apache.log4j.Logger;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.context.notification.MessageProcessorNotificationListener;
import org.mule.api.processor.MessageProcessor;
import org.mule.context.notification.MessageProcessorNotification;

public class ComponentMessageProcessor implements MessageProcessorNotificationListener<MessageProcessorNotification> {
private Logger log = Logger.getLogger(ComponentMessageProcessor.class);

@Override
public void onNotification(MessageProcessorNotification m) {
    MuleEvent ev = m.getSource();
    MuleMessage msg = ev.getMessage();
    Object payload = msg.getPayload();
    String ref = payload != null ? payload.toString() : "null";

    MessageProcessor proc = m.getProcessor();
    log.info(String.format("\n\n\nInside:\n[flowname:%s]\n[processor_path:%s]\n[class_simple_name:%s]\n[payload:%s]\n[action:%s]\n\n\n", 
    		ev.getFlowConstruct().getName(),
    		m.getProcessorPath(), 
    		proc.getClass().getSimpleName(),
    		ref,
    		m.getActionName()));

  }

}