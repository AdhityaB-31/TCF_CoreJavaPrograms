package com.TCF.JFS.Inheritance.SingleInheritance;

public class Student extends Person{
	private int sid;
	private String sdept;
	private String sfees;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public String getSfees() {
		return sfees;
	}
	public void setSfees(String sfees) {
		this.sfees = sfees;
	}
	
	public void show() {
		super.show();
		System.out.println("Student Details \n\tStudent_Name=" + super.getName() + "\n\tStudent_Age=" + super.getAge() + "\n\tStudent_Address=" + super.getAddress()+"\n\tStudent_Id=" + sid + "\n\tStudent_Dept=" + sdept + "\n\tStudent_Fees=" + sfees + "\n");
	}
	
	
}
