//
package org.ttnsis.decisionmaking;
import java.util.*;
public class SwitchExecuter {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter NO for song:");
	int songno=s.nextInt();	
    switch(songno)
    {
    case 1:
    	System.out.println("Waka Waka");
    	break;
    	
    case 2:
    	System.out.println("Taki Taki");
    	break;
    	
    case 3:
    	System.out.println("Jay Shree Ram");
    	break;
 	
    default:
    	System.out.println("O Antava");
 	
    }
    s.close();
	}

}
