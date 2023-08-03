//program to demonstrate final method
package org.tnsif.finalkeyword;

//parent class
//final class cannot be inherit from child class
public class Laptop {
    final String processor="Intel I5";
    final void display()
    {
    	System.out.println(processor);
    }
}
