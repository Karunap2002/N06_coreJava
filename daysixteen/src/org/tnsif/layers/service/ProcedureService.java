package org.tnsif.layers.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.tnsif.jdbc.mvc.DBUtil;

public class ProcedureService {
	Statement st;
	Connection cn;
	public ProcedureService() throws SQLException
	{
		cn=DBUtil.getCn();
		st=cn.createStatement();
	}
	public int updateSalary()throws SQLException
	{
		int n=0;
		if(st.execute("{call updateSalary()}")==false)
		{
			n=st.getUpdateCount();
		}
		return n;
	}
    public int deleteStudent(float per)throws SQLException
    {
    	int n=0;
    	if(st.execute("{call updateStudent(55)}")==false)
    	{
    		n=st.getUpdateCount();
    	}
    	return n;
    }
}
