package section15_InputOutput;

public class characterEncodingLesson {

	//The Basics
	/*
	 * 
	 * Files ~ Binary & Text
	 * Fundamentally, all files are binary (sequences of bytes. Bytes are 8 bits.)
	 * All files, binary or text, look alike to hardware
	 * Software makes a distinction 
	 * Text files ~ text processing s/w, e.g, notepad, eclipse 
	 * Images ~ image processing s/w, e.g, windows photo viewer
	 */
	
	//Hexadecimal
	/*
	 *  'a' -> 61(hex) -> 01100001. 6 = 0110, 1 = 0001
	 *  01100001 would represent something else in an image.
	 *  
	 *  A single byte(8 bits) can be any of 256 patterns (2^8)
	 *  
	 *  Processing text is complex -> #languages + # ways to process (# encoding schemes)
	 *  
	 */
	
	//Encoding Scheme
	/*
	 *  Every file uses some encoding scheme to represent its content.
	 *  An encoding scheme maps a hexadecimal number to either a character or a binary
	 */
	
	//Encoding & Decoding
	/*
	 *  Encoding : 'a' -> 61(hex code) -> 01100001
	 *  Decoding : 01100001 -> 61(hex code) -> 'a'
	 *  Examples : ASCII, UCS-2, UTF-16, UTF-32
	 *  These implement some Character set
	 * 
	 */
	
	//Character Set 
	/*
	 *  ASCII - 7-bit codes for unaccented English Characters 
	 *  41H to 5AH ~ 'A' to 'Z'
	 *  
	 *  ISO/IEC 8859: Standard 8-bit ASCII extensions 
	 *  
	 *  DBCS (Double Byte Character Sets): Asian characters
	 *  
	 *  All these different character sets resulted in decoding issues
	 *  
	 *  The internet made it worse. And hence, Unicode was invented to solve the issue.
	 */
	
	//Unicode 
	/*
	 *  Maintained by Unicode Consortium
	 *  Backward compatible with 7-bit ASCII
	 *  Initial assumption : 
	 *  1. 16 bits for 65536 chars would suffice
	 *  Basic Multilingual Plane(BMP)
	 *  USC-2 (Was 16 bits in length, it was fixed)
	 *  
	 *  BUT, there were more characters: 
	 *  UCS-4, UTF-16, UTF-8. UTF-32
	 *  
	 *  Covers 120k Characters & 129 Scripts
	 * 
	 *  Unicode has two parts: 
	 *  1. BMP (Basic Multilingual Plane) ~ U+0000 to U+FFFF ~ 65536 Characters
	 *  2. Supplementary (Non-BMP) ~ U+0000 to U+10FFFF ~ 55k Characters (As of today)
	 *  
	 *  The hexadecimal code that represents each character is called "Code Point".
	 *  To represent a BMP character, 1 16-bit code point is used.
	 *  
	 *  For each supplementary character, 2 16-bit codes are used.
	 */
	
	//UTF- 16
	/*
	 * Variable-Length 
	 * BMP : 2 Bytes, Non-BMP : 4bytes 
	 * 
	 * BMP Codes : 1-1 Correspondence (It uses the same hex codes as the code points in BMP (Applies to UTF-32 as well)
	 * 
	 * Non- BMP Codes : Surrogate pairs (higher & lower) ~ Uses two unicodes to represent the two code points 
	 * 
	 * Java, C#, Python, etc
	 */
	
	//UTF-8(Backward compatible with ASCII)
	/*
	 * Variable-length
	 * ASCII chars(0-127): 1 byte
	 * Others : 2-4 bytes
	 * Non-BMP : 4 bytes for sure
	 * Favour for english
	 * Most popular : Half of the web uses it 
	 */
	
	//Endianness 
	/*
	 * Since the basic unit is two bytes,there are two ways in which it can be stored (E.g UTF-16)
	 * 
	 * 1. Big Endian (BE) ~ MSB stored at lowest memory address
	 * 2. Low Endian (LE) ~ MSB stored at highest memory address
	 * Byte Order Mark (BOM)
	 * BE ~ FEFF
	 * LE ~ FFFE
	 * E.g : 
	 *  Hello -> 0048 0065 006C 006C 006F
	 *  BE -> FEFF 0048 0065 006C 006C 006F
	 *  LE -> FFFE 4800 6500 6C00 6C00 6F00
	 */
	
	//RULE : Always decode using same or compatible encoding scheme
	// Compatiable Example : ASCII can be decoded with UTF-8 since UTF-8 is backwards compatible with ASCII
	
}
