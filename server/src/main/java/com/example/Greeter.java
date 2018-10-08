package com.example;

/**
 * This is a class.
 */
public class Greeter {

	private String coles = "javiro";

	public Greeter() {

	}

	/**
	*@param alguien the name de alg
	*@return greeter string
	*/
	public String greet(String alguien) {
	  	return String.format("hola elenote, %s", coles);
	  }

	/**
	*@param somenone the name de alg
	*@return greeting string
	*/
	public final String greeting(String someone) {
	    return String.format("Hello, %s!", someone);
	  }
}
