//program to demonstrate on this keyword is used to refer the current instance of class
package org.tnsif.thisdemo;
class Account
{
	long accNo;
	void setData(long accNo)
	{
		this.accNo=accNo;
		
	}
	void display()
	{
		
		System.out.println(accNo);
	}
}
public class ThisDemo1 {

	public static void main(String[] args) {
		Account a=new Account();
		a.setData(1234567L);
		a.display();
		
	}

}
