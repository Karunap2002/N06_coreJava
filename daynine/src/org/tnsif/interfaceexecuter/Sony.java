//program to demonstrate interface
package org.tnsif.interfaceexecuter;

public interface Sony {
/*by default all the variables of interfaces are public static final*/
  int noOfChannels=8;
  //by default all the method inside an interface is an abstract method
  
  void display();
  /*java 8 provides static and default method inside an interface*/
  //static method
  static void accept()
  {
	  System.out.println("static method");
  }
  
  //default method
  default void show()
  {
	  System.out.println("default method");
	  System.out.println(noOfChannels);
  }
  

}
