package SectionSeven;

public class MathClassDemo {
    public static void main(String[] args) {
        // returns a double between >= 0 && < 1.0
        Math.random(); // java.util.Random is preferred

        // To get int values between 1 and 100 we can do this
        System.out.println((int) (Math.random() * 100 + 1));

        // rounding ~ rounds float to the nearest int
        System.out.println(Math.round(24.45)); // because it is below 24.5, it goes to 25
        System.out.println(Math.round(21.3f));

        // if you always want to round up, you use ceil
        System.out.println(Math.ceil(24.45)); // will not round up if the decimal is exactly 0

        // round down
        System.out.println(Math.floor(24.99));

        // Min and Max
        System.out.println(Math.min(24.43, 24.45));
        System.out.println(Math.max(24.43, 24.45));

        // absolute value
        System.out.println(Math.abs(-24.43));

        // Power
        System.out.println(Math.pow(2, 4));
        System.out.println(2 << 3);

        // Sqrt (Doesn't take negative numbers) ~ returns NaN (Not a Number)
        System.out.println(Math.sqrt(16.0));

        // Logs
        System.out.println(Math.log(100 / 8)); // Inverse Document Frequency

    }
}
