package test.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="test.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
 public String helloWorld(String name) {
  return "Hello world from "+name;
 }
 
}