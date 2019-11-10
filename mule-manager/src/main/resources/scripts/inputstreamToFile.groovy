import org.apache.commons.io.FileUtils;
def name = message.getInboundProperty('http.query.params').name;

if(name==null){
  throw new Exception("name query parameter is required.");	
}

FileUtils.copyInputStreamToFile(payload, new File("${mule_home}/apps/${name}.${extension}"));
return message;