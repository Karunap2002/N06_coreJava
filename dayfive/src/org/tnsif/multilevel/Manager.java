package org.tnsif.multilevel;
// parent class(A)
public class Manager {
	private String deptname;
	private String name;
	private int empID;
	
	//getters and setters
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	//ToString method
	@Override
	public String toString() {
		return "Manager [deptname=" + deptname + ", name=" + name + ", empID=" + empID + "]";
	}
	
	//parameterized constructor
	public Manager(String deptname, String name, int empID) {
		super();
		this.deptname = deptname;
		this.name = name;
		this.empID = empID;
	}
	
	
	
	
	
	

}
