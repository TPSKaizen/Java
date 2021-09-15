package sectionTen;

public class markerInterfaces {
    // 1. No methods
    // 2. Merely "marks" a class as having some property

    // E.g

    // java.util.RandomAccess
    // This says that any class implementing this interface says it's elements can
    // be accessed randomly and quickly. ArrayList implements this

    // java.io.Serializable
    // Any class implementing this declares that it allows its instances to be
    // serialized.

    // Example - Collections.shuffle(List)
    // The algo applied depends on whether the
    // input list implements RandomAccess. Determined via list instanceof
    // RandomAccess

    // If it does, apply shuffle directly
    // else :
    // 1. Copy elements to Array
    // 2. shuffle arrya
    // 3. dump array
}
