package section14_Exceptions;

public class APIParser {

	public static int parseSendResponeCode(String response, String string, String partner) throws APIFormatChangeException {
		// TODO Auto-generated method stub
		//Context: The response string is formatted incorrectly from an external API. It doesn't contain a number
		int responseCode = -1;
		try {
			String startTag = "<code>";
			String endTag = "</code>";
			
			if(response.contains(startTag)) {
				int beginIndex = response.indexOf(startTag) + startTag.length();
				int endIndex = response.indexOf(endTag);
				System.out.println(beginIndex + " " + endIndex);
				
				System.out.println("code: " + response.substring(beginIndex, endIndex));
				responseCode = Integer.parseInt(response.substring(beginIndex, endIndex)); //parseInt returns NumberFormatException since the string isn't a number
			}
		} catch (NumberFormatException e) { // We will create a new exception for this
			//e.printStackTrace();
			throw new APIFormatChangeException(response, "code" , partner, e); //This is generating a higher level exception (Exception translation)
			// to make it more flexible, we can have a instances variables associated with the additional information inside the Created Exception
			
			//Some exception classes may not have Chaining constructor. To fix that, we use .initCause(), which throws a throwable.
			// So what we do is : 
			/*
			 * 
			 *  ApiFormatChangeException e1 = new APIFormatChangeException(response, "code", partner);
			 *  e1.initCause(e);
			 *  throw e1;
			 *  
			 *  And the constructor in the APIFormatChangeException won't follow the throwable format. So exclude the throwable param
			 */
		}
		return responseCode;
	} //New exceptions MUST extend one of the exception classes

}
