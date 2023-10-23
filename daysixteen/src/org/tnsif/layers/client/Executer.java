package org.tnsif.layers.client;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.tnsif.layers.entity.Employee;
import org.tnsif.layers.service.EmployeeServiceImpl;

public class Executer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,n;
		int empno;
		String empname;
		float salary;
		Employee emp;
		List<Employee>empList;
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		try {
		do
		{
			System.out.println("--------------Employee---------------");
			System.out.println("1.Add Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Display All Employee");
			System.out.println("5.close");
			System.out.println("Enter your choice(1...5):");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("------Enter employee details:--------");
				System.out.println("Employee no:");
				empno=sc.nextInt();
				System.out.println("Employee name:");
				empname=sc.next();
				System.out.println("Employee Salary:");
				salary=sc.nextFloat();
				emp=new Employee(empno,empname,salary);
				n=service.addEmployee(emp);
				if(n>0)
				 System.out.println(n+"Employee(s) added....");
				else
					 System.out.println("Insertion failed....");	
				break;
			case 2:
				System.out.println("Employee NO to delete a record");
				empno=sc.nextInt();
				
				n=service.deleteEmployeeByeEmpNo(empno);
				
				break;
			case 3:
				System.out.println("Employee NO to modify a record");
				empno=sc.nextInt();
				System.out.println("enter updated employee name:");
				empname=sc.next();
			    System.out.println("enter updated salary:");
			    salary=sc.nextFloat();
			    emp=new Employee(empno,empname,salary);
				n=service.updateEmployeeByEmpNo(empno,emp);
				System.out.println(n>0? n+"employees updated" :"Modification failed");
				break;
			case 4:
				empList=service.getAllEmployyees();
				System.out.println(empList);
				break;
			case 5:
				break;
			   default:System.out.println("default case");
			}
			
		}
		while(ch<5);
		
			
		}
      catch(SQLException e)
		{
    	  e.printStackTrace();
		}
	}

}
