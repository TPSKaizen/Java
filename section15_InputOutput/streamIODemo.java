package section15_InputOutput;

public class streamIODemo {
	//Reading and writing is handle by streams
	// A stream is a connection between a Java Program and a source/sink, represented by a class, specific to the type of source.
	// If source/sink is a file, then a specific type of stream is used. Same with networks.
	// A stream can be an input stream or an output stream.
	
	//Input/Output Streams
	/*
	 *  Input stream : Reading from a source
	 *  Output stream : Writing to a destination
	 */
	
	//Stream IO Operations :
	/*
	 *  1. Open stream ~ Opens a stream
	 *  2. Read/Write ~ Input streams = Reading, Output stream = Writing
	 *  3. Close stream ~ Freeing up system resources
	 */
	
	//Standard template for opening and close without try with resources
	/*
	 *  FileInputStream in = null;
	 *  try{
	 *  	in = new FileInputStream(filename); //open stream 
	 *  	//read data 
	 *  } catch (FileNotFoundException e){
	 *  // catch block code
	 *  } finally{
	 *  	try{
	 *  	if(in != null) {
	 *  	in.close();
	 *  }
	 *  } catch (IOException e) {
	 *  }
	 *  }
	 */
	
	//Try With Resources ( object must implement AutoCloseable interface and the variable in will be final implicitly)
	/*
	 * 	try(FileInputStream in = new FileInputStream(filename)){
	 * 		//read data
	 * } catch (FileNotFoundException e) {
	 * 	..
	 * } catch (IOException e) {
	 * 	..
	 * }
	 */
	
	//Try With Resources (Multiple streams)
		/*
		 * 	try(FileInputStream in = new FileInputStream(filename);
		 * 		FileOutputStream out = new FileOutputStream(filename)){
		 * 		//read data
		 * } catch (FileNotFoundException e) {
		 * 	..
		 * } catch (IOException e) {
		 * 	..
		 * }
		 */
	
	//Stream Classification 
	/*
	 * 1. Byte Streams  ~ Used for everything else (InputStream, OutputStream)
	 * 2. Character Streams ~ Used for text (Reader, Writer)
	 */
	
	// Byte Streams
	/*
	 * 1. Read/write raw bytes serially
	 * 2. Character streams are built on it
	 */
	
	//InputStream
	/*
	 * Base abstract class for all byte input streams 
	 * To read data in groups of 8-bit bytes
	 */
	
	//Read Operation 
	/*
	 *  abstract int read() throws IOException
	 *  
	 *  This methods reads 1 byte & return as int between 0 & 255 (2^8-1)
	 *  Returns -1 if end-of-stream detected 
	 *  'a' -> 97
	 *  
	 *  ----------
	 *  
	 *  int read(byte[] b, int offset, int length) throws IOException (Used to read groups of bytes) ~ This is a concrete method
	 *  1. Reads length # bytes into array starting at offset
	 *  2. Returns bytes read of -1 if end-of-stream detected 
	 *  3. Repeated invokes read(internally)
	 *  
	 *  ----------
	 *  
	 *  int read(byte[] b) throws IOException -> read(b,0,b.length) //Fills the array completely
	 *  
	 *  ALL read calls are blocking when no data is available. Meaning, the method will WAIT until data becomes available 
	 */
	
	//OutputStream 
	/*
	 * Base abstract class for all byte output streams
	 * To write data in groups of 8-bit bytes
	 */
	
	//Write Operation (1 byte at a time)
	/*
	 * abstract void write(int) throws IOException
	 * Writes only least significant byte, the 8 lower order bits on the right most end
	 * 
	 * ------------
	 * 
	 * void write(byte[] b, int offset, int length) throws IOException (groups of bytes)
	 * 1. Write length # bytes from array starting at offset
	 * 2. Repeatedly invokes write
	 * 
	 * -----------
	 *  
	 *  void write(byte[] b) throws IOException -> write(b, 0, b.length)
	 */
}
