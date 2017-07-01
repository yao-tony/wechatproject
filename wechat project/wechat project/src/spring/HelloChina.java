package spring;

public class HelloChina implements IHelloMessage {

	private String msg = "";
	
	public HelloChina(String message)
	{
		msg=message;
	}
	@Override
	
/*	public void setMessage(String message)
	{
		msg = message;
	}*/
	public String sayHello() {
		return "Hello" + msg;
	}

}
