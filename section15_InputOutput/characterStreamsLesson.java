package section15_InputOutput;

public class characterStreamsLesson {
	/* Reader Class 
	 * 1. Base abstract class for all character input streams
	 * 2. Reads 16-bit char data in UTF-16 Format
	 * 
	 * Methods: 
	 * int read() throws IOException
	 * 1. Reads 1 char & returns as int between 0 & 2^16 -1 (65535)
	 * 2. Returns -1 if end of stream is detected
	 * 
	 * abstract int read( char[], int offset, int length) throws IOException)
	 *  Reads length # characters into array starting at offset
	 *  Returns # characters read or -1 if end of stream is detected
	 *  
	 *  All read calls are blocked
	 */
	
	/* Writer class
	 * 1. Base abstract class for all character output streams
	 * 2. Writes 16-bit character data into a sink (may use another char format)
	 * 
	 * Methods :
	 * 
	 * void write(int c) throws IOException
	 * 1. Writes a single character (lower two bytes and rest are discarded)
	 * 
	 * abstract void write(char [], int offset, int length) throws IOException
	 * 1. Writes length # characters from array starting at offset
	 */
}
