package org.tnsif.jdbc;

import java.sql.*;

//import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded Successfully");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc","root","Welcome");
		System.out.println("Connection established successfully Successfully");
		//statement use for static query;
		Statement st=cn.createStatement();
		//Retrive data from student table;
		ResultSet rs=st.executeQuery("select*from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getFloat(3));
		}
		rs.close();
		
		//inserting data into student table
		int n=st.executeUpdate("Insert into Student values(8,'Ketan',55)");
		if(n==1)
		{	
			System.out.println("record inserted successfully......");
		}
		else
		{	
			System.out.println("record not inserted successfully");
		}
		
		//delete student whose name stats with k
		n=st.executeUpdate("delete from Student where name like'K%'");
		if(n>=1)
		{	
			System.out.println(n+ "record deleted successfully......");
		}
		else
		{	
			System.out.println("record not deleted successfully");
		}
		
		//update student percentage increased by 5
		n=st.executeUpdate("update Student set per=per+5 where per<96");
		if(n>=1)
		{	
			System.out.println(n+ "record updated successfully......");
		}
		else
		{	
			System.out.println("No such record found ");
		}
		//terminate the programme
		;
		cn.close();
		}
		
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
