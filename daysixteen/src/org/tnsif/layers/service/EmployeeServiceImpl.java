package org.tnsif.layers.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.ArrayList;
import java.util.List;

import org.tnsif.layers.doa.DBUtil;
import org.tnsif.layers.entity.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
   PreparedStatement pst;
   Connection cn;
   public EmployeeServiceImpl()
   {
	   cn=DBUtil.getCn();
   }
	@Override
	public int addEmployee(Employee emp) throws SQLException {
		pst=cn.prepareStatement("insert into Employee values(?,?,?)");
		pst.setInt(1, emp.getEmpNo());
		pst.setString(2, emp.getEmpName());
		pst.setFloat(3, emp.getSalary());
		int n=pst.executeUpdate();
		return n;
	}

	@Override
	public int deleteEmployeeByeEmpNo(int empNo)throws SQLException {
		pst=cn.prepareStatement("Delete from Employee Where empNo=?");
		pst.setInt(1, empNo);
		int n=pst.executeUpdate();
		return n;
	}

	@Override
	public int updateEmployeeByEmpNo(int empNo, Employee emp)throws SQLException {
		pst=cn.prepareStatement("update Employee set empName=?,salary=? where empNo=?");
		pst.setString(1, emp.getEmpName());
		pst.setFloat(2, emp.getSalary());
		pst.setInt(3, empNo);
		int n=pst.executeUpdate();
		return n;
	}

	@Override
	public List<Employee> getAllEmployyees() throws SQLException{
		int empno;
		String empname;
		float salary;
		Employee emp;
		ArrayList<Employee>empList=new ArrayList<Employee> ();
		pst=cn.prepareStatement("select * from employee");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			empno=rs.getInt(1);
			empname=rs.getString(2);
			salary=rs.getFloat(3);
			emp=new Employee(empno,empname,salary);
			empList.add(emp);
			
		}
		
		rs.close();
		return empList;
	}

	
}
