//Program to demonstrate on final variable
package org.tnsif.finalkeyword;

public class FinalKeyword {
      //final int x;
	//final variable must initialize during declaration
	final float SALARY=45000.00f;
	
	void print()
	{
		//we cant change value of final variable
		//SALARY=23000
		System.out.println("salary="+SALARY);
	}
}
