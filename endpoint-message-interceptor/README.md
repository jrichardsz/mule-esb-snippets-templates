# enpoint message interceptor

This project contains a simple example of : how intercept inbound and endpoint in a flow.

##Log mule app without interceptor :

```log
Enter number of cars to purchase: 2
>>> Start buying car... 
   __     
 _| =\__ 
/o____o_\
   __     
 _| =\__ 
/o____o_\

purchased cars : 2
INFO  2015-10-07 12:41:07,827 [[endpoint-message-interceptor].connector.file.mule.default.dispatcher.01] org.mule.lifecycle.AbstractLifecycleManager: Initialising: 'connector.file.mule.default.dispatcher.923083342'. Object is: FileMessageDispatcher
INFO  2015-10-07 12:41:07,828 [[endpoint-message-interceptor].connector.file.mule.default.dispatcher.01] org.mule.lifecycle.AbstractLifecycleManager: Starting: 'connector.file.mule.default.dispatcher.923083342'. Object is: FileMessageDispatcher
INFO  2015-10-07 12:41:07,830 [[endpoint-message-interceptor].connector.file.mule.default.dispatcher.01] org.mule.transport.file.FileConnector: Writing file to: D:\opt\invoice.txt

```

##Log mule app with interceptor :

```log

Enter number of cars to purchase: 2
INFO  2015-10-07 12:39:58,368 [[endpoint-message-interceptor].stdioConnector.receiver.01] org.jrichardsz.template.mule.EndpointMessageInterceptor: 

Inside INBOUND:
[flowname:enpoint-message-listenerFlow]
[payload:2]

>>> Start buying car... 
   __     
 _| =\__ 
/o____o_\
   __     
 _| =\__ 
/o____o_\

purchased cars : 2
INFO  2015-10-07 12:39:59,076 [[endpoint-message-interceptor].enpoint-message-listenerFlow.stage1.02] org.jrichardsz.template.mule.EndpointMessageInterceptor: 

Inside OUTBOUND:
[flowname:enpoint-message-listenerFlow]
[payload:Subtotal $875.00;Total $875.00;Amount Paid $0.00;Balance Due  $875.00]

INFO  2015-10-07 12:39:59,090 [[endpoint-message-interceptor].connector.file.mule.default.dispatcher.01] org.mule.lifecycle.AbstractLifecycleManager: Initialising: 'connector.file.mule.default.dispatcher.772429840'. Object is: FileMessageDispatcher
INFO  2015-10-07 12:39:59,093 [[endpoint-message-interceptor].connector.file.mule.default.dispatcher.01] org.mule.lifecycle.AbstractLifecycleManager: Starting: 'connector.file.mule.default.dispatcher.772429840'. Object is: FileMessageDispatcher
INFO  2015-10-07 12:39:59,102 [[endpoint-message-interceptor].connector.file.mule.default.dispatcher.01] org.mule.transport.file.FileConnector: Writing file to: D:\opt\invoice.txt

```