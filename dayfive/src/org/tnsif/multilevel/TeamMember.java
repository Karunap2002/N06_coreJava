package org.tnsif.multilevel;

public class TeamMember extends TeamLead {
	
	private int size;
	private int duration;
	
	

	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public TeamMember(String deptname, String name, int empID, String leadName, String projectName,int size,int duration) {
		super(deptname, name, empID, leadName, projectName);
		
		this.size=size;
		this.duration=duration;
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}



	
	
	

}
