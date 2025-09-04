package com.TCF.JFS.Encapsulation;

public class Customer {
	private int cid;
	private String cname;
	private String ccity;
	
	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getCcity() {
		return ccity;
	}
	
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}

	@Override
	public String toString() {
		return "Customer Details [Customer_ID=" + cid + ", Customer_Name=" + cname + ", Customer_City=" + ccity + "]";
	}
	
}
