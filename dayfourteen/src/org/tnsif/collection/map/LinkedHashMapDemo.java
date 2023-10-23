package org.tnsif.collection.map;
import java.util.*;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
	LinkedHashMap<String,Integer> person=new LinkedHashMap<String,Integer>();	
	person.put("karunap@gmail.com", 101);
	person.put("sakshir@gmail.com", 106);
	person.put("Snehal233@gmail.com", 107);
	person.put("kunal34@gmail.com", 200);
	person.put("Snehal233@gmail.com",500);
	System.out.println(person);
	

	
	LinkedHashMap<Student,String> stud=new LinkedHashMap<Student,String>();	
	stud.put(new Student(101,"aaa",56),"Mumbai");
	stud.put(new Student(102,"bbb",96),"Pune");
	stud.put(new Student(103,"ccc",90),"Pune");
	stud.put(new Student(104,"ddd",86),"Nashik");
	
Comparator<Student>comp=(c1,c2)->{
		
		return c1.getName().compareTo(c2.getName());
		
		
	};
	

	System.out.println(stud);
	

	}

}
