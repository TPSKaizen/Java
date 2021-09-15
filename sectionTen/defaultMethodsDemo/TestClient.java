package sectionTen.defaultMethodsDemo;

/**
 * @author Client Inc.
 */
import java.util.*;

public class TestClient {
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		// Interfaces demo
		C c = new X();
		/*
		 * c.foo(); c.bar(); c.foobar();
		 */

		// Clone demo
		/*
		 * C clone = ((X)c).clone(); if (clone != c) {
		 * System.out.println("Clone created!!"); }
		 */

		// default method demo
		c.go();
	}

	/*
	 * If we have an implementation of a method go() in BOTH an implemented
	 * interface and an extended class then THE CLASS gets higher precedence.
	 */

	/* There is a way to force usage of the interface implementation */
	// To do this we have to do :
	// C.super.go(); This is for invoking the default method in the interface when
	// there is a clash with a class implementation

	// We cannot do A.super.go(), because A is the superclass of C so that would be
	// accessing a grandparent's default method
}