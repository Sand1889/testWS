package test.webservice.client;

import test.webservice.HelloWorld;
import test.webservice.HelloWorldImplService;
 
public class JAXWSClient {
 
    public static void main(String[] args) {
       
        HelloWorldImplService helloWorldService = new HelloWorldImplService();
        HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();
        System.out.println(helloWorld.helloWorld("Sandra"));
    }
}
