/**
 * Info about this package doing something for package-info.java file.
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

	public Greeter() {

	}

	/**
	 * @param someone
	 * @return String
	 */
	public final String greet(final String someone) {
		return String.format("Hello, %s!", someone);
	}	
}
