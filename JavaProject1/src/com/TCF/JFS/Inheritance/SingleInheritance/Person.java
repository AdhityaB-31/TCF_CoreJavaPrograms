package com.TCF.JFS.Inheritance.SingleInheritance;

public class Person {
	private String name;
	private int age;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println("Person Details \n\tPerson_Name=" + name + "\n\tPerson_Age=" + age + "\n\tPerson_Address=" + address+"\n");
	}
	
}
