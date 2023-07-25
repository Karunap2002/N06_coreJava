//driver class
////program to demonstrate on class and objects
package org.tnsif.classobject;

public class EmployeeExecuter {

	public static void main(String[] args) {
	Employee e=new Employee();
	e.eId=123;
	e.empName="karuna";
	e.salary=50000;
	e.department="Computer";
    e.display();
	}

}
