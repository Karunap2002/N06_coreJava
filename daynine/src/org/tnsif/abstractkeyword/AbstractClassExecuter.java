package org.tnsif.abstractkeyword;

public class AbstractClassExecuter {
	public static void main(String args[])
	{
		//Sandwitch s=new Sandwich()
		//we can't create object for abstract class
		CheeseCornSandwich c=new CheeseCornSandwich();
		c.prepare();
		c.showRecipie();
	}

}
