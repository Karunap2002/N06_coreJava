package org.tnsif.collection;
import java.util.*;
public class UserDefinedDemo {

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<Student>();
		list.add(new Student(1,"Karuna",67));
		list.add(new Student(2,"Sakshi",87));
		list.add(new Student(3,"Rakhi",69));
		list.add(new Student(4,"Dipti",88));
		list.add(new Student(5,"Renuka",55));
		System.out.println(list);
		Collections.sort(list);
		System.out.println("after sorting :"+list);
		
        ArrayList<Stud> studList=new ArrayList<Stud>();
		
		studList.add(new Stud(1,"Ankush",67));
		studList.add(new Stud(2,"Ritesh",71));
		studList.add(new Stud(3,"Mahesh",56));
		studList.add(new Stud(4,"Suresh",63));
		studList.add(new Stud(5,"Piyush",73));
		System.out.println(studList);
		
		//Using implementable class of Comparator interface
		Collections.sort(studList,new SortByName());
		System.out.println("After Sorting on Name\n"+studList);
		
		//Using implementable class of Comparator interface
		Collections.sort(studList,new SortByPer());
		System.out.println("After Sorting on Per\n"+studList);
		
		//Lambda Expression
		Comparator<Stud> comp=(s2,s1)->{return s1.getName().compareTo(s2.getName());};
		Collections.sort(studList,comp);
		System.out.println("After Sorting on Descending order of Name\n"+studList);

	}

}
