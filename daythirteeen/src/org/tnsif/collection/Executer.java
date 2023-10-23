//program to demonstrate heterogeneous list
package org.tnsif.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
public class Executer {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	List listOne=new ArrayList();
	listOne.add(10);
	listOne.add("Hello");
	listOne.add('c');
	listOne.add(6.5f);
	listOne.add(new Date());
	
	System.out.println(listOne);
	Collections.sort(listOne);
	}

}
