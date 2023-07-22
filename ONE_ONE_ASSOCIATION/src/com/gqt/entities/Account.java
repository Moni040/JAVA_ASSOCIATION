package com.gqt.entities;


// DEPENDENT CLASS
public class Account 
{
	private int accId;
	private String accName;
	public Account(int accId, String accName) 
	{
		this.accId = accId;
		this.accName = accName;
	}
	public int getAccId() {
		return accId;
	}
	public String getAccName() {
		return accName;
	}
	
}
