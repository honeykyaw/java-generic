package client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ws.HelloWorld;
public class HelloWorldClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8011/ws/hello?wsdl");
		QName qname = new QName("http://ws/", "HelloWorldImplService");

		Service service = Service.create(url, qname);

		HelloWorld hello = service.getPort(HelloWorld.class);
		
		System.out.println(hello.getHellowWorldAsString("hk"));
	}
}
