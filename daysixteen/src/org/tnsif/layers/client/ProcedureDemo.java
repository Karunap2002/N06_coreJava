package org.tnsif.layers.client;

import java.sql.SQLException;

import org.tnsif.layers.service.ProcedureService;

public class ProcedureDemo {

	public static void main(String[] args) {
		try {
			int n;
			ProcedureService service=new ProcedureService();
			n=service.updateSalary();
			System.out.println(n>0?n+"employee(s) salary incremented":"no record  available");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
