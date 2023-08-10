package org.tnsif.sinledimensionalarray;

public class ArrayOfObjectsdemo {

	public static void main(String[] args) {
	Employee arr[]=new Employee[3];
	arr[0]=new Employee(101,"AAA",45000);
	arr[1]=new Employee(102,"BBB",45000.234);
	arr[2]=new Employee(103,"CCC",50000);
	
	for(int i=0;i<3;i++)
	{
		System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getSalary());
	}

	}

}
