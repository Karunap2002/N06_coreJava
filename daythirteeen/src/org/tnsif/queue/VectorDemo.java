package org.tnsif.queue;
import java.util.Collections;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(23);
		v.add(45);
		v.add(50);
		v.add(22);
		v.add(99);
		
		System.out.println(v);
		
		Collections.sort(v);
		System.out.println(v);
		
		

	}

}
