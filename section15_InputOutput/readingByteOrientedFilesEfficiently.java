package section15_InputOutput;

public class readingByteOrientedFilesEfficiently {
	
	//FileOutputStream(String filename) throws FileNotFoundException
	
	/*
	 * If a file doesn't exist, one is created.
	 * If a file does exist, it is overwritten.
	 */
	
	//read()/ write() is Expensive
	/*
	 * Reading/writing single byte is grossly inefficient
	 * Analogy: Shopping without a cart (carrying each item to the cashier individually)
	 */
	
	//Solution : Buffering (the shopping cart)
	/*
	 * Read/write block of bytes into memory buffer
	 * BufferedInputStream & BufferedOutputStream (subclasses of the below)
	 * FilterInputStream & FilterOutputStream (subclass inputStream and outputStream)
	 * Buffer ~ byte array
	 * Default buffer size ~ 8192 bytes (constructors can set size to another number)
	 */
	
	//Chained Streams 
	/*
	 * BufferedStreams are ONLY responsible for buffering and therefore have to work with other streams.
	 * They don't take responsibility for files on the disk.
	 * 
	 * Hence, they are chained.
	 * 
	 *  Java program <--- BufferedInputStream <--- FileInputStream <------ Data Source
	 *  
	 *  E.g : 
	 *  
	 *  Decorator Pattern: 
	 *  BufferedInputStream in = new BufferedInputStream( new FileInputStream("go.jpg"));
	 *  
	 *  BufferedInputStream has a constructor that takes an InputStream object, thus any sublcass can also go in here.
	 */
	
	//Under-The-Hood
	/*
	 * if (buffer has requested data) 
	 * 			b <- buffer
	 * else 
	 * 	if (buffer has partial data)
	 * 		b <- buffer.partial 
	 * 		fill-buffer <- in.read(buffer, buffer-offset, buffer-length)
	 * 		b <- buffer.remaining 
	 * else // buffer has no unread data 
	 * 	  if(buffer.length > b.length) 
	 * 		fill-buffer <- in.read(buffer, buffer-offset, buffer-length)
	 * 		b <- buffer 
	 * else 
	 * 	in.read(b, offset, length)
	 */
	
	/* Buffered Input Stream Read operation
	 *  synchronized int read() throws IOException
	 *  if (buffer has unread data)
	 *     return first unread byte
	 *  else
	 *  	fill-buffer <- in.read()
	 */
	
	/* Buffered Input Stream Read Operation 2nd version
	 *  synchronized int read(byte[] b, int offset, int length)
	 *  1. Reads length # bytes from buffer into array starting at offset
	 *  2. Returns # bytes read or -1 if end-of-stream detected
	 * 
	 */
	
	/* Buffered output stream write operation 
	 * 
	 * synchronized void write(int) throws IOException
	 *  1. Data is written to buffer
	 *  2. Flush buffer to underlying stream if not enough space
	 */
	
	/* Second write operation
	 * synchronized void write(byte[] b, int offset, int length)
	 * Write length # bytes from array starting at offset into buffer
	 * Flush buffer if not enough space ~ out.write(buffer, 0 , count)
	 * 
	 * if (b.length >= buffer.length)
	 * flush-bluffer -> out.write(buffer,0,count) //flush buffer
	 * out.write(b, offset, length) //Write directly to byte array
	 */
	
	/* Decorator.close()
	 * 1. Invokes close() on the underlying decorated stream //chaining can occur
	 * 2. If steam is a BufferedOutputStream then first flush() is invoked.
	 */
	
}
