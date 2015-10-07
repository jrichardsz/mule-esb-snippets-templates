# component message interceptor

This project contains a simple example of : how intercept all components in a flow.

##Log mule app without interceptor :

Enter number of cars to purchase: 2
>>> Start buying car... 
   __     
 _| =\__ 
/o____o_\
   __     
 _| =\__ 
/o____o_\

purchased cars : 2

##Log mule app with interceptor :

```log

Enter number of cars to purchase: 2
INFO  2015-10-07 11:59:30,799 [[enpoint-message-listener].enpoint-message-listenerFlow.stage1.02] org.jrichardsz.template.mule.ComponentMessageProcessor: 

Inside:
[flowname:enpoint-message-listenerFlow]
[processor_path:/enpoint-message-listenerFlow/processors/0]
[class_simple_name:AddFlowVariableTransformer]
[payload:2]
[action:message processor pre invoke]

INFO  2015-10-07 11:59:30,809 [[enpoint-message-listener].enpoint-message-listenerFlow.stage1.02] org.jrichardsz.template.mule.ComponentMessageProcessor: 

Inside:
[flowname:enpoint-message-listenerFlow]
[processor_path:/enpoint-message-listenerFlow/processors/0]
[class_simple_name:AddFlowVariableTransformer]
[payload:2]
[action:message processor post invoke]

INFO  2015-10-07 11:59:30,809 [[enpoint-message-listener].enpoint-message-listenerFlow.stage1.02] org.jrichardsz.template.mule.ComponentMessageProcessor: 

Inside:
[flowname:enpoint-message-listenerFlow]
[processor_path:/enpoint-message-listenerFlow/processors/1]
[class_simple_name:ScriptComponent]
[payload:2]
[action:message processor pre invoke]

INFO  2015-10-07 11:59:31,002 [[enpoint-message-listener].enpoint-message-listenerFlow.stage1.02] org.jrichardsz.template.mule.ComponentMessageProcessor: 

Inside:
[flowname:enpoint-message-listenerFlow]
[processor_path:/enpoint-message-listenerFlow/processors/1]
[class_simple_name:ScriptComponent]
[payload:   
   __     
 _| =\__ 
/o____o_\]
[action:message processor post invoke]

INFO  2015-10-07 11:59:31,003 [[enpoint-message-listener].enpoint-message-listenerFlow.stage1.02] org.jrichardsz.template.mule.ComponentMessageProcessor: 

Inside:
[flowname:enpoint-message-listenerFlow]
[processor_path:/enpoint-message-listenerFlow/processors/2]
[class_simple_name:ScriptComponent]
[payload:   
   __     
 _| =\__ 
/o____o_\]
[action:message processor pre invoke]

>>> Start buying car... 
   __     
 _| =\__ 
/o____o_\
   __     
 _| =\__ 
/o____o_\

purchased cars : 2
INFO  2015-10-07 11:59:31,057 [[enpoint-message-listener].enpoint-message-listenerFlow.stage1.02] org.jrichardsz.template.mule.ComponentMessageProcessor: 

Inside:
[flowname:enpoint-message-listenerFlow]
[processor_path:/enpoint-message-listenerFlow/processors/2]
[class_simple_name:ScriptComponent]
[payload:{NullPayload}]
[action:message processor post invoke]

```