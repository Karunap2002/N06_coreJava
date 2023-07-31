//use of this keyword in constructor
package org.tnsif.thisdemo;

class Bank
{
	long accNo;
	
	Bank(long accNo)
	{
		this.accNo=accNo;
	}
	void display()
	{
		
		System.out.println(accNo);
	}
}

public class ThisDemo2 {

	public static void main(String[] args) {
		Bank b=new Bank(123456);
		b.display();

	}

}
