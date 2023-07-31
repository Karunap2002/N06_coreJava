//Program to demonstrate use of this keywords in methods
package org.tnsif.thisdemo;
class Director
{
	String name;
	void print()
	{
		this.name="Sakshi";
		display(name);
	}
	void display(String name)
	{
		System.out.println("director name="+name);
	}
}
public class ThisDemo4 {

	public static void main(String[] args) {
	Director d=new Director();
	d.print();
	d.display("Sunil Datt");

	}

}
