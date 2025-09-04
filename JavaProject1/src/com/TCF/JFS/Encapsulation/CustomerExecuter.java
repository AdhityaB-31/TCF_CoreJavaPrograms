package com.TCF.JFS.Encapsulation;

public class CustomerExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1=new Customer();
		Customer cus2=new Customer();
		Customer cus3=new Customer();
		
		cus1.setCid(1);
		cus1.setCname("Adhitya");
		cus1.setCcity("Puducherry");
		System.out.println(cus1); 	//object printing invoke toString() method
		
		cus2.setCid(2);
		cus2.setCname("Sriram");
		cus2.setCcity("Thindivanam");
		System.out.println(cus2); 	//object printing invoke toString() method
		
		
		cus3.setCid(3);
		cus3.setCname("Sree");
		cus3.setCcity("Puducherry");
		System.out.println(cus3);	//object printing invoke toString() method
	}

}
