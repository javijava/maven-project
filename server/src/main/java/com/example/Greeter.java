package com.example;

/**
 * This is a class.
 */
public class Greeter {

private String coles = "javiro";

public Greeter() {

}

public String Greeter(String alguien) {
  	return String.format("hola elenote, %s", coles);
  }

public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
