package com.spring.component;

import java.util.Map;

import javax.annotation.Resource;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("searchAuthor")
@Scope("prototype")

/*
 * Use Callable if you want : 
 * (spring functionalities, handle mule message and read a properties file) 
 * at the same time.
 * 
 * This is what you will use more.
 * 
 * If you need only spring, dont use : implements Callable
 * 
 * */
public class SearchAuthor implements Callable{
	
//	@Autowired
//	private AnotherSpringComponetOrServiceOrWhatever spring;	
	
	@Resource(name="app") //app is the id="app" app-spring-context.xml
	protected Map<String,String> propertiesApp;	

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		String payload = (String) eventContext.getMessage().getPayload();
		
		return String.format("This book [%s] was made by : %s", payload, propertiesApp.get("by"));
	}
	
}
