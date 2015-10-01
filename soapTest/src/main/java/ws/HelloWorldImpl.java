package ws;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHellowWorldAsString(String name) {

		return "Hello from " + name;
	}

}
