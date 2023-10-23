//program to define employee service interface for
package org.tnsif.layers.service;
import java.sql.SQLException;

import java.util.List;

import org.tnsif.layers.entity.Employee;

public interface IEmployeeService {
	int addEmployee(Employee emp)throws SQLException;
	
	int deleteEmployeeByeEmpNo(int empNo)throws SQLException;
	
	int updateEmployeeByEmpNo(int empNo,Employee emp)throws SQLException;
	
	List<Employee>getAllEmployyees()throws SQLException;
	

}
