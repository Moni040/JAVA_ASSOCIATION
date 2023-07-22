package com.gqt.entities;


//TARGET CLASS
public class Employee 
{
	private int empId;
	private String empName;
	
	//Has-a variable
	private Account acc;
	public Employee(int empId, String empName, Account acc) 
	{
		this.empId = empId;
		this.empName = empName;
		this.acc = acc;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void disp() 
	{
		System.out.println("Employee details are:");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println("The Account details are:");
		System.out.println(acc.getAccId());
		System.out.println(acc.getAccName());
	}
	
	
}
