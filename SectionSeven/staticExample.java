package SectionSeven;

import java.util.HashMap;

public class staticExample {
    /*
     * static HashMap map = new HashMap();
     * 
     * static { map.put("John", "111-222-333"); map.put("Anita", "222-333-444"); }
     * // This populates the static map with data before its used in the class
     */
    /*
     * Static initializer example
     * 
     * static Stuff stuff;
     * 
     * static{ try{ stuff = getStuff(); //initialized here } catch(Exception e)
     * {...} }
     */

    /*
     * Static initializer example 2
     * 
     * static Stuff stuff = initializeStuff(); //initialization by private static
     * method. We can no reinitialze the variable by invocking this method
     * 
     * private static initializeStuff(){ try{ return getStuff(); }catch (Exception
     * e) { ... } return null; }
     */

    // We can have multiple initializers that execute in order (STATIC)

    // INSTANCE INITIALIZERS
    /*
     * { ... }
     * 
     * Why do we need it? 1. To share code between multipe constructors Under the
     * hood, intializer copied into beginning of every constructor
     */

    public staticExample() {
        System.out.println("No arg constructor");
    }

    public staticExample(int id) {
        System.out.println("Inside constructor with param..");
    }

    {
        System.out.println("Inside instance initializer");
    } // this gets copied to the beginning of each instantiated constructor

    // We can also have multiple instance initializers

    public static void main(String[] args) {
        staticExample s1 = new staticExample(1);
    }
}
