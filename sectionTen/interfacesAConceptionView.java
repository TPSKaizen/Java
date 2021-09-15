package sectionTen;

public class interfacesAConceptionView {
    // Interface Classification
    // ~ Representative interfaces
    // ~ Mixins

    // Representative interfaces
    // 1. Defines representative behaviour of subclasses(defines the core
    // functionality of subclasses)
    // 2. Include one or more implementations
    // 3. If we are using a public API , then designers would usually provide one or
    // more implementations along with the interface itself.
    // E.g List Interface(Stores ordered collection of elems)
    // Implementations of List = ArrayList, LinkedList, Vector

    // Mixins
    // 1. Define additional capability of sublcasses
    // It is called a mixin because it allows the functionality its defining to be
    // mixed into the primary funcitonality
    // 2. Very generic ~ subclasses can come from anywhere
    // Mixins usually end with the suffix 'able'

    // Prefer Interfaces to abstract classes
    // When to prefer interfaces?
    // 1. mixins ~ if we use abstract classes, we can only have 1 mixin per class
    // 2. Representative behaviour with no state

    // When to prefer Abstract Classes
    // 1. Core identity of subclasses (representative behaviour WITH state)
    // 2. Skeletal implementation (of the interface)
    // Meaning, it would implement the interface and provide basic implementation
    // Naming Convention for Skeletal Implementation : AbstractInterfacename

}
