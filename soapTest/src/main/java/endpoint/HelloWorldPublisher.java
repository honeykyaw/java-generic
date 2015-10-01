package endpoint;

import javax.xml.ws.Endpoint;

import ws.HelloWorldImpl;

public class HelloWorldPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8011/ws/hello", new HelloWorldImpl());
	}
}
