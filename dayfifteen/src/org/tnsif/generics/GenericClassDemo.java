package org.tnsif.generics;

public class GenericClassDemo {

	public static void main(String[] args) {
	Repo<Integer>obj=new Repo<Integer>();
	obj.setData(23);
	System.out.println(obj.getData());
	
	Repo<String>obj2=new Repo<String>();
	obj2.setData("aaa");
	System.out.println(obj2.getData());
	
	Repo<Student>obj3=new Repo<Student>();
	obj3.setData(new Student(1,"Karuna"));
	System.out.println(obj3.getData());

	}

}
