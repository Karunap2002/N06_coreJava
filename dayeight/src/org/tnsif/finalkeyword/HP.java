package org.tnsif.finalkeyword;

public class HP extends Laptop {
	final String processor="Intel I7";
	
	
	//we cant override final method
   /* void display()
    {
    	System.out.println(processor);
    }*/
	void display(String processor)
	{
		System.out.println(processor);	
	}

}
