package org.tnsif.set;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
	//unorder set	
	HashSet<Integer> hash=new HashSet<Integer>();	
	hash.add(4);
	hash.add(40);
	hash.add(24);
	hash.add(55);
	hash.add(31);
	System.out.println("First set:"+hash);
	
	HashSet<Integer> hash1=new HashSet<Integer>();	
	hash1.add(31);
	System.out.println(hash1.add(20));
	hash1.add(71);
	hash1.add(39);
	hash1.add(80);
	hash1.add(71);
	System.out.println(hash1.add(20));
	System.out.println("Second set: "+hash1);
	
	hash1.addAll(hash);//used for union
	System.out.println("Resultant set: "+hash1);
	
	hash1.clear();
	System.out.println("--------------------------------------");
	hash1.add(31);
	hash1.add(71);
	hash1.add(39);
	hash1.add(80);
	hash1.add(71);
	hash1.add(20);
	
	System.out.println("First set: "+hash);
	System.out.println("Second set: "+hash1);
	hash1.remove(hash); //difference
	System.out.println("Resultant set: "+hash1);
	
	System.out.println("--------------------------------------");
	System.out.println("First set: "+hash);
	System.out.println("Second set: "+hash1);
	hash1.retainAll(hash); //intersection
	System.out.println("Resultant set: "+hash1);

	}

}
