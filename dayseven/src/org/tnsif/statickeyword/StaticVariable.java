package org.tnsif.statickeyword;
class Employee
{
	private int eid;
	private String ename;
	private static String cname="TNSIF";
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public static String getCname() {
		return cname;
	}
	public static void setCname(String cname) {
		Employee.cname = cname;
	}
	
	public void display()
	{
		System.out.println("empid=" + this.getEid()+ " "+"ename="+this.getEname()+" "+"comapny name="+this.getCname());
	}
	
	
	
}
public class StaticVariable {

	public static void main(String[] args) {
	Employee e=new Employee();
	e.setEid(1);
	e.setEname("Karuna Pawar");
	e.display();
	
	Employee e1=new Employee();
	e.setEid(2);
	e.setEname("Snehal Darade");
	e.display();
	

	}

}
