package com.TCF.JFS.Inheritance.SingleInheritance;

public class StudentDemo {
	public static void main(String[] args) {
		Student stud1=new Student();
		stud1.setName("Adhitya");
		stud1.setAge(20);
		stud1.setAddress("\tNo1,\n\t\t\tNew Street,\n\t\t\tSedarapet,\n\t\t\tPuducherry.");
		stud1.setSid(101);
		stud1.setSdept("Information Technology");
		stud1.setSfees("62,500");
		stud1.show();
		
	}
}
