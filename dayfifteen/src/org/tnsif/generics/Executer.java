package org.tnsif.generics;

public class Executer {

	public static void main(String[] args) {
		Integer a[]= {10,40,50};
		String b[]= {"Python","Java","C","C++"};
		Double price[]= {10.25,12.40,50.0};
		ArrayOperations.display(a);
		System.out.println("-----------------------------------------");
		ArrayOperations.display(b);
		System.out.println("-----------------------------------------");
		ArrayOperations.display(price);
		System.out.println("-----------------------------------------");
		Student st[]=new Student[] {new Student(1,"Karuna"),new Student(23,"Sakshi"),new Student(4,"Snehal")};
		ArrayOperations.display(st);
		System.out.println("-------------------Sorting-------------------");
		ArrayOperations.sortArray(a);
		ArrayOperations.display(a);
		System.out.println("-----------------------------------------");
		ArrayOperations.sortArray(b);
		ArrayOperations.display(b);
		System.out.println("-----------------------------------------");
		ArrayOperations.sortArray(price);
		ArrayOperations.display(price);

	}

}
