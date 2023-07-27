package org.tnsif.multilevel;

public class TeamLead extends Manager {
	
	private String leadName;
	private String projectName;
	
	//getters and setters
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	//parameterized constructor
	public TeamLead(String deptname, String name, int empID,String leadName,String projectName) {
		super(deptname, name, empID);
		
		this.leadName=leadName;
		this.projectName=projectName;
		// TODO Auto-generated constructor stub
	}
	
	//toString() method
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", projectName=" + projectName + ", getDeptname()=" + getDeptname()
				+ ", getName()=" + getName() + ", getEmpID()=" + getEmpID() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
