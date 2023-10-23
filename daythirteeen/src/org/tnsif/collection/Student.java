package org.tnsif.collection;


public class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private float per;
	
	public Student()
	{
		super();
	}
	
	
	public Student(int roll, String name, float per) {
		super();
		this.roll = roll;
		this.name = name;
		this.per = per;
	}


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", per=" + per + "]";
	}


	


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}


	

}
