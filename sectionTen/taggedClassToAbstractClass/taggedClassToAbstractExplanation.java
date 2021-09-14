package sectionTen.taggedClassToAbstractClass;

public class taggedClassToAbstractExplanation {
    /*
     * A Tagged class is one that tries to tag or mark an objected based on certain
     * conditions. This would lead to certain instance variables not being set aside
     * from their default value, depending on the tag type.
     * 
     * For example
     * 
     * public class Bookmark{ private String title, authors, directors cast; private
     * final String bookmarkType;
     * 
     * public Bookmark(String title, String authors){ this.title = title;
     * this.authors = authors; this.bookmarkType = "book"; }
     * 
     * public Bookmark(String title, String directors, String cast){ this.title =
     * title; this.directors=directors; this.cast =cast; this.bookmarkType = "movie"
     * }
     * 
     * public void isKidFriendlyEligible(){ if(bookmarkType.equals("book")){ //code
     * specific to book } else if(bookmarkType.equals("movie")){ //code specific to
     * movie } } }
     * 
     * The above class will invoke diff constructors based on if its a book or
     * movie. This is bad design and we need to abstract this tagged class.
     */

    // 1. Make tagged class an abstract class
    // 2. Make every method whose behaviour depends on the tagged field an method
    // 3. If there are any methods that don't depend on the tagged field, let them
    // be concrete methods
    // 4. If there are any fields that are used by all types of the tagged class
    // then those fields should be in the abstract class (In this case : title)
    // 5. Define a concrete class for each type of the tagged class (Book & Movie)
    // 6. Concrete methods should override abstract methods in the super class,
    // providing specific implementation
    // 7. Move any subclass specific variables from superclass into a corresponding
    // subclass (E.g authors to book class and cast & directors to Movie class)

}
