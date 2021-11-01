package section15_InputOutput;

public class readingWritingTextEfficiently {
	/* FileReader & FileWriter
	 * 1. Handles text files : 
	 * 		a. FileReader in = new FileReader("go.txt");
	 * 		b. FileWriter out = new FileWriter("go.txt");
	 * 
	 * 2. Uses FileInputStream & FileOutputStream
	 * 3. Uses default encoding
	 * 
	 * It is recommended NOT to use these classes since we have no control on character encoding. Thus platform dependency
	 */
	
	/*Recommended classes
	 *  General-Purpose Bridge Streams. Params are the abstract Input and Output stream classes.
	 *   Hence, not specific to file Streams and can be passed ANY byte stream objects.
	 *  
	 *  1. public InputStreamReader(InputStream in, String charsetName) Bytes to Characters
	 *  2. public OutputStreamWriter(OutputStream out, String charsetName) Characters to bytes	
	 *  
	 *  E.g : Reading contents of a text file
	 *  FileInputStream in = new FileInputStream("go.txt");
	 *  InputStreamReader reader = new InputStreamReader(in, "UTF-8");
	 *  
	 *  FileReader and FileWriter extend these classes
	 *  
	 *  Top Efficiency : Chain BufferedReader & BufferedWriter
	 *  
	 *  Buffering : 
	 *  Constructors: 
	 *  a. public BufferedReader(Reader in)
	 *  b. public BUfferedWriter(Writer out)
	 *  default buffer size ~ 8192 chars
	 *  
	 *   E.g
	 *   FileInputStream in = new FileInputStream("go.txt");
	 *  InputStreamReader reader = new InputStreamReader(in, "UTF-8");
	 *  BufferedReader buffedIn = new BufferedReader(reader);
	 *   
	 */
	
	/*BufferedReader
	 * Methods :
	 * 1. int read() throws IOException //Reads single Char
	 * 2. int read(char[], int offset, int length) throws IOException // Reads group of chars into input char array and returns num of chars read
	 * 3. String readLine() throws IOException //Reads a single line of text and returns it as a string
	 * 	readLine looks for \n - line feed, \r - carriage return, \r\n
	 * Carriage return = moving horizontally to the beginning of the same line
	 * Line feed = Moving to the next line
	 * Together = Moving to the beginning of the next line
	 */
	
	/*Reading text from File
	 * StringBuilder text = new StringBuilder();
	 * try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("go.txt"), "UTF-8))){
	 * 
	 * 	String line;
	 * while(line = in.readLine()) != null){ //readLine strips new lines so we have to add one
	 * 	text.append(line).append("\n");
	 * }
	 * 
	 * }catch(IOException e) {
	 * 		e.printStackTrace();
	 * }
	 */
	
	/* Reading text from Console/Command prompt
	 * 
	 * try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in,"UTF-8"))){
	 * 	String input;
	 * 	while((input = in.readLine()) != null && !input.equals("start")){ //the word 'start' will stop user input
	 * 	...
	 * }
	 * } catch (IOException e){
	 * 	e.printStackTrace();
	 * }
	 */
	
	/* Writing text to File
	 * try(BufferedWriter out = new BufferedWriter(OutputStreamWriter(new FileOutputStream("go.txt"), "UTF-8))) {
	 * 		out.write(text); // can be string or char array
	 * } catch (IOException e) {
	 * 		e.printStackTrace();
	 * }
	 */

}
