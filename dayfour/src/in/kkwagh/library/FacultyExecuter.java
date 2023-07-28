//program to demonstrate on access specifier
//driver class
package in.kkwagh.library;
import in.bkcmet.library.Library;

public class FacultyExecuter {

	public static void main(String[] args) {
	Library l=new Library();	
	l.libraryName="Bhujbal Library";
	l.displayPublic();
	
	/* user id and display private method is private .so we cannot access it in other packages or class we can access them only in same class*/
	//l.userId=1234L;
    //l.displayPrivate();
	
	/*booksname and displaydefault method is default,
	 * we cant accss into another package,only we can access it within same package */
	 
	//l.booksName
    // l.displayDefault();
	}

}
