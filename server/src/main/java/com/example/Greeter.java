package com.example;

/**
 * This is a class.
 */
public class Greeter {

private String coles = "javiro";
  /**
   * This is a constructor.
   */
  public Greeter() {

  }

public String Greeter(String alguien) 

{
  	return String.format("hola elenote, %s", alguien);
  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
