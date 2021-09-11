package SectionFive;

public class StringsStuff {
    // A string literal is a string object
    String s = new String();
    String s1 = new String("Hello");

    char[] cArr = { 'h', 'e', 'l', 'l', 'o' };
    String s2 = new String(cArr);

    String s3 = "Brian"; // Recommended and still is a object!

    // Internally, string class uses character array to store text
    // Java uses UTF-16 for Character
    // String is a sequence of unicode characters
    // Strings are immutable

    // String Special Features
    // 1. Assignment via a string literal
    // 2. + operator is used for concatenation
    // 3. All strings created via string literals are stored in a special area of
    // memory called String pool

    // Common Operations
    // 1. Comparing
    // 2. Searching
    // 3. Examining individual characters
    // 4. Extracting substrings
    // 5. Case transaltion
    // 6. Replace
    // 7. Split

    static void stringExamples() {
        System.out.println("Inside string examples...");
        String s = "hello world!";
        System.out.println("s: " + s);

        System.out.println("\ns.length(): " + s.length());
        System.out.println("s.isEmpty(): " + s.isEmpty());

        // Comparison
        System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!")); // compares both strings,
                                                                                         // returns boolean
        System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!")); // compares
                                                                                                           // both
                                                                                                           // strings,
                                                                                                           // ignores
                                                                                                           // case,
                                                                                                           // returns
                                                                                                           // boolean
        System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!")); // compares strings,
                                                                                             // returns 0, a positive
                                                                                             // int or a negative int.
        // 0 : if two strings are exactly identical
        // compareTo compares the strings lexicographically according to unicode value
        // in the two strings
        // negative int is returned if this(s in this case) lexicographically PRECEDES
        // the argument string
        // positive int is returned if this(s in this case) lexicographically FOLLOWS
        // the argumen string
        // In unicode, the UPPERCASE letters come BEFORE the lower case letter

        // Searching
        System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
        // for contains, checks if this string(s) contains the argument string. Case
        // matters. Returns a boolean
        System.out.println("s.contains(\"world!\"): " + s.contains("world!")); // returns true
        System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
        // Says, if the current string starts with the input string. Case Matters.
        // returns boolean. In this case, a false
        System.out.println("s.startsWith(\"hello world!\"): " + s.startsWith("hello world!"));
        // Same as above, but returns true
        System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
        // Ends with is the reverse of startsWith
        System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
        // Checks if argument string exists and returns the index of the string.
        // If the string is more than one character, it returns the starting index. In
        // hello world it would be index 3 for 'lo'
        System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));// returns 4
        System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));
        // checks the last occurance of the argument within the string

        // Examining individual characters
        System.out.println("\ns.charAt(4): " + s.charAt(4)); // returns char at specified index

        // Extracting substrings
        System.out.println("\ns.substring(4): " + s.substring(4));
        // returns entire substring FROM index 4
        System.out.println("s.substring(4, 9): " + s.substring(4, 9));
        // returns substring BETWEEN 4 and 9.
        // 4 is inclusive, 9 is exclusive. So 4-8
        // a to b-1

        // Case conversions (Note: String is immutable. So, only a copy is returned)
        System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
        System.out.println("s.toLowerCase(): " + s.toLowerCase());

        System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing
                                                       // white spaces. Meaning before and after the actual string

        // Replace (e.g., replace comma's with white-space)
        System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));

        // Split (e.g., split a document into words or split a line of text by tab or
        // comma or white space)
        System.out.println("\ns.split(\"o\"): ");
        String[] sa = s.split("o");
        for (String temp : sa) {
            System.out.println(temp);
        }

        // StringBuilder and StringBuffer allow for mutability
        // StringBuffer is obselete!
        // not synchronized - Can cause issues while multithreading
        StringBuilder sb = new StringBuilder();

        sb.append("Brian");
        sb.append("McConney");
        String sTr = sb.append(" ").append("Good").append(" morning").toString();

        System.out.println(sTr);
        // other methods : length, delete, insert, reverse, replace

        sb.delete(1, 5);
        // deletes characters from index 1 to 5-1 (a to b-1)
        sb.insert(1, "ey");
        // inserting at index 1
        System.out.println(sb.toString());

        // String contactenation performance:
        // Combining a few strings are fine, but with many strings it affects
        // performance
        // Reasons, with each concatenation :
        // 1. contents of both strings are copied
        // 2. New StringBuilder is created and appended with both strings
        // 3. Return string via toString()

        // It is better to use StringBuilder than concat operator

        // ESCAPE SEQUENCES
        // \" ~ double quote
        // \' ~ single quote
        // \n ~ new line
        // \t ~ tab
        // \\ ~ backslash
    }

    public static void main(String[] args) {
        stringExamples();

    }
}
