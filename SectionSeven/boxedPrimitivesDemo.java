package SectionSeven;

import java.util.ArrayList;

public class boxedPrimitivesDemo {

    public static void main(String[] args) {
        // boxedPrimitives();
        compareBoxPrimitives();
    }

    public static void boxedPrimitives() {
        // Creating boxed primitives
        Integer boxedInt = Integer.valueOf(8); // static factor methods can be used instead of constructors
        Boolean boxedBoolean = Boolean.valueOf(true);
        Character boxedChar = Character.valueOf('c');
        Double boxedDouble = Double.valueOf(23.3); // all these return objects

        System.out.println(boxedInt);
        System.out.println(boxedBoolean);
        System.out.println(boxedChar);
        System.out.println(boxedDouble);

        Integer boxedInt1 = Integer.valueOf("8"); // except Character
        // Integer boxedInt2 = Integer.valueOf("eight"); // invalid

        // instantiating using valueOf instead of using new keyword is better
        // because there are cached objects alreay for values that fall
        // between values -128 and positive 127
        // Bad approach : Integer boxedInt2 = new Integer(8);

        // returning values/ unboxing the values

        int primitiveInt = boxedInt.intValue();
        boolean primitiveBool = boxedBoolean.booleanValue();
        char primitiveChar = boxedChar.charValue();

        System.out.println(primitiveInt + " " + primitiveChar + " " + primitiveBool);

        // USE CASES OF BOXED PRIMITIVES

        // 1. Parsing strings: parseType
        String data = "4004	Effective Java Programming Language Guide	2007	T	4.9";
        String[] items = data.split("\t"); // delimited by tabs
        long id = Long.parseLong(items[0]);
        String boxedString2 = String.valueOf(items[0]);
        String title = items[1];
        int pubYear = Integer.parseInt(items[2]); // returns primitive
        char genre = items[3].charAt(0);
        double rating = Double.parseDouble(items[4]);

        System.out.println(id + " " + title + " " + pubYear + " " + genre + " " + rating);

        // 2. MIN_VALUE & MAX_VALUE

        // 2. MIN_VALUE & MAX_VALUE

        // 3. utility method
        boolean isLetter = Character.isLetter(genre);
        boolean isDigit = Character.isDigit(genre);
        boolean isLetterOrDigit = Character.isLetterOrDigit(genre);
        boolean isUpperCase = Character.isUpperCase(genre);

        System.out.println(isLetter);
        System.out.println(isDigit);
        System.out.println(isLetterOrDigit);
        System.out.println(isUpperCase);

        boolean isNan = Double.isNaN(0.0 / 0.0);
        System.out.println(isNan);

        String binary = Integer.toBinaryString(8);
        System.out.println(binary);
        String pubYearAsString = Integer.toString(pubYear);

        // Populate data structure
        ArrayList idList = new ArrayList();
        idList.add(Long.valueOf(id));
        idList.add(id); // Java 5 - auto-boxing

        // Generics - parameterized types
        ArrayList<Double> ratingList = new ArrayList<>();

        // Autoboxing ~ automatically boxing a primitive

    }

    static void compareBoxPrimitives() {
        System.out.println("\nInside compareBoxPrimitives ...");
        Integer num1 = Integer.valueOf(0); // Factor methods may reuse an existing object
        Integer num2 = Integer.valueOf(0);
        System.out.println("(num1 == num2): " + (num1 == num2)); // identity comparison is done

        // Solutions:
        System.out.println("(num1.intValue() == num2.intValue()): " + (num1.intValue() == num2.intValue()));
        System.out.println("(num1.equals(num2)): " + (num1.equals(num2)));

        Integer num3 = Integer.valueOf(1);
        System.out.println("(num1 < num3): " + (num1 < num3)); // "<" does un-boxing first
    }

    static Integer i;

    static void unbelievable() {
        System.out.println("\nInside unbelievable ...");
        if (i == 0) // throws null pointer since i was never initialized
            System.out.println("weird!");
    }
}
