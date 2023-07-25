//program to demonstrate on default and parameterized constructor
package org.tnsif.classobject;
public class Library{
 
	public long noOfBooks;
	public String authorName;
	public Library()
	{
	
    System.out.println("Default Constructor");
	}
	public Library(long noOfBooks, String authorName) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		System.out.println("Parametarized Constructor");
	}
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + "]";
	}
	
	

		
	



}

