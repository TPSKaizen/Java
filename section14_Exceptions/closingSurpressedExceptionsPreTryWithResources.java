package section14_Exceptions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class closingSurpressedExceptionsPreTryWithResources {

	static String inFileStr = "walden.jpg";
	static String outFileStr = "walden-out.jpg";

	public static void fileCopyWithArm() throws IOException {
		System.out.println("\nInside fileCopyWithArm ...");

		try (Test5 t = new Test5();
				Test6 t2 = new Test6();
				BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFileStr));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFileStr))) {
			byte[] byteBuf = new byte[4000];
			int numBytesRead;
			while ((numBytesRead = in.read(byteBuf)) != -1) {
				out.write(byteBuf, 0, numBytesRead);
			}

			throw new IOException("Important Exception!!");
		}
	}

	public static void fileCopyWithoutArm() throws IOException { // will only generate the first trivial exception 2,
																	// the other exceptions are ignored
		System.out.println("\nInside fileCopyWithoutArm..");

		Test5 t5 = null;
		Test6 t6 = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		try {
			t5 = new Test5();
			t6 = new Test6();
			in = new BufferedInputStream(new FileInputStream(inFileStr));
			out = new BufferedOutputStream(new FileOutputStream(outFileStr));

			byte[] byteBuf = new byte[4000];
			int numBytesRead;
			while ((numBytesRead = in.read(byteBuf)) != -1) {
				out.write(byteBuf, 0, numBytesRead);
			}

			throw new IOException("Important Exception!!");

		} finally {
			if (t6 != null)
				t6.close(); // Only this exception will be thrown
			if (t5 != null)
				t5.close();
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

	public static void fileCopyWithoutArm2() throws IOException {
		System.out.println("\nInside fileCopyWithoutArm2..");

		Test5 t5 = null;
		Test6 t6 = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		// To handle masked exception, we need another exception object to store all
		// exceptions associated with it(in this case IOException)

		IOException ioException = null; // starts with nothing attached to it.

		try {
			t5 = new Test5();
			t6 = new Test6();
			in = new BufferedInputStream(new FileInputStream(inFileStr));
			out = new BufferedOutputStream(new FileOutputStream(outFileStr));

			byte[] byteBuf = new byte[4000];
			int numBytesRead;
			while ((numBytesRead = in.read(byteBuf)) != -1) {
				out.write(byteBuf, 0, numBytesRead);
			}

			throw new IOException("Important Exception!!");

		} catch (IOException e) { // Catch IOException from try
			ioException = e; // Main exception from try block is given to ioException
		} finally {
			if (ioException != null) { // if ioException is linked to main exception, close t5 and attach t5's
										// exception to e
				try {
					if (t5 != null) {
						t5.close();
					}
				} catch (IOException e) {
					ioException.addSuppressed(e);
				}
			} else { // if ioException isn't linked to main exception, close t5 and link ioException
						// to exception thrown from t5
				try {
					if (t5 != null) {
						t5.close();
					}
				} catch (IOException e) {
					ioException = e;
				}
			}

			// Repeat for every assigned resource

			if (ioException != null) {
				try {
					if (t6 != null) {
						t6.close();
					}
				} catch (IOException e) {
					ioException.addSuppressed(e);
				}
			} else {
				try {
					if (t6 != null) {
						t6.close();
					}
				} catch (IOException e) {
					ioException = e;
				}
			}

			if (ioException != null) {
				try {
					if (in != null) {
						in.close();
					}
				} catch (IOException e) {
					ioException.addSuppressed(e);
				}
			} else {
				try {
					if (in != null) {
						in.close();
					}
				} catch (IOException e) {
					ioException = e;
				}
			}

			if (ioException != null) {
				try {
					if (out != null) {
						out.close();
					}
				} catch (IOException e) {
					ioException.addSuppressed(e);
				}

				throw ioException; //finally throwing the compacted exception
			} else {
				if (out != null) {
					out.close();
				}
			}
		}
	}

	public static void main(String[] args) {
		try {
			fileCopyWithoutArm2();
		} catch (IOException e) {
			e.printStackTrace();

			/*
			 * Throwable[] throwables = e.getSuppressed();
			 * System.out.println(throwables[0].getMessage());
			 * System.out.println(throwables[1].getMessage());
			 */
		}

	}
}

class Test5 implements AutoCloseable {
	@Override
	public void close() throws IOException {
		throw new IOException("Trivial Exception");
	}
}

class Test6 implements AutoCloseable {
	@Override
	public void close() throws IOException {
		throw new IOException("Trivial Exception 2");
	}
}
