package sectionTen.cloneableDemo;

public class shortNotes {

    /* clone method implementation */
    // class CloneableClass implements Cloneable{
    // public CloneableClass clone(){
    // try{
    // return (CloneableClass) super.clone();
    // }catch(CloneNotSupportedException e){}
    // return null;
    // }
    // }

    // This will return a SHALLOW copy. Meaning,
    // if there are mutable objects, e.g if I have a student class
    // which has a Course object as a param and it gets cloneableDemo
    // to another object, lets say X. Then if I change X.course.subject1
    // to something else, then that change will be shown in the original
    // object as well. So the reference is copied.
    // Deep cloning solves this issue by creating an entire new object.
}
