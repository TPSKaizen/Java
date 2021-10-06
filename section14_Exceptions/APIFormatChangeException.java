package section14_Exceptions;

//Creating a custom extension

//58. Used checked exceptions for recoverable conditions and runtime exceptions for programming errors 

//We cannot subclass Error, RuntimeException or Throwable, we CAN subclass Exception

public class APIFormatChangeException extends Exception{
	private String response;
	private String elementName;
	private String partner;

	public APIFormatChangeException(String response, String elementName, String partner, Throwable e) { //Throwable e is called Exception chaining because we are adding on the lower level cause
		super("Response : " + response + " elementName: " + elementName + " partner: " + partner, e);
		this.response = response;
		this.elementName = elementName;
		this.partner = partner;
	}

	public String getPartner() {
		return this.partner;
	}
	
	public String getElementName() {
		return this.elementName;
	}
	
	public String getResponse() {
		return this.response;
	}

}
